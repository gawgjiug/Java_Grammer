// 10.6 최상위 클래스 Object - equals()
// - Object 클래스의 equals()는 위치(번지) 비교하는 == 연산자와 동일
// - 일반적으로 클래스의 객체 내용 비교를 위해 재정의하여 사용
// - String 클래스와 Wrapper 클래스는 equals() 메소드 재정의되어 있음

package ch10_클래스상속과다형성.p361;

class A {
	String name;
	A(String name){
		this.name = name;
	}
}
class B {
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) { //	if(this.name.equals(((B)obj).name)) {
			return true;
		} else 
			return false;
	}	
}
public class ObjectMethod_equals {
	public static void main(String[] args) {
		// String 클래스는 equals() 메소드 재정의되어 있음
		String a = "lee";
		String b = "lee";
		String c = new String("lee");
		String d = new String("lee");
//		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
		System.out.println(a.equals(c));
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		// 사용자 정의 클래스는 equals() 메소드 재정의 필요
//		A a1 = new A("안녕");
//		A a2 = new A("안녕");
//
//		System.out.println(a1==a2); 
//		System.out.println(a1.equals(a2));
//
//		B b1 = new B("안녕"); // B b1 = new B(new String("안녕"));
//		B b2 = new B("안녕"); // B b2 = new B(new String("안녕"));
//
//		System.out.println(b1==b2); 
//		System.out.println(b1.equals(b2));	
		
		// 기타(주의)----------------------
//		B b1 = new B(new String("안녕"));
//		B b2 = new B(new String("안녕"));
//
//		System.out.println(b1==b2); 
//		System.out.println(b1.equals(b2));
	}
}
