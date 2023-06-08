// 7.4 this 키워드와 this() 메소드 - this 키워드
// - 자기 자신 객체를 가리키는 참조 변수
// - 클래스 내부에서 멤버(필드, 메소드) 활용시 this 없으면 자동 추가
//   - 지역변수는 멤버 아니므로 this 추가 불가

package ch07_클래스내부구성요소.p252;

class A {
	int m;

	A(int m) { 
		m = m;	// this 생략시 매개변수 m으로 인식
	}
	
	void a_m1() {
		a_m2();	
	}
	void a_m2() {
		System.out.println(m);	
	}
}
class B {
	int m;

	B(int m) { 
		this.m = m;		// 명시적으로 this 키워드 추가 필요
	}
	
	void b_m1() {
		this.b_m2();	// 생략 가능
	}
	void b_m2() {
		System.out.println(this.m);	// 생략 가능
	}
}

public class ThisKeyword {
	
	public static void main(String[] args) {		
		A a = new A(11);
		System.out.println(a.m);
		a.a_m1();
		a.a_m2();
 		
		B b = new B(22);
		System.out.println(b.m);
		b.b_m1();
		b.b_m2();
	}
}
