// 7. 다음은 바깥쪽 10회, 안쪽 5회를 반복하는 이중 for 문이다.
//    라벨을 사용하여 i = 3, j = 2일 때 
//    이중 for 문을 한 번에 탈출하는 코드를 완성하시오. 

package ch04_제어문과제어키워드.probs.prob07;

public class Test {

	public static void main(String[] args) {
		HERE:
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(i + " " + j);
				if (i == 3 && j == 2)
					break HERE;
			}
		}
	}
}
