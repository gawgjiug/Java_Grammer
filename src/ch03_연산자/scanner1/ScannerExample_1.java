// ScannerExample_1
// - 분리문자: 개행문자(\n), 탭문자(\t), 공백문자
// - 엔터키 입력할 때까지 키보드 입력 내용은 버퍼 메모리에 저장
// - 다음 메소드들은 버퍼에 내용 있는지 확인후 없으면 대기
// - Scanner 클래스 메소드
//   - nextInt(): 분리문자 무시하고 토큰 입력 받아 int 반환
//   - nextDouble(): 분리문자 무시하고 토큰 입력 받아 double 반환
//   - next(): 분리문자 무시하고 토큰 입력 받아 문자열 반환
//   - nextLine(): 한줄 단위로 개행문자까지 입력 받아 개행문자 앞의 문자열 반환

package ch03_연산자.scanner1;

import java.util.Scanner;

public class ScannerExample_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//args , scanner  지역변수
		
//		System.out.print("입력1:");
//		System.out.println(scanner.nextInt());
//		System.out.print("입력2:");
//		System.out.println(scanner.nextDouble());
//		System.out.print("입력3:");
//		System.out.println(scanner.next());
//		System.out.print("입력4:");
//		System.out.println(scanner.nextLine());  // 버퍼에 남은 이전 개행문자 읽음
//		System.out.print("입력5:");
//		System.out.println(scanner.nextLine());
//		System.out.print("입력6:");
//		System.out.println(scanner.next());
//		System.out.println("종료!!!");
		
		// 문제 코드
//		System.out.print("입력1:");
//		int num = scanner.nextInt();
//		System.out.print("입력2:");
//		String str = scanner.nextLine();	// 버퍼에 남은 이전 개행문자 읽음
//		System.out.print("입력3:");
//		Double num1 = scanner.nextDouble();
//		System.out.println(num + "," + str + "," + num1);

		//1이 num에 직접 저장됨
		//남아 있던 개행문자를 str이 빈 문자열을 반환함 (참조타입은 ) String 객체의 주소를 참조하고있음  있음 중요*
		//다시 입력 3을 num1에 받아서 더블형태로 반환
        
        // 해결 방법 1 - nextLine() 한번 더 실행
//		System.out.print("입력1:");
//		int num = scanner.nextInt();
//		System.out.print("입력2:");
//		String str = scanner.nextLine();	// 버퍼에 남은 이전 개행문자 읽음
//		String str1 = scanner.nextLine();	
//		System.out.print("입력3:");
//		Double num1 = scanner.nextDouble();
//		System.out.println(num + "," + str1 + "," + num1);
		
		// 해결 방법 2 - nextLine() 사용하지 않음
//		System.out.print("입력1:");
//		int num = scanner.nextInt();
//		System.out.print("입력2:");
//		String str = scanner.next();		// nextLine() 대신 next() 이용
//		System.out.print("입력3:");
//		Double num1 = scanner.nextDouble();
//		System.out.println(num + "," + str + "," + num1);

		// 해결 방법 3 - nextLine()만 사용, 사용후 변환
		System.out.print("입력1:");
		int num = Integer.parseInt(scanner.nextLine());
		System.out.print("입력2:");
		String str = scanner.nextLine();		//문자열을 반환 함
		System.out.print("입력3:");
		Double num1 = Double.parseDouble(scanner.nextLine());
		System.out.println(num + "," + str + "," + num1);

		// Scanner 보기 1
//		System.out.print("x 입력: ");
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
//
//		System.out.print("y 입력: ");
//		String strY = scanner.nextLine();
//		int y = Integer.parseInt(strY);
//
//		int result = x + y;
//		System.out.println("x + y = " + result);
//		System.out.println();

		while(true) {
			System.out.print("입력 문자열(종료:q): ");
			String data = scanner.nextLine();
			if(data.equals("q")) { //String 객체의 포함되어있는 equals라는 메소드 사용
				// == 은 번지를 비교하는 것이고
				//equals 는 안의 값을 비교하는 것  "q"라고 적는 과정에서 q라는 객체가 생김
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}
}
