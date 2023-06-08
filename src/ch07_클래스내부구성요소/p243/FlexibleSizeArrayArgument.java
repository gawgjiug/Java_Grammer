// 7.2 메소드 - 가변길이 매개변수
// - 1개의 메소드로 메소드 오버로딩의 불편함 해소
// - 매개변수로 입력된 값들을 배열로 처리

package ch07_클래스내부구성요소.p243;

public class FlexibleSizeArrayArgument {
	
	public static void main(String[] args) {		
		method1(1,2);
		method1(1,2,3);
		method1();		

		method2("안녕", "방가");
		method2("땡큐", "베리", "감사");
		method2();		
	}	
	public static void method1(int...values) { 
		System.out.println("인수의 수: " + values.length);
		for(int k: values) {
			System.out.print(k+" ");
		}
		System.out.println();		
	}	
	public static void method2(String...values) { 
		System.out.println("인수의 수: " + values.length);		
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();		
	}	
}
