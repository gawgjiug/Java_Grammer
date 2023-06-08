package ch09_자바제어자1.p280.pack1;

public class A {
	public int a = 1;
	protected int b = 2;
	int c = 3;	// default 접근 제어자 자동 설정 같은 페이지 에서만 접근 가능
	private int d = 4;
	
	public void print() {
		System.out.print(a + " "); // 동일 클래스에서 모든 필드 접근 가능
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.println(d);
	}
}
