// 3. 다음 코드의 출력 결과를 쓰시오

package ch05_참조자료형.probs.prob03;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		double[] a = {1.2, 3.4, 5.6};
		double[] b = a;
		b[0] = 7.8;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		//7.8, 3.4, 5.6
	}
}
