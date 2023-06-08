// 5. 다음 코드의 출력값을 쓰시오.

package ch02_자료형.probs.prob05;

public class Test {

	public static void main(String[] args) {
		System.out.println((int)5.6 + 3.5); //8.5 >>5.6만 int형으로 변환
		System.out.println((int)5.6 + (int)3.5); //8 > 둘다 int 형
		System.out.println((int)(5.6 + 3.5)); // 8 > 둘다 int 형
		System.out.println(7 / 4); //1
		System.out.println((double)3 / 2); // 1.5 > 3.0 / 2
		System.out.println((double)(3 / 2)); // 1.0
	}
}
