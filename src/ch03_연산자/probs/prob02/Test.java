// 2. 다음은 증감 연산에 관한 코드다. 출력값을 쓰시오.

package ch03_연산자.probs.prob02;

public class Test {

	public static void main(String[] args) {
		int a = 5;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(a++ + --b);
		System.out.println(a + b);
	}
}
