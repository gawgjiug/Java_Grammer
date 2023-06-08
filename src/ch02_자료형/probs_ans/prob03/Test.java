// 3. 소문자 ‘a’를 나타내는 유니코드값은 
//    97(10진수), 1100001(2진수), 141(8진수), 또는 61(16진수)이다. 
//    char 자료형인 변수 value에 ‘a’ 문자로 저장되는 값을 5가지 이상 나열하시오.

package ch02_자료형.probs_ans.prob03;

public class Test {

	public static void main(String[] args) {
		char value1 = 97;			// 10진수
		char value2 = 0b1100001;	// 2진수
		char value3 = 0141;			// 8진수
		char value4 = 0x61;			// 16진수
		char value5 = 'a';			// 문자
		char value6 = '\u0061';		// 유니코드
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
	}
}
