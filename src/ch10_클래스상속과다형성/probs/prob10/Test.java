// 10. 클래스 A와 B의 구조는 다음과 같다. 
//     다음 코드의 실행 결과를 쓰시오.

package ch10_클래스상속과다형성.probs.prob10;

class A {
	A() {
		System.out.println("A 생성자1");
	}
	A(int a) {
		this();
		System.out.println("A 생성자2");
	}
}
class B extends A {
	B() {
		System.out.println("B 생성자1");
	}
	B(int a) {
		super(a);
		System.out.println("B 생성자2");
	}
}

public class Test {

	public static void main(String[] args) {
		B bb = new B(5);
	}
}
