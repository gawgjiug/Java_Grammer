// ScannerExample_6

package ch10_클래스상속과다형성.scanner6;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true; 
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("메뉴선택: ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) {
				System.out.println("-------------------------------");
				System.out.println("1.보통계좌 | 2.저축계좌 | 3.CMA계좌");
				System.out.println("-------------------------------");
				System.out.print("계좌종류선택: ");
				int kind = Integer.parseInt(scanner.nextLine());
				
				createAccount(kind);
				
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		} 
		System.out.println("프로그램 종료");
	} // main() 끝
	
	//계좌생성하기
	private static void createAccount(int kind) {
		System.out.print("계좌번호: "); 
		String ano = scanner.nextLine();
		System.out.print("계좌주: "); 
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account newAccount = null;

		if(kind == 1) {
			System.out.print("카드번호: ");
			int cardNo = Integer.parseInt(scanner.nextLine()); 
			newAccount = new CheckAccount(ano, owner, balance, cardNo);
		} else if (kind == 2) {
			System.out.print("이자율: ");
			double interestRate = Double.parseDouble(scanner.nextLine());
			System.out.print("기간: ");
			int period = Integer.parseInt(scanner.nextLine());
			newAccount = new SaveAccount(ano, owner, balance, interestRate, period);
		} else if (kind == 3) {
			System.out.print("매일이자율: ");
			double dayRate = Double.parseDouble(scanner.nextLine());
			newAccount = new CMAAccount(ano, owner, balance, dayRate);
		}
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록보기
	private static void accountList() {
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.println(account);	
			}
		}
	}

	//예금하기
	private static void deposit() {
		System.out.print("계좌번호: "); 
		String ano = scanner.nextLine();
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}

		account.deposit(money); 
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//출금하기
	private static void withdraw() {
		System.out.print("계좌번호: "); 
		String ano = scanner.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		
		account.withdraw(money); 
		System.out.println("결과: 출금이 성공되었습니다.");
	} 
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	} 
} // BankApplication 끝
