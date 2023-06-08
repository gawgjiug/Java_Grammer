package ch10_클래스상속과다형성.scanner6_1;

// 보통계좌
public class CheckAccount extends Account {
	private int cardNo;	// 직불카드 번호
	
	public CheckAccount(String ano, String owner, 
			int balance, int cardNo) {
		super(ano, owner, balance);
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		String str = "카드번호:" + cardNo;
		return "보통계좌 -> " + super.toString() + ", " + str;
	}
}
