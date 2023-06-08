// 7.1 필드 - 필드와 지역변수의 초기값

package ch07_클래스내부구성요소.p226;

class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
	//기본타입 3개 참조타입 1개
	
	void printFieldValue () {
		System.out.println(m1); //false
		System.out.println(m2); //0
		System.out.println(m3); //0.0
		System.out.println(m4); //null
	}	
	void printLocalVariable() {
		int k;	
		//System.out.println(k); //오류? 지역변수는 초기화가 필수적임
	}
}
public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {		
		A a = new A();		
		a.printFieldValue();
	}
}
