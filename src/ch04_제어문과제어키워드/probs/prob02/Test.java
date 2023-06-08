// 2. 문제 1번 에서 완성한 코드를 동일한 기능을 수행하는 switch 구문으로 작성하시오

package ch04_제어문과제어키워드.probs.prob02;

public class Test {

	public static void main(String[] args) {
		int score = 72;
		int num = score/10;

		switch (num) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8 :
				System.out.println("B학점");
				break;
			case 7 :
				System.out.println("C학점");
				break;
			default:
				System.out.println("F학점");



		}
	}
}
