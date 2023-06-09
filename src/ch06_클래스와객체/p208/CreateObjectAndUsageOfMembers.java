// 6.1 클래스와 객체의 개념
// - 클래스: 객체를 만들기 위한 설계도
// - 객체: 사용할 수 있는 실체 (= 인스턴스)
// - 클래스 내부 구조
//   - 필드, 메소드, 생성자, 이너 클래스
// - 클래스 외부 구조
//   - 패키지, 임포트, 외부 클래스
// - 클래스 멤버 vs. 인스턴스 멤버
//   - 생성자를 제외한 필드, 메소드, 이너 클래스
// 6.2 객체의 생성과 활용
// - 객체 생성에 따른 메모리 구조
//   - 코드영역(클래스,정적,상수,메서드), 스택영역(변수), 힙영역(객체)

package ch06_클래스와객체.p208;

class A {	// 클래스 정의
	int m=3;	//필드 클래스 a에는 필드가 하나 있는 것
	void print() {
		System.out.println("객체 생성 및 활용");
	} //메서드는 한개 이름은 print
}

public class CreateObjectAndUsageOfMembers { //필드는 0개 메서드는 main 1개
	//ex : int a = 4; <- 필드임
	public static void main(String[] args) {		
		
		A a = new A();	// 클래스 객체 생성 a는 지역변수
		//스택영역     //힙 영역
		// a       -> A객체의 3이라는 값의 주솟값 가르킴
		// a.m=5 : m(필드)의 값을 5로 변경

		a.m=5;			// 클래스 멤버(필드) 활용
		System.out.println(a.m); 
	
		a.print();		// 클래스 멤버(메소드) 활용, 메소드 호출
	}
}
