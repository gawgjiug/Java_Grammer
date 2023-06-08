// 4. 다음과 같이 5개의 원소가 있는 1차원 배열의 모든 원소를 순서대로 
//    출력하는 코드를 for-each 문을 이용해 작성하시오.

package ch05_참조자료형.probs.prob04;

public class Test {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4, 5};	// int[] a = {1, 2, 3, 4, 5}; 동일

		for (int arr : a) {
			System.out.println(arr + "");
		}
//		
	}
}
