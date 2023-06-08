// 2. 다음과 같이 클래스 A가 정의돼 있을 때 다음 코드를 작성하시오.
//    - 참조변수 a를 선언하고 클래스 A의 객체를 생성하시오.
//    - 객체 내부의 필드 m에 값 5를 대입하시오.
//    - 필드 m의 값을 콘솔에 출력하시오.
//    - 메서드 method()를 호출하시오.

package ch06_클래스와객체.probs.prob2;

class A {
	int m;
	void method() {
		System.out.println("A의 메소드");
	}
}

public class Test {

	public static void main(String[] args) {
//		
//		( 여기에 코드 작성 )
//
		A a = new A();
		a.m = 5;
		System.out.println(a.m);
		a.method();
	}
}
