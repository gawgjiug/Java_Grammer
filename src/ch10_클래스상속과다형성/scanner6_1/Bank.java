package ch10_클래스상속과다형성.scanner6_1;

public class Bank {
	private Account[] accountArray;
	
	Bank(int accountNum) {
		accountArray = new Account[accountNum];
	}

	void createCheckAccount(String ano, String owner, int balance, int cardNo) {
		Account newAccount = new CheckAccount(ano, owner, balance, cardNo);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 보통 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	void createSaveAccount(String ano, String owner, int balance, double interestRate, int period) {
		Account newAccount = new SaveAccount(ano, owner, balance, interestRate, period);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 저축 계좌가 생성되었습니다.");
				break;
			}
		}		
	}

	void createCMAAccount(String ano, String owner, int balance, double dayRate) {
		Account newAccount = new CMAAccount(ano, owner, balance, dayRate);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: CMA 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	void accountList() {
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.println(account);	
			}
		}
	}

	Account findAccount(String ano) {
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
}
