// 6. 클래스 A가 다음과 같이 선언돼 있다. 이때 다음과 같이 
//    System.out.println(A.a)의 출력값이 8이 나오도록 
//    클래스 A를 완성하시오

package ch09_자바제어자1.probs.prob06;

class A {
	static int a;
	

	static {
		a = 8;
	}
	
}

public class Test {

	public static void main(String[] args) {
		System.out.println(A.a);  // 8
	}
}
