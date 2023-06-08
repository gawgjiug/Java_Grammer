// 10.3 메소드 오버라이딩 - 메소드 오버로딩

package ch10_클래스상속과다형성.p336;

class A {
	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}
}
class B extends A {
	@Override
	void print1() {			// 메소드 오버라이딩
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {	// 메소드 오버로딩
		System.out.println("B 클래스 print2");
	}
}
public class MethodOverridingOverloading {
	public static void main(String[] args) {		
		A aa = new A();
		aa.print1(); 
		aa.print2(); 

		B bb = new B();
		bb.print1(); 
		bb.print2(); 
		bb.print2(3);
		System.out.println();

		A ab = new B();
		ab.print1(); 
		ab.print2(); 
	}
}
