// 10.2 객체의 타입 변환 - 다형성, 업캐스팅, 다운캐스팅
// - 업 캐스팅: 자동 타입 변환
// - 다운 캐스팅: 강제 타입 변환 
// - 기본 자료형에서 업 캐스팅 vs. 다운 캐스팅
//   - 업 캐스팅: 범위가 좁은 쪽에서 넓은 쪽으로
//   - 다운 캐스팅: 범위가 넓은 쪽에서 좁은 쪽으로 
// - 참조 자료형에서 업 캐스팅 vs. 다운 캐스팅
//   - 업 캐스팅: 범위가 넓은 쪽(자식)에서 넓은 쪽(부모)으로
//   - 다운 캐스팅: 범위가 좁은 쪽(부모)에서 넓은 쪽(자식)으로

package ch10_클래스상속과다형성.p319;

class A {} //extends object 생략됨
class B extends A{}
class C extends B{}
class D extends B{}

public class PolymorphismTypeCasting1 {
	public static void main(String[] args) {
		// 상속을 통한 다형성 표현 상속관계에서만 가능한 서브 클래스의 객체를 수퍼클래스 타입으로 업캐스팅
		A a1 = new A();
		A a2 = new B(); //업캐스팅
		A a3 = new C();
		A a4 = new D();
		
//		//B b1 = new A(); //오류
//		B b2 = new B(); 
//		B b3 = new C(); 
//		B b4 = new D(); 

//		//C c1 = new A(); //오류
//		//C c2 = new B(); //오류
//		C c3 = new C(); 
//		//C c4 = new D(); //오류

//		//D d1 = new A(); //오류
//		//D d2 = new B(); //오류
//		//D d3 = new C(); //오류
//		D d4 = new D();   	
		
		// 업캐스팅(자동 타입 변환)
//		A ac = new C(); 
//		B bc = new C(); 
		
//		B bb = new B();
//		A a = bb; 
		
		// 다운캐스팅(강제 타입 변환) 
		A ab = new B();
		B b = (B)ab;
		C c = (C)ab; //오류
		
//		B bd = new D();
//		D d = (D)bd; 
		
//		A ad = new D();
//		B b1 = (B)ad; 
//		D d1 = (D)ad; 

//		A aa = new A();
//		B b = (B)aa; //오류
//		C c = (C)aa; //오류
	}
}
