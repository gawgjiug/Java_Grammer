// 9.1 접근 제어자 - 멤버(필드+메소드) 및 생성자의 접근 제어자
// - public, protected, default(또는 package), private
// - 지역 변수는 접근 제어자 사용 불가

package ch09_자바제어자1.p280;

import ch09_자바제어자1.p280.pack1.A;
import ch09_자바제어자1.p280.pack1.B;
import ch09_자바제어자1.p280.pack2.C;
import ch09_자바제어자1.p280.pack2.D;

public class AccessModifierOfMember {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();	// 모두 public 메소드
		b.print();
		c.print();
		d.print();
	}
}
