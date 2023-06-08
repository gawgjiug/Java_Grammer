package ch09_자바제어자1.probs.prob03.pack02;

import ch09_자바제어자1.probs.prob03.pack01.A;


public class D extends A {
	void def() {
		System.out.println(this.a);
        System.out.println(this.b);
        //c는 다른 패키지여서 사용 할 수 없고
        //private은 사용불가
	}
}
