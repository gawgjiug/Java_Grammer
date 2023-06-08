// 10.3 메소드 오버라이딩
// = '인스턴스 메소드 오버라이딩' 의미
// - 부모 클래스로 부터 상속 받은 메소드와 동일한 메소드 재정의한 것
//   - 반환 타입 동일
//   - 접근 제어자 범위 넓거나 동일

package ch10_클래스상속과다형성.p329;

class Animal {
	void cry() {}
}
class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}
class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {		
//		Animal aa = new Animal();
//		Bird bb = new Bird();
//		Cat cc = new Cat();
//		Dog dd = new Dog();		
//		aa.cry();
//		bb.cry();
//		cc.cry();
//		dd.cry();

//		Animal ab = new Bird();
//		Animal ac = new Cat();
//		Animal ad = new Dog();		
//		ab.cry();
//		ac.cry();
//		ad.cry();
//		System.out.println();
//
//		Animal[] animals = {ab, ac, ad};
//		for(Animal animal : animals) {
//			animal.cry();
//		}
	}
}
