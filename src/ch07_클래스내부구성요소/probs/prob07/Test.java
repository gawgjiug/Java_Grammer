// 7. 클래스 A를 다음과 같이 정의했을 때 
//    다음 코드의 출력 결과를 쓰시오.

package ch07_클래스내부구성요소.probs.prob07;

class A {
	int m = 3;
	int n = 5;
	void abc(int m, int n) {
		m = this.m;
		n = n;
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.abc(7, 8);
		System.out.println(a.m);
		System.out.println(a.n);
	}
}
