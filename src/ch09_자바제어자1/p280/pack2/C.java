package ch09_자바제어자1.p280.pack2;

import ch09_자바제어자1.p280.pack1.A; //패키지 import
//다른 패키지에 있는 클래스를 import하기 위해서 import문을 적어라..  시험문제
//클래스 접근제어자의 public이 없으면 import자체가 불가능 함

public class C {
	public void print() {
		A a = new A();
		
		System.out.print(a.a + " ");
		//System.out.print(a.b + " "); //오류
		//System.out.print(a.c + " "); //오류
		//System.out.print(a.d + " "); //오류
	}
}
