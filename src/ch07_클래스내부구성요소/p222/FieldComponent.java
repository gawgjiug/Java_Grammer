// 7.1 필드 - 필드와 (지역)변수 구분
// - 필드 vs. (지역)변수
//   - 필드: 클래스에 소속된 변수
//   - 변수: 메소드에 소속된 변수
// - 스택 영역 vs. 힙 영역
// - 강제 초기화 vs. 강제 초기화 X

package ch07_클래스내부구성요소.p222;
//import java.lang.*; 기본적으로 생략되어 있는 것임
class A {
	int m = 3; //필드는 클래스에 소속된 변수 ,지역변수는 메서드에 소속된 변수
	//지역변수는 강제 초기화가 안되지만 필드는 강제초기화가 가능함
	//패키지 밑 임포트 밑 클래스
	// 필드 = type (데이터)
	// 생성자 메소드 = type 대신 class
	int n = 4;
	//class의 A의 기본타입 필드는 몇개? 2개 String은 참조타입 배열도 참조타입

	void work1() {
		int k = 5; //지역변수
		System.out.println(k); 		
		work2(3);
	}	
	void work2(int i) { 
		int j = 4;
		System.out.println(i + j);	
	}
}
public class FieldComponent {

	int a =34;
	String b = "a";
	public static void main(String[] args) {		
		A a = new A();	
		
		System.out.println(a.m);	
		System.out.println(a.n);	
		
		a.work1();
		a.work2(5);

		FieldComponent b = new FieldComponent();
		b.a=35;

	}
}
