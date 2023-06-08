// 1. 클래스 A가 다음과 같이 정의돼 있다. 
//    다음 코드의 출력값을 쓰시오.

package ch07_클래스내부구성요소.probs.prob01;

class A {
	boolean a;
	int b;
	double c;
	String d;

	void abc() {
		System.out.println(b + c);
		System.out.println(c + d);
		System.out.println(d + a);
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		System.out.println();
		a.abc();
	}
}
