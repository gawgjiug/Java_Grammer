// 2.1 변수와 자료형
// 2.2 이름 짓기

package ch02_자료형.p55;

public class VariableDataType {

	public static void main(String[] args) {
		// 변수에 값 대입
		int a = 3;	// 변수 선언과 함께 값 대입
		int b;		// 변수 선언과 값 대입 분리
		//메서드 안에 선언 된 변수 > 지역변수
		b = 4;
		System.out.println(a);
		System.out.println(b);
		
		// 변수의 생존 범위
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		}
		System.out.println(value1);
		//System.out.println(value2);	//오류
	}
}
