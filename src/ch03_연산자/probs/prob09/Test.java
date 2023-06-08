// 9. 다음은 삼항 연산자에 관한 코드다. 출력값을 쓰시오.

package ch03_연산자.probs.prob09;

public class Test {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		System.out.println((a > b) ? "안녕하세요" : "반갑습니다");
		System.out.println((a < b) ? (b > c) ? "타입 A" : "타입 B" : (b > c) ? "타입 C" : "타입 D");
	}
}
