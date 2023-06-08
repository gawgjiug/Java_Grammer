// 9.1 접근 제어자 - 클래스의 접근 제어자
// - public 혹은 default 허용

package ch09_자바제어자1.p285;

import ch09_자바제어자1.p285.pack.A;
//import ch09_자바제어자1.p285.pack.B; //오류
import ch09_자바제어자1.p285.pack.C;

public class AccessModifierOfClass {
	
	public static void main(String[] args) {
		A a = new A();
		//B b = new B(); 	//오류
		//C c = new C();	//오류, 클래스 C 객체 선언은 가능
	}
}
