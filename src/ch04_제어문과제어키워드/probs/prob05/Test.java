// 5. 다음 이중 for 문을 실행했을 때 ‘A’는 몇 회 출력되는지 쓰시오.

package ch04_제어문과제어키워드.probs.prob05;

public class Test {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.println("A");
			}
		}
		// i = 0 j = 0 A > i = 0 , j = 1 빠져나옴 , i = 1 , j = 0  >> A , i = 1 j = 0 break; i = 2 >>
		// i = 3 j = 0 > A  i= 4 j = 0 > A
		// A는 총 4번 출력 됨
		// i 가 2일때 continue를 통해서 j 가 증가 함 j 가 1이 되면서 다시 break
		//i 가 0~4 까지 2인 경우를 빼고 j가 0일 때만 A를 출력함
	}
}
