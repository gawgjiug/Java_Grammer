// 8.2 외부 클래스

package ch08_클래스외부구성요소.p275;

import ch08_클래스외부구성요소.p275.common.A;
//import ch08_클래스외부구성요소.p275.common.B; //오류

public class ExternalClass {
	public static void main(String[] args) {
		A a = new A();
		//B b = new B(); // 오류
	}
}
