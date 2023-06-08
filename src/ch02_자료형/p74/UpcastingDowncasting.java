// 2.4 기본 자료형 간의 타입 변환
// - 업캐스팅: 자동타입 변환
// - 다운캐스팅: 강제타입 변환
// - 자료형 크기
//   - byte < short/char < int < long < float < double
// 기본 자료형 간의 연산
// - int 보다 작은 정수 자료형은 모두 int로 변환

package ch02_자료형.p74;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// 자동타입 변환
//		float value1 = 3;	//int -> float (업캐스팅)
//		long value2 = 5;	//int -> long (업캐스팅)
//		double value3 = 7;	//int -> double (업캐스팅)
//		byte value4 = 9; 	//(예외: int -> byte)
//		short value5 = 11;	//(예외: int -> short)
//		System.out.println(value1);
//		System.out.println(value2);
//		System.out.println(value3);
//		System.out.println(value4);
//		System.out.println(value5);

		//char 자료형은 기본적으로 정수 형태임 유니코드기반

		// 강제타입 변환
//		byte value6 = (byte)128; 	//int -> byte (다운캐스팅)
//		int value7 = (int)3.5;   	//double -> int (다운캐스팅)
//		float value8 = (float)7.5;	//double -> float (다운캐스팅)
//		System.out.println(value6);
//		System.out.println(value7);
//		System.out.println(value8);
		
		// 기본 자료형 간의 연산 1 - 같은 자료형 간의 연산
//		int value1 = 3 + 5;
//		int value2 = 8 / 5; //int / int = 정수형태로 결과 출력 됨
//		float value3 = 3.0f + 5.0f;
//		double value4 = 8.0 / 5.0;
////
//		byte data1 = 3;
//		byte data2 = 5;
////		byte value5 = data1 + data2; // 변수가 어떤 연산에 이용된다 정수형태이면 int로 자료형 변경이 필요함
//		int value5 = data1 + data2;
////
//		System.out.println(value1);
//		System.out.println(value2);
//		System.out.println(value3);
//		System.out.println(value4);
//		System.out.println(value5);

		// 기본 자료형 간의 연산 2 - 다른 자료형 간의 연산
		double value6 = 5 + 3.5;
		int value7 =  5 + (int)3.5;

		double value8 = 5 / 2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4;
		double value10 = data3 + data4;

		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
	}
}
