// 1.4 자바 프로그램의 기본 구조 - 콘솔 출력

package ch01_자바시작하기.p51;

public class ConsoleOutput { 
	
	public static void main(String[] ar) {
		// 콘솔 출력 1 - println()
//		System.out.println("안녕하세요");
//		System.out.println("안녕" + "하세요");
//		System.out.println(2 + 4);
//		System.out.println(4.6);
		System.out.println("문자" + 1); //앞에 문자열이 있으면 문자열로 자동으로 인식함
		System.out.println("문자" + 1 + 2);
//		System.out.println(1 + 2 + "문자"); //왼쪽 부터 오른쪽임 정수먼저 인식하니 3문자 로 출력됨
//		System.out.println();
//		int a = 5;
//		String b = "하세요";
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("안녕"+b);
//		System.out.println(a + "안녕" + b);
//		System.out.println();
		
		// 콘솔 출력 2 = print()
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");

		System.out.println("-------------");
		
		// 콘솔 출력 3 = printf()
		System.out.printf("%d\n", 10); //10진수
		System.out.printf("%o\n", 10); //8진수
		System.out.printf("%x\n", 10); //16진수
		System.out.printf("%s\n", "문자열 출력");
		System.out.printf("%f\n", 3.2582);
		System.out.printf("%4.2f\n", 3.2582);
		System.out.printf("%d와 %4.2f\n", 10, 3.2582);
		System.out.printf("%d와 %.2f\n", 10, 3.2582);
		//printf = ("출력 포맷", 인자,인자)의 형태를 띤다 말 그대로 출력 포맷을 지정하는 메서드로,
		//java = 해석기 javac = 컴파일러
	}
}










