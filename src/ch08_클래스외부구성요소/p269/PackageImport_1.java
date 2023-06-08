// 8.1 패키지와 임포트 - 클래스 풀네임 사용

package ch08_클래스외부구성요소.p269;

public class PackageImport_1 {
	public static void main(String[] args) {		
		//A a = new A(); //오류
		ch08_클래스외부구성요소.p269.common.A a = new ch08_클래스외부구성요소.p269.common.A();

		System.out.println(a.m); 
		System.out.println(a.n); 
		a.print(); 
	}
}
