// 12. 다음과 같은 클래스 A가 있다. 
//     다음 코드의 실행 결과로 true가 되도록 클래스 A를 수정하시오.

package ch10_클래스상속과다형성.probs.prob12;

class A {
	int data;
	A(int data) {
		this.data = data;
	}
	
//	( 여기에 코드 작성 )
	
}

public class Test {

	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));
	}
}
