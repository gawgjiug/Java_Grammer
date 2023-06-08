// 8.1 패키지와 임포트 - 임포트 사용

package ch08_클래스외부구성요소.p269;

import ch08_클래스외부구성요소.p269.common.A;
//import ch08_클래스외부구성요소.p269.common.*;

public class PackageImport_2 {
	public static void main(String[] args) {		
		A a = new A();

		System.out.println(a.m); 
		System.out.println(a.n); 
		a.print(); 
	}
}
