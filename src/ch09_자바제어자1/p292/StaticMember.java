// 9.2 static 제어자
// - 인스턴스 멤버
//   - 객체 생성해야만 이용할 수 있는 멤버
//   - 인스턴스 필드 + 인스턴스 메소드
// - 정적 멤버
//   - 객체 생성 없이 클래스 이름으로 이용할 수 있는 멤버 
//   - 정적 필드 + 정적 메소드
//   - 정적 필드는 공유 변수

package ch09_자바제어자1.p292;

class A {
	int m = 3;			// 인스턴스 필드
	static int n = 5;	// 정적 필드(객체 사이의 공유 변수)
	
	void abc() {		//인스턴스 메서드
		System.out.println("instance 메서드");
	}
	static void bcd() { //정적메서드
		System.out.println("static 메서드");
	}
	//필드하고 메서드 둘다 class의 멤버라고 할 수 있음
	//static 필드, 메서드 vs ㅇ인스턴스 필드,메서드
}

public class StaticMember {

	public static void main(String[] args) {
		// 정적 멤버 사용
		A a = new A();
		System.out.println(a.m);	// 인스턴스 필드 사용
		System.out.println(A.n);	// 정적 필드 사용, a.n 사용 X
		a.abc();					// 인스턴스 메소드 사용
		A.bcd();					// 정적 메소드 사용, a.bcd() 사용 X
		
		// 정적 필드 공유
		A a1 = new A();
		A a2 = new A();
//		
		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m + " " + a2.m);

		a1.n = 7;
		a2.n = 8;
		System.out.println(a1.n + " " + a2.n);

		A.n = 9; //static 필드는 class로 접근하는 것이 바람직함
		System.out.println(a1.n + " " + a2.n);
	}
}
