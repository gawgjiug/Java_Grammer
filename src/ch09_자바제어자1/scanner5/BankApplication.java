// ScannerExample_5

package ch09_자바제어자1.scanner5;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	//accountArray라는 변수가 스택영역도 힙영역도 아닌 위의 공간에서(둘은 네모칸 안에 동시에 존재하고,
	//BankApplication이라는 클래스의 묶여있음)
	//힙 영역에 존재하는  배열 객체를 가리키고 있고 그 사이즈는 100임 *static이기 때문에
	//scanner 변수도 마찬가지임




	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		//스택영역에 run이라는 변수에 true 들어가 있고
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("메뉴선택: ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) {
				createAccount(); //static
				//1을 입력하는 순간 메소드를 호출하고 그 메소드는 newAccount(스택영역)라는 이름으로 (힙영역 , ano,owner가 존재하는)Account 객체를 생성함

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
	} // main
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호: "); 
		
		String ano = scanner.nextLine();
		System.out.print("계좌주: "); 
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account newAccount = new Account(ano, owner, balance);
		//객체 생성하고 ano,owner,balance 값을 입력하면 balance는 int형이라 바로 값이 저장되지만 String 객체형태인 ano와 owner는
		//따로 String 객체를 생성하고 거기에 저장된 값을 ano와 owner가 가리키고 있음
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				//아까 생성한 accountArray 배열객체의 0번인덱스가 방금 생성한 newAccount 객체 가리키고 있음
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	//예금하기
	private static void deposit() {
		System.out.println("---");
		System.out.println("예금");
		System.out.println("---");
		System.out.print("계좌번호: "); 
		String ano = scanner.nextLine();
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}

		account.deposit(money); // = account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("---");
		System.out.println("출금");
		System.out.println("---");
		System.out.print("계좌번호: "); 
		String ano = scanner.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		
		account.withdraw(money); // = account.setBalance(account.getBalance() - money);
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
} // BankApplication
