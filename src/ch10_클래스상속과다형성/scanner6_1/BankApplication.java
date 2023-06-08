// ScannerExample_6_1

package ch10_클래스상속과다형성.scanner6_1;

import java.util.Scanner;

public class BankApplication {
	
	public static void main(String[] args) {
		Bank bank = new Bank(100);
		//스택 영역에 bank 라는 변수가 생기고 그 변수는 힙 영역에 존재하는 bank 객체를 가리키고 있음
		//또한 Bank 클래스 내에 존재하는 accountArray 라는 배열객체가 있는데, Bank 객체 안에 accountArray라는 변수 있고
		//그 배열객체는 다시 초기화가 되지 않은 null이라는 값을 갖고 있는 칸이 나눠져 있는 배열 객체를 가리키고 있음
		Scanner scanner = new Scanner(System.in);
		// scanner 라는 변수가 Scanner 객체를 가리키고 있음
		boolean run = true;
		//스택 영역에 run 이라는 변수에 true 값이 들어 있음
		//사용자가 보통 계좌 생성을 하면, Bank 클래스에 있는 creatCheckAccount() 메소드가 스택영역에 소환되고 newAccount 라는 변수가
		//큰 CheckAccount 객체를 힙 영역에 가리키고 있다가 생성이 완료되면 newAccount는 x표 하면되고
		//accountArray가 가리키고 있는 칸이 나눠져 있는 배열객체의 0번 인덱스가 CheckAccount 객체를 가리키고
		//CheckAccount 객체 안에는 작은 Account 클래스 안에 선언되어있는 ano , owner, balance 라는 필드안에 입력한 값이 들어가게 되고
		//큰 CheckAccount 안에는 속하지만 그 안에 작은 Account에는 속하지 않는 cardNo라는 필드에도 입력한 값이 들어가게 됨
		//하지만 여기서 ano, owner는 String 객체를 이용한 필드이기 때문에 다시 ano와 owner는 CheckAccount 객체 밖에 존재하는 String객체
		//안에 "1" 또는 "lee"와 같이 저장되어있고 ano와 owner는 그것을 가리키고 있음
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("메뉴선택: ");
			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) { // 계좌생성
				System.out.println("-------------------------------");
				System.out.println("1.보통계좌 | 2.저축계좌 | 3.CMA계좌");
				System.out.println("-------------------------------");
				System.out.print("계좌종류선택: ");
				int kind = Integer.parseInt(scanner.nextLine());
	
				System.out.print("계좌번호: "); 
				String ano = scanner.nextLine();
				System.out.print("계좌주: "); 
				String owner = scanner.nextLine();
				System.out.print("초기입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				if(kind == 1) { // 보통 계좌(Check Account)
					System.out.print("카드번호: ");
					int cardNo = Integer.parseInt(scanner.nextLine()); 
					
					bank.createCheckAccount(ano, owner, balance, cardNo);
				} else if(kind == 2) { // 저축 계좌(Save Account)
					System.out.print("이자율: ");
					double interestRate = Double.parseDouble(scanner.nextLine());
					System.out.print("기간: ");
					int period = Integer.parseInt(scanner.nextLine());
					
					bank.createSaveAccount(ano, owner, balance, interestRate, period);
				} else if (kind == 3) { // CMA 계좌(CMA Account)
					System.out.print("매일이자율: ");
					double dayRate = Double.parseDouble(scanner.nextLine());
					
					bank.createCMAAccount(ano, owner, balance, dayRate);
				}	
			} else if(selectNo == 2) { // 계좌목록
				bank.accountList();
			} else if(selectNo == 3) { // 예금
				System.out.print("계좌번호: "); 
				String ano = scanner.nextLine();
				System.out.print("예금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				Account account = bank.findAccount(ano);
				if(account == null) {
					System.out.println("결과: 계좌가 없습니다.");
					return;
				}
		
				account.deposit(money); 
				System.out.println("결과: 예금이 성공되었습니다.");
			} else if(selectNo == 4) { // 출금
				System.out.print("계좌번호: "); 
				String ano = scanner.nextLine();
				System.out.print("출금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				Account account = bank.findAccount(ano);
				if(account == null) {
					System.out.println("결과: 계좌가 없습니다.");
					return;
				}
				
				account.withdraw(money); 
				System.out.println("결과: 출금이 성공되었습니다.");
			} else if(selectNo == 5) { // 종료
				run = false;
			}
		} // while
	} // main
} // Bank 클래스
