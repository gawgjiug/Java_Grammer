// 8. 다음은 대입 연산자에 관한 코드다. 출력값을 쓰시오.

package ch03_연산자.probs.prob08;

public class Test {

	public static void main(String[] args) {
		int a = 3;
		a += 1;
		System.out.println(a);
		a %= 5;
		System.out.println(a);
		a /= 2;
		System.out.println(a);
		System.out.println(a *= 2);
	}
}
