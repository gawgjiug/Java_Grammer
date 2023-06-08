// 7.4 this 키워드와 this() 메소드 - this() 메소드
// - 자기 자신 클래스의 다른 생성자를 호출하는 메소드
//   - 중복 코드 제거
// - 생성자 내부에서만 사용 가능하며 생성자의 첫줄에 위치

package ch07_클래스내부구성요소.p256;

class A {
	int m1, m2, m3;
	A() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
	}
	A(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
	}
	A(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
	}
	A(int a, int b, int c) {
		m1 = a;
		m2 = b;
		m3 = c;
	}
	void print() {
		System.out.print(m1 + " " + m2 + " " + m3);	
		System.out.println();
	}	
}
class B {
	int m1, m2, m3;
	B() {
		this(1, 2, 3);	// 반드시 생성자 첫 줄에 사용
	}
	B(int a) {
		this(a, 2, 3);
	}
	B(int a, int b) {
		this(a, b, 3);		
	}
	B(int a, int b, int c) {
		m1 = a;
		m2 = b;
		m3 = c;
	}
	void print() {
		System.out.print(m1 + " " + m2 + " " + m3);	
		System.out.println();
	}	
}

public class ThisMethod {
	
	public static void main(String[] args) {
		// this() 미사용
		A a1 = new A(); 
		A a2 = new A(10);
		A a3 = new A(10,20);	
		A a4 = new A(10,20,30);
		a1.print();
		a2.print();
		a3.print();
		a4.print();

		// this() 사용
		B b1 = new B(); 
		B b2 = new B(10);
		B b3 = new B(10,20);		
		B b4 = new B(10,20,30);		
		b1.print();
		b2.print();
		b3.print();
		b4.print();
	}
}
