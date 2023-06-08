// 5. 상속 구조가 다음과 같을 때 알맞은 출력 결과를 고르시오.
//    - B 클래스는 A 클래스를 상속한다.
//    - C 클래스는 A 클래스를 상속한다.
//    - D 클래스는 B 클래스를 상속한다.

package ch10_클래스상속과다형성.probs.prob05;

class A { }
class B extends A { }
class C extends A { }
class D extends B { }

public class Test {

	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(aa instanceof C); 
		System.out.println(aa instanceof D); 
		
		A ad = new D();
		System.out.println(ad instanceof A);
		System.out.println(ad instanceof B); 
		System.out.println(ad instanceof C); 
		System.out.println(ad instanceof D);
	}
}
