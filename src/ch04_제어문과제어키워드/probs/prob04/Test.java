// 4. 다음 for 문과 동일한 기능을 수행하는 while 문을 작성하시오
//    - for(int i = 10; i > 0; i -= 2) {
//    -      System.out.println(i);
//    - }

package ch04_제어문과제어키워드.probs.prob04;

public class Test {

	public static void main(String[] args) {

		int i = 10;
		while (i > 0){ //반복횟수가 정해지지 않았을 경우 사용함
			System.out.println(i);
			i -=2;
		}

	}
}
