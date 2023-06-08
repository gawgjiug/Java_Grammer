// 4.  다음 코드는 오류를 포함하고 있다. 
//     오류가 발생한 위치와 그 이유를 설명하시오.

package ch09_자바제어자1.probs.prob04;

class A {
	static int a = 2;
	static int b = 3;
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	static void bcd() {
		System.out.println(a); //정적 메소드에서는 인스턴스 필드를 사용할 수 없음
		System.out.println(b);
	}
}
