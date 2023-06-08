// 7.2 메소드 - 클래스 내부에서 메소드 호출
// - 객체 생성 없이 호출 가능
//   - static 메소드는 static 메소드(필드)만 호출 가능
// static이라고 붙어있는 필드나 메서드는 호출할 때도 static이라고 붙여줘야함
// 예를들어 static void main 메소드에서 일반 필드 (int a = 5;) 등은 호출할 수 없음

package ch07_클래스내부구성요소.p233;
public class InternalCallMethods {
//	int a = 5;
	public static void main(String[] args) {	
		print();

		int b = twice(3);
		System.out.println(b);

		double c = sum(b, 5.8);
		System.out.println(c);
	}	

	public static void print() {
		System.out.println("안녕");
	}	
	
	public static int twice(int k) {
		return k*2;
	}	
	
	public static double sum(int m, double n) {
		return m+n;
	}	
}
