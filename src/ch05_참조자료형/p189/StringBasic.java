// 5.2 문자열
// - 한번 정의된 문자열은 수정 불가
// - 동일 문자열 리터럴 공유

package ch05_참조자료형.p189;

import java.util.Arrays;

public class StringBasic {

	public static void main(String[] args) {
		// 문자열 객체 생성 2가지 방법
//		String str1 = new String("안녕");	//new 연산자
//		System.out.println(str1);
//		String str2 = "안녕";				//문자열 리터럴
//		System.out.println(str2);
//		System.out.println(str1 == str2);
//
		// 문자열 수정 불가
//		String str1 = new String("안녕");
//		String str2 = str1;
//		System.out.println(str1 == str2);
//		
//		str1="안녕하세요";		// str1 변수 값 수정 불가, 새로운 객체 생성
//		System.out.println(str1); 
//		System.out.println(str2); 
//		System.out.println(str1 == str2);

		// 다른 참조형 수정 가능
//		int[] array1 = new int[] {3,4,5};
//		int[] array2 = array1;
//		array1[1] = 6;
//		System.out.println(Arrays.toString(array1)); 
//		System.out.println(Arrays.toString(array2)); 
		
		// 문자열 객체 공유		
//		String str1 = new String("안녕");
//		String str2 = "안녕"; //new 를 하지 않은 상태에서 문자열 값이 같으면 같은 것을 가르킴 2와 3은 가르키는 메모리 가 같음
//		String str3 = "안녕";
//		String str4 = new String("안녕");
//		System.out.println(str1 == str2); //주소를 비교하는 연산자
//		System.out.println(str2 == str3);
//		System.out.println(str3 == str4);
//		System.out.println(str4 == str1);
		
		// 문자열 + 연산 1
//		String str1 = "안녕" + "하세요" + "!";	// 5개의 문자열 객체 생성됨
//		System.out.println(str1); //별로 중요하지 않음

		// 문자열 + 연산 2
//		String str2 = "반갑";
//		str2 += "습니다";
//		str2 += "!";
//		System.out.println(str2); 

		// 문자열 + 연산 3
//		String str3 = "안녕" + 1;
//		String str4 = "안녕" + String.valueOf(1); //정수를 String으로 바꿔주는
//		String str5 = "안녕" + "1";
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println(str5);

		// 문자열 + 연산 4
		System.out.println(1 + "안녕");  //1안녕
		System.out.println(1 + "안녕" + 2);  //1안녕2
		System.out.println("안녕" + 1 + 2);  //안녕 12
		System.out.println(1 + 2 + "안녕");  //3안녕
	}
}
