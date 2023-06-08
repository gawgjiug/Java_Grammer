// 2. 다음 코드에서 변수 a, b, c가 메모리에 생성되는 행 번호와 사라지는 행 번호를 쓰시오.

package ch02_자료형.probs.prob02;

public class Test {

	public static void main(String[] args) {
		int a = 3;
		{
			int b;
			b = 5;
		}
		int c = 7;
	}
	//a 생성 : 8 사라짐 : 14
	//b 생성 :10 사라짐 :12
	//c 생성 :13 사라짐 :14
}
