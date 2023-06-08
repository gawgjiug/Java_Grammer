// 9.2 static 제어자 - 정적 블록

package ch09_자바제어자1.p300;

class A{
	int a;
	static int b;	// static int b = 5;
	static {
		b=5; 
		System.out.println("클래스 A 로딩!!!!!!");
	}	
	A() {
		a=3; 
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {		
		System.out.println(A.b);

	}
}
