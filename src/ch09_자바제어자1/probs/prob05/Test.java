// 5.  다음과 같이 1개의 인스턴스 필드(a)와 1개의 정적 필드(b)를 
//     포함하고 있는 클래스 A가 정의돼 있다.
//     이때 다음 코드의 실행 결과를 쓰시오.

package ch09_자바제어자1.probs.prob05;

class A {
	int a = 3;
	static int b = 5;
}

public class Test {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.a = 30;
		a1.b = 40;
		a2.a = 50;
		a2.b = 60;

		System.out.println(a1.a); //30
		System.out.println(a1.b); //공통 field인 static 필드에 존재하는 b라는 변수에 40을 넣음

		System.out.println(a2.a); //인스턴스 필드는 각 개체마다 가지고 있기 때문에 a1.a와 a2.a는 다른 것 때문에 50
		System.out.println(a2.b); //공톨 field인 static 필드에 존재하는 b라는 변수에 다시 60을 넣음
		//따라서 출력은 30,60,50,60
		//올바른 접근법은 a1.b , a2.b가 아니라 A.b , A.b
	}
}
