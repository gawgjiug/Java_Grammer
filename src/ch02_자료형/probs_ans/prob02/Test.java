// 2. 다음 코드에서 변수 a, b, c가 메모리에 생성되는 행 번호와 사라지는 행 번호를 쓰시오.

package ch02_자료형.probs_ans.prob02;

public class Test {

	public static void main(String[] args) {
		int a = 3;	// 변수 a 생성
		{
			int b;	// 변수 b 생성
			b = 5;
		}			// 변수 b 삭제
		int c = 7;	// 변수 c 생성
	}				// 변수 a,c 삭제
}
