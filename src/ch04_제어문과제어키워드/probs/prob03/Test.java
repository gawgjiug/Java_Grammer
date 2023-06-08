// 3. 다음과 같이 출력되도록 if 문과 break, continue를 이용해 
//    for 문 코드를 완성하시오.
//    - 0, 2, 4, 6, 8, 10 

package ch04_제어문과제어키워드.probs.prob03;

public class Test {

	public static void main(String[] args) {
		for (int i=0;  ; i++) {
			if (i > 5){
				break;
			}
			System.out.print(i * 2 + " ");	// 0, 2, 4, 6, 8, 10
		}

//		if (i%2 == 1) continue; i가 홀수일 경우 i ++ 을 진행 그래서 짝수이자 i 가 11이 될경우엔 종료
//		if (i>10 )break;
//		System.out.println(i + " ");
	}
}
