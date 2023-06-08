
// 7.2 메소드 - 클래스 외부에서 메소드 호출
// - 객체 생성 후 호출 가능
// - 인수(argument) vs. 매개변수(parameter)
// - 실매개변수(actual parameter) vs. 형식매개변수(formal parameter)
package ch07_클래스내부구성요소.p231;

class A {
	void print() {
		System.out.println("안녕");
	}	
	int data() {
		return 3;
	}
	double sum(int a, double b) {
		return a+b;
	}	
	void printMonth(int m) {
		if(m<0 || m>12) {
			System.out.println("잘못된 입력");
			return;	// 메소드 종료
		}
		System.out.println(m+"월입니다.");
	}	
}

public class ExternalCallMethods {
	public static void main(String[] args) {		
		A a = new A();		
		a.print();				
		
		int k = a.data();
		a.data();
		System.out.println(k);		
		
		double result = a.sum(3, 5.2);
		System.out.println(result);		
		
		a.printMonth(5); 			
		a.printMonth(15);
		//인수와 매개변수 매개변수는 파라미터이고 인수는 그 파라미터에 전달하는 값
	}
}
