// 10.5 super 키워드와 super() 메소드
// - super: 부모 객체를 가리키는 참조변수
// - super(): 부모 생성자 호출
// - this: 자신 객체를 가리키는 참조변수
// - this(): 자신의 생성자 호출
// - 모든 생성자 메소드 첫 줄에 반드시 this() 혹은 super() 존재, 없으면 super() 자동추가

package ch10_클래스상속과다형성.p349;

class A {
	A() { 
		this(3); //자신 클래스의 생성자 메소드를 호출함
		System.out.println("A 생성자1"); 
	}
	A(int a) {
		System.out.println("A 생성자2"); 
	}
}
class B extends A {
	B() {
		super();	// 생략가능 , 부모클래스의 생성자 호출
		System.out.println("B 생성자"); 
	}
}
class C {
	int f;
	C(int f) {
		this.f = f;
		System.out.println("C 생성자 " + this.f); 
	}
}
class D extends C {
	D() {
		super(3);	// 생략불가
		System.out.println("D 생성자 " + super.f);
	}
}

public class SuperKeywordMethod {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("--------------");
//		
//		B b = new B();
//		System.out.println("--------------");
//		
//		C c = new C(6);
//		System.out.println("--------------");
//		
//		D d = new D();
//		System.out.println("--------------");
	}
}
