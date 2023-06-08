// 7.2 메소드 - 오버로딩돤 메소드
// - 메소드 중복정의(method overloading)
//   - 매개변수의 개수나 자료형이 다른 여러 동일한 이름을 갖는 메소드

package ch07_클래스내부구성요소.p239;

public class MethodOverloading {

	public static void main(String[] args) {		
		print();	
		print(3);	
		print(5.8);	
		print(2, 5);
	}	
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}	
	public static void print(int a) {
		System.out.println(a);
	}	
	public static void print(double a) {
		System.out.println(a);
	}	
	public static void print(int a, int b) {
		System.out.println("a: "+ a + " b: "+b);
	}
//	public static int print(int a, int b) { //오류 매개변수의 개수와 타입이 다른 것만 오버로딩이고 이처럼 반환타입이 다른 것은 오버로딩이 아님
//		System.out.println("a: "+ a + " b: "+b);
//		return a+b;
//	} 
}
