// 10.2 객체의 타입 변환 - 선언 타입에 따른 사용 가능 멤버

package ch10_클래스상속과다형성.p323;

class A {
	int m=3;
	void abc() {
		System.out.println("A 클래스");
	}
}
class B extends A {
	int n=4;
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class PolymorphismTypeCasting2 {
	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a.m);
//		a.abc();

//		B b = new B();
//		System.out.println(b.m);
//		System.out.println(b.n);
//		b.abc();
//		b.bcd();

		A ab = new B();	// A 타입 선언에 의해 A 클래스 멤버만 사용 가능
		System.out.println(ab.m);
		ab.abc();
		B bb = (B)ab;
		bb.bcd();
	}
}
