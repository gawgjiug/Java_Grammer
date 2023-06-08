// 10.4 인스턴스 필드와 정적 멤버의 오버라이딩
// - 인스턴스 메소드만 오버라이딩
// - 인스턴스 필드와 정적 멤버는 오버라이딩 아님

package ch10_클래스상속과다형성.p340;

class A {
	int m = 3;
	static int s = 3;
	static void print() {
		System.out.println("A 클래스");
	}
}
class B extends A {
	int m = 4;
	static int s = 4;
	static void print() {
		System.out.println("B 클래스");
	}
}

public class OverlapInstanceField {	
	public static void main(String[] args) {
		// 인스턴스 필드 중복 X
//		A aa = new A();
//		B bb = new B();
//		A ab = new B();
//		System.out.println(aa.m);//	3
//		System.out.println(bb.m);//4
//		System.out.println(ab.m);//3 재정의 X
		
		// 정적 필드 중복 X
//		A aa = new A();
//		B bb = new B();
//		A ab = new B();
//		System.out.println(aa.s); 	//3
//		System.out.println(bb.s);   //4
//		System.out.println(ab.s); //3 재정의 X
		
		// 정적 메소드 중복 X
		A aa = new A();
		B bb = new B();
		A ab = new B();
		aa.print();
		bb.print();
		ab.print(); // 재정의 X
	}
}
