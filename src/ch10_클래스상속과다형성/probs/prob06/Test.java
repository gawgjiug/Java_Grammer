// 6. 클래스 A와 B가 다음과 같다. 다음 실행 코드의 결과를 쓰시오.

package ch10_클래스상속과다형성.probs.prob06;

class A {
	void hello() {
		System.out.println("안녕하세요");
	}
}
class B extends A {
	void hello() {
		System.out.println("반갑습니다");
	}
}

public class Test {

	public static void main(String[] args) {
		A aa = new A();
		aa.hello();
		
		B bb = new B();
		bb.hello();
		
		A ab = new B();
		ab.hello();
	}
}
