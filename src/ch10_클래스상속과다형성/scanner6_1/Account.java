package ch10_클래스상속과다형성.scanner6_1;

public class Account {
	private String ano;		// 계좌번호
	private String owner;	// 소유자
	private int balance;	// 잔액
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano; }
	
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }

	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}

	@Override
	public String toString() {
		String str = "계좌번호:" + ano + ", " + 
					"소유자:" + owner + ", " + 
					"잔액:" + balance;
		return str;
	}
}
