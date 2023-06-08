// 10.2 객체의 타입 변환 - instanceof 키워드
// - 참조변수 instanceof 참조타입

package ch10_클래스상속과다형성.p326;

class A{}
class B extends A{}

public class PolymorphismTypecasting3 {
	public static void main(String[] args) {		
		A aa = new A();
		A ab = new B();

		System.out.println(aa instanceof A); //aa라는 참조변수가 A라는 클래스의 인스턴스이냐? true
		System.out.println(ab instanceof A); //ab라는 참조변수가 A라는 클래스의 인스턴스이냐? true

		System.out.println(aa instanceof B); //aa라는 참조변수가 B라는 클래스의 인스턴스이냐?  false
		System.out.println(ab instanceof B); //ab 는 B의 참조변수가 맞음

		if(aa instanceof B) {
			B b = (B)aa;
			System.out.println("aa를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("aa는 B 타입으로 캐스팅이 불가!!!");
		}			
		
		if(ab instanceof B) {
			B b = (B)ab; //형변환 하는 이유?  B객체의 멤버를 이용하기 위해
			System.out.println("ab를 B로 캐스팅하였습니다.");
		} else {
			System.out.println("ab는 B 타입으로 캐스팅이 불가!!!");
		}		
		
		if ("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다");
		}
	}
}
