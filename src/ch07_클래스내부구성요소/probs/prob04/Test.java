// 4. 클래스 A 내부에는 다음과 같이 기본 자료형과 참조 자료형을 
//    입력 매개변수로 하는 abc(), bcd() 메서드가 정의돼 있다. 
//    이때 다음 코드의 출력값을 쓰시오.

package ch07_클래스내부구성요소.probs.prob04;

import java.util.Arrays;

class A {
	void abc(int m) {
		m = 8;
	}
	void bcd(int[] n) {
		n[0] = 4; n[1] = 5; n[2] = 6;
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		 
		int m = 5;
		int[] n= {1, 2, 3};
		 
		a.abc(m);
		a.bcd(n);
		 
		System.out.println(m);
		System.out.println(Arrays.toString(n));
	}
}
