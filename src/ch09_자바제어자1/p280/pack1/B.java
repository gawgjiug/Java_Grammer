package ch09_자바제어자1.p280.pack1;
//같은 패키지에 있는 클래스를 사용할 땐 import가 필요없음

public class B {
	public void print() {
		A a = new A();
		
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");
		//System.out.print(a.d + " "); //오류 private 접근자로 설정되어있음
	}
}
