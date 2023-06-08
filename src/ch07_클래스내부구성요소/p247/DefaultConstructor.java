// 7.3 생성자 - 기본(디폴트) 생성자, 생성자 오버로딩
// - 생성자(constructor)
//   - 객체 생성과 필드 초기화 역할
//   - 클래스 이름과 동일한 메소드, 반환 타입 없음
// - 기본(디폴트) 생성자
//   - 매개변수 없는 생성자
//   - 클래스가 생성자 포함하지 않으면 기본 생성자 자동 추가

package ch07_클래스내부구성요소.p247;

class A {
	int m;
	void work() {
		System.out.println(m); 
	}
}
class B {
	int m;
	void work() {
		System.out.println(m); 
	}
	B() { 

	}
}
class C {
	int m;
	void work() {
		System.out.println(m); 
	}
	C(int a) { 
		m=a;
	} //필드 -> 생성자 메서드 순으로 과제 작성
}
public class DefaultConstructor {
	public static void main(String[] args) {
		// 기본 생성자 보기
		A a = new A();
		B b = new B();
		//C c = new C(); //오류
		C c = new C(3);		
		a.work(); 
		b.work(); 
		c.work(); 
		
		// 생성자 오버로딩 보기 오버로딩 ? = 중복정의 생성자 메소드를 여러개 정의한 것을 말함
		D d1 = new D(); 
		D d2 = new D(3); 
		D d3 = new D(3, 5); 
	}
}
