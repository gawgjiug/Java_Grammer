// 9.2 static 제어자 - static 메소드
// - 정적 메소드 내부
//   - 인스턴스 멤버 사용 불가
//   - this 키워드 사용 불가
//   - 정적 멤버 사용 가능
// - 인스턴스 메소드 내부
//   - 인스턴스 멤버, 정적 멤버 모두 사용 가능

package ch09_자바제어자1.p299;

class A {
	int m = 3;			
	static int n = 5;	
	
	void abc() {		
		System.out.println(m);
		System.out.println(n);
		bcd();
		cde();
		System.out.println("instance 메서드");
	}
	static void bcd() { 
		System.out.println(n);
		cde();
		System.out.println("static 메서드 1");
	}
	static void cde() {
		System.out.println(n);
		System.out.println("static 메서드 2");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a.m);	
//		a.abc(); 
		
//		System.out.println(A.n);
//		A.bcd();
//		A.cde();
	}
}
