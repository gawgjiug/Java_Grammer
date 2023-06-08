// 4.1 제어문 - switch문
// - 정수, 문자, 문자열 가능
// - default 생략 가능

package ch04_제어문과제어키워드.p119;

public class SwitchControlStatement {

	public static void main(String[] args) {		
////		 switch문 1 - break 미포함
//		int value1 = 2; //int value1 = '2' 라고 선언해도 됨 char 도 사실은 정수형 자료형이기 때문에 (문자로 바꾸고 싶은 경우)
//		//String은 큰 따옴표 " 를 사용하면 됨
//		switch(value1) { // 괄호 안에 '값'이 들어감
//		case 1:
//			System.out.println("A");
//		case 2:
//			System.out.println("B");
//		case 3:
//			System.out.println("C");
//		default: //case안에 값 매칭이 안된다면 default 로 오게 됨 default는 생략 가능함
//			System.out.println("D");
//		}

		// switch문 2 - break 포함
//		int value2 = 2;
//		switch(value2) {
//		case 1:
//			System.out.println("A");
//			break;
//		case 2:
//			System.out.println("B");
//			break;
//		case 3:
//			System.out.println("C");
//			break;
//		default:
//			System.out.println("D");
//		}
//
//		if(value2 == 1) {		// if-else-if문으로 변환, 비효율적
		// switch-case 문은 조건을 한번만 확인하고 쭉 진행할 수 있지만 if - else문은 모든 조건식을 비교해야 하므로 비효율적임
//			System.out.println("A");
//		}
//		else if(value2 == 2) {
//			System.out.println("B");	
//		}
//		else if(value2 == 3) {
//			System.out.println("C");
//		}
//		else {
//			System.out.println("D");
//		}
		
		// switch문 3 - 연속된 case
		int a = 8;
		switch (a) {
		case 10:
			System.out.println("Pass"); break;
		case 9:
			System.out.println("Pass"); break;
		case 8:
			System.out.println("Pass"); break;
		case 7:
			System.out.println("Pass"); break;
		default:
			System.out.println("Fail"); break;
		}
//		
//		switch (a) {		// 연속된 case문으로 변환, 코드 간결
//		만약 a 가 10이나 9여도 밑으로 쭉 내려가면서 실행하기 때문에 pass 라는 결과 값은 같음
//		case 10:
//		case 9:
//		case 8:
//		case 7:
//			System.out.println("Pass"); break;
//		default:
//			System.out.println("Fail"); break;
//		}
	}
}
