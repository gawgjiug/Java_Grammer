package ch07_클래스내부구성요소.p247;
//생성자 메소드 3개 일반 메소드 0개

public class D {
	public D() {
		System.out.println("첫번째 생성자 ");
	}
	public D(int i) {
		System.out.println("두번째 생성자 " + i);
	}
	public D(int i, int j) {
		System.out.println("세번째 생성자 " + i + " " + j);
	}
}
