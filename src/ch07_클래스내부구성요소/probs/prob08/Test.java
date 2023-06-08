// 8. 클래스 A 내부에는 2개의 생성자가 정의돼 있다. 
//    다음과 같이 객체를 생성하고 각 필드값을 출력했을 때 
//    모든 필드값으로 5가 출력되도록 A() 내부에 1줄의 코드를 추가하시오.

package ch07_클래스내부구성요소.probs.prob08;

class A {
	int a, b, c, d;
	A() {
//		( 여기에 코드 작성 )
	}
	
	A(int k) {
		a = k;
		b = k;
		c = k;
		d = k;
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}
