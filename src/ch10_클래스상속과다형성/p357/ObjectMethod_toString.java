// 10.6 최상위 클래스 Object - toString()
// - 객체 정보를 문자열로 반환
//   - 객체정보: 패키지이름.클래스이름@해쉬코드
//   - 해쉬코드: 객체가 저장된 위치 관련 값
// - 일반적으로 자식 클래스의 객체 정보 출력을 위해 재정의하여 사용
// - 많은 표준 라이브러리 클래스들은 toString() 메소드 재정의되어 있음
//   - String, Wrapper 클래스

package ch10_클래스상속과다형성.p357;

class A { //extends Object (컴파일러 자동추가)
	int a = 3;
	int b = 4;
	static String aa;
	public String toString(){
		return a + aa;
	}
	static int Math(int a,int b){
		return Math.max(a,b);
	}
}
class B {
	int a = 3;
	int b = 4;

	public String toString() {		
		return "필드값(a, b) =" + a + " " + b;
	}	
}
public class ObjectMethod_toString {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.aa = "lee";


		System.out.println(a.aa);

		System.out.printf("%x\n", a.hashCode()); //hashcode 16진수 표현
		System.out.println(a); 
		System.out.println(a.toString()); 
		System.out.println(b);
		System.out.println(b.toString());
	}
}
