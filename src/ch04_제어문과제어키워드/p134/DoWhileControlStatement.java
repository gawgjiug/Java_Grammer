// 4.1 제어문 - do while문
// - 무조건 1번 실행후 조건 검사, 이외에 while 문과 동일
// - 제어문 중 유일하게 do-while 문장 후 ; 필요

package ch04_제어문과제어키워드.p134;

public class DoWhileControlStatement {
	public static void main(String[] args) {
		// do-while문
//		int a;
//		a = 0;
//		do {
//			System.out.print(a + " ");
//			a++;
//		} while(a < 10);
		//do-while문은 무조건 한번은 실행한다는 점에서 차이점이 있음
		
		// 제어문 중복 1
		int value1 = 5;
		int value2 = 3;

//		if(value1 > 5) {
//			if(value2 < 2) {
//				System.out.println("실행1");
//			}
//			else {
//				System.out.println("실행2");
//			}
//		}
//		else {
//			System.out.println("실행3");
//		}
		
		// 제어문 중복 2
//		int value3 = 2;
//		switch(value3) {
//		case 1:
//			for(int k=0; k<10; k++) {
//				System.out.print(k + " ");
//			}
//			break;
//		case 2:
//			for(int k=10; k>0; k--) {
//				System.out.print(k + " ");
//			}
//			break;
//		}

		// 제어문 중복 3
//		for(int i=0; i<3; i++) { 
//			for(int j=0; j<5; j++) { 
//				System.out.println(i + " " + j);
//				if(i == j) {
//					System.out.println("i=j");
//				}
//			}
//		}
	}
}
