// 7.2 메소드 - 기본 자료형 매개변수 값의 변화

package ch07_클래스내부구성요소.p237;

public class PrimitiveDataTypeArgument {	
	
	public static void main(String[] args) {
		int a = 3;		
		int result1 = twice(3);		
		System.out.println(result1); 		
		int result2 = twice(a);
		System.out.println(result2); 		
		System.out.println(a); 		 				
	}	
	
	public static int twice(int a) {
		a = a * 2;
		return a;
	}
}
