package ch10_클래스상속과다형성.scanner6_1;

// CMA 계좌
public class CMAAccount extends Account {
	double dayRate;		// 매일 이자율

	public CMAAccount(String ano, String owner, int balance, double dayRate) {
		super(ano, owner, balance);
		this.dayRate = dayRate;
	}
	
	@Override
	public String toString() {
		String str = "매일이자율:" + dayRate;
		return "CMA계좌 -> " + super.toString() + ", " + str;
	}
}
