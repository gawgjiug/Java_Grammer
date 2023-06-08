// 3.1 연산자 종류
// - 산술, 증감, 비트(X), 시프트(X), 비교, 논리, 대입 삼항(조건)
// 3.2 연산자의 연산 방법 - 산술, 증감
// - 산술 연산자
//   - +, -, *, /, %
// - 증감 연산자
//   - 전위형 증감 연산자: 다른 모든 연산보다 먼저 증가 연산 수행
//   - 후위형 증감 연산자: 다른 모든 연산 먼저 수행 후 나중에 증가 연산 수행

package ch03_연산자.p84;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 산술 연산자
//		System.out.println(2 + 3);
//		System.out.println(8 - 5);
//		System.out.println(7 * 2);
//		System.out.println(7 / 2);
//		System.out.println(8 % 5);
		
		// 증감 연산자 1
//		int value1 = 3;
//		value1++;
//		System.out.println(value1);
//
//		int value2 = 3;
//		++value2;
//		System.out.println(value1);
		
		// 증감 연산자 2
//		int value3 = 3;
//		int value4 = value3++;
//		System.out.println(value3);
//		System.out.println(value4);
//
//		int value5 = 3;
//		int value6 = ++value5;
//		System.out.println(value5);
//		System.out.println(value6);
		
		// 증감 연산자 3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
	}
}
