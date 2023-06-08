// 4.1 제어문 - for문
// - 일반적으로 반복 횟수가 정해졌을때 사용
// - for(초기식; 조건식; 증감식) { }

package ch04_제어문과제어키워드.p125;

public class ForControlStatement {

	public static void main(String[] args) {        
		// for문 1
//		int a;
//		for(a=0; a<3; a++) {		// 외부에 변수 선언
//			System.out.print(a + " ");
//		}
//		System.out.println(a); //3이 출력됨 for문안에서 a가 3이 되었을 때 조건식에 걸려 for문을 빠져나오게 되는데 마지막으로 저장된 값인 3이 출력됨

//		for(int i=0; i<3; i++) {	// 내부에 변수 선언
//			System.out.print(i + " ");			
//		}
		//메모리 상태를 그려라 = args도 변수임 (스트링 배열 객체) args라는 변수는 값이 아니라 스트링 배열객체의 주소 값을 가지고 있고
		//i라는 지역변수는 직접 값을 가지고 있음 0,1,2,3이 되어 for block을 빠져나오면서 없어짐 따라서 괄호 바깥에 i를 호출할 경우 에러

//		for(int i=10; i>0; i--) {
//			System.out.print(i + " ");
//		}

//		for(int i=0; i<10; i+=2) {
//			System.out.print(i + " ");
//		} 

//		for(int i=0, j=0; i<10; i++, j++) {
//			System.out.print(i + j + " ");
//			System.out.println("" + i + j + " "); //00 11 22 33 처음이 문자열로 시작하면 문자열로 인식하여 연산되지 않음
//		}
				
		// for문 2
//		for(int i=0; ;i++) { //조건이 없기 때문에 무한 반복
//			System.out.println(i);
//		}

//		for(;;) {
//			System.out.println("무한루프");
//		} 

		// for문 3
//		for(int i=0; ;i++) {
//			if(i>5) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.print("무한루프 탈출 ");		
	}
}
