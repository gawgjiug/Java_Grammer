package ch09_자바제어자1.p280.pack2;

import ch09_자바제어자1.p280.pack1.A;

public class D extends A {
	public void print() {
		// 자식 클래스는 부모 클래스 상속하므로 객체 생성 없이 접근 가능
		System.out.print(a + " ");
		System.out.print(b + " "); 
		//System.out.print(c + " "); //오류
		//System.out.print(d + " "); //오류
	}
}
