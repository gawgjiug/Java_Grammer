// 2~3. 다음과 같이 pack01 패키지 내부에는 클래스 A, 
//      pack02 패키지 내부에는 클래스 B가 정의돼 있다. 
//      클래스 B 내부의 bcd() 메서드를 실행해 클래스 A의 객체 
//      생성 후 필드를 출력하려고 하니 오류가 발생했다.
// 2. 임포트를 사용하지 않고 클래스 B의 코드를 수정하시오
// 3. 임포트를 사용해 클래스 B의 코드를 수정하시오

package ch08_클래스외부구성요소.probs.prob2_prob3.pack02;

   //3번 문제 - import 사용 O

public class B {
	void bcd() {
//		A a = new A(); //오류
//		System.out.println(a.m);
//		System.out.println(a.n);
		
		// 2번 문제 - import 사용 X

	}
}
