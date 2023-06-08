// 8. 다음과 같이 인스턴스 멤버와 정적 멤버를 
//    포함하고 있는 클래스 A와 B가 있다. 
//    다음 실행 코드의 결과를 쓰시오.

package ch10_클래스상속과다형성.probs.prob08;

class A {
	int m = 2;
	static int n = 4; 
	void method1() {
		System.out.println("A 클래스 instance method");
	}
	static void method2() {
		System.out.println("A 클래스 static method");
	}
}
class B extends A {
	int m = 6;
	static int n = 8;
	void method1() {
		System.out.println("B 클래스 instance method");
	}
	static void method2() {
		System.out.println("B 클래스 static method");
	}
}

public class Test {

	public static void main(String[] args) {
		A ab = new B();
		System.out.println(ab.m);
		System.out.println(ab.n);
		ab.method1();
		ab.method2();
	}
}
