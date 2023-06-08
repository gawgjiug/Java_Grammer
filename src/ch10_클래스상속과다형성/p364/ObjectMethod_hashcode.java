// 10.6 최상위 클래스 Object - hashcode()
// - 객체의 위치와 관련된 값
// - 컬렉션 구조에서 동등 비교를 위해 equals()와 함께 hashcode() 재정의 필요
// - String 클래스와 Wrapper 클래스는 equals()와 함께 hashcode() 메소드도 재정의되어 있음

package ch10_클래스상속과다형성.p364;

import java.util.HashMap;

class A {
	String name;
	A(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		} else 
			return false;
	}	
	@Override
	public String toString() {	
		return name;
	}
}
class B {
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		} else 
			return false;
	}
	@Override
	public int hashCode() {		
		return name.hashCode();
	}
	@Override
	public String toString() {	
		return name;
	}
}

public class ObjectMethod_hashcode {
	public static void main(String[] args) {		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		System.out.println(hm1);

		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");
		System.out.println(hm2);

		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("두번째"), "데이터3");
		System.out.println(hm3);		
	}
}
