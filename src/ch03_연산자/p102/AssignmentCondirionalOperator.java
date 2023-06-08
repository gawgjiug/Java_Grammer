// 3.2 연산자의 연산 방법 - 대입, 삼항(조건)
// - 대입 연산자
//   - =. +=, -=, *=, /=, %=, 
// - 삼항 연산자
//   - (참 또는 거짓) ? 참일때 연산 결과 : 거짓일때 연산 결과

package ch03_연산자.p102;

public class AssignmentCondirionalOperator {

	public static void main(String[] args) {
        // 대입 연산자
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);

		int value2;
		value2 = 5; System.out.println(value2+=2);
		value2 = 5; System.out.println(value2-=2);
		value2 = 5; System.out.println(value2*=2);
		value2 = 5; System.out.println(value2/=2);
		value2 = 5; System.out.println(value2%=2);
        
        // 삼항 연산자
//		int value1 = (3>5)? 6: 9;
//		System.out.println(value1); 
//
//		int value2 = (5>3)? 10: 20;
//		System.out.println(value2); 
//
//		int value3 = 3;
//		System.out.println((value3%2==0)?"짝수":"홀수");
//
//		if(value3%2==0) {		// if-else문으로 변환
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
	}
}
