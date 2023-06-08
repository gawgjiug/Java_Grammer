// 3.2 연산자의 연산 방법 - 비교, 논리
// - 비교 연산자
//   - <, >, <=, >=, ==, !=
//   - 연산 결과는 boolean 타입
// - 논리 연산자
//   - &&, ||, ^, !
//   - 연산 결과는 boolean 타입

package ch03_연산자.p96;

public class RelationalLogicalOperator {
	public static void main(String[] args) {
		// 비교 연산자 1 - 크기 비교
//		System.out.println(5 < 2); 
//		System.out.println(5 > 2);
//		System.out.println(5 < 5); 
//		System.out.println(5 <= 5); 
//		System.out.println(5 >= 5); 

		// 비교 연산자 2 - 기본 자료형 등가비교
//		int a = 5;
//		int b = 2;
//		int c = 5;
//		System.out.println(a == b); 
//		System.out.println(a != b); 
//		System.out.println(a == c); 
//		System.out.println(a != c); 

//		 비교 연산자 3 - 참조 자료형 등가비교
		String str1 = new String("안녕");
		String str2 = new String("안녕");
//		String str1 = "안녕";
//		String str2 = "안녕";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		// 논리 연산자
//		System.out.println(true && true); 
//		System.out.println(true && false); 
//		System.out.println(true && (5<3)); 
//		System.out.println((5<=5) && (7>2));
//
//		System.out.println(true || true); 
//		System.out.println(true || false); 
//		System.out.println(false || (5<3)); 
//		System.out.println((5<=5) || (7>2)); 
//
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ (5<3));
		System.out.println((5<=5) ^ (7>2));
//
//		System.out.println(!true); 
//		System.out.println(!false); 
//		System.out.println(false || !(5<3)); 
//		System.out.println((5<=5) || !(7>2));
	}
}
