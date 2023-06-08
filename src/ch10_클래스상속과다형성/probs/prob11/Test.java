// 11. 다음과 같은 클래스 A가 있다. 
//     다음 코드의 실행 결과로 false가 출력되는 이유를 설명하시오

package ch10_클래스상속과다형성.probs.prob11;

class A {
	int data;
	A(int data) {
		this.data = data;
	}
}

public class Test {

	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));
	}
}
