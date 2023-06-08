// 4. 상속 구조가 다음과 같다. 다음 중 
//    타입 변환이 올바른 것은 ○, 잘못된 것은 X에 표시하시오.
//    - B 클래스는 A 클래스를 상속한다.
//    - C 클래스는 B 클래스를 상속한다.
//    - E 클래스는 B 클래스를 상속한다.
//    - D 클래스는 C 클래스를 상속한다.

package ch10_클래스상속과다형성.probs.prob04;

class A { }
class B extends A { }
class C extends B { }
class E extends B { }
class D extends C { }

public class Test {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = (B)a1; 
		C c1 = (C)a1;
		D d1 = (D)a1; 
		E e1 = (E)a1; 
		
		A a2 = new B();
		B b2 = (B)a2; 	// ok
		C c2 = (C)a2; 
		D d2 = (D)a2; 
		E e2 = (E)a2;
		
		A a3 = new C();
		B b3 = (B)a3;	// ok
		C c3 = (C)a3;	// ok
		D d3 = (D)a3; 
		E e3 = (E)a3;
	}
}
