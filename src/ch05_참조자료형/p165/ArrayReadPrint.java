// 5.1 배열 - 배열 출력
// - for-each
//   - for(각 원소 저장 변수 : 반복(집합)객체) {}
// - util 패키지의 Arrays 클래스의 toString() 메소드

package ch05_참조자료형.p165;

import java.util.Arrays;

public class ArrayReadPrint {

	public static void main(String[] args) {
		// 1차원 배열 길이
		int[] array = new int[] {3, 4, 5, 6, 7};
		System.out.println(array.length);

		// 1차원 배열 출력 1 - 각 원소 출력
//		int[] array = {3, 4, 5, 6, 7};
//		System.out.print(array[0]+" ");		
//		System.out.print(array[1]+" ");
//		System.out.print(array[2]+" ");
//		System.out.print(array[3]+" ");
//		System.out.print(array[4]+" ");

		// 1차원 배열의 출력 2 - for문
//		int[] array = new int[] {3, 4, 5, 6, 7};
//		for(int i=0; i<array.length; i++)	//시험문제에 5라고 적으면 0점
//			System.out.print(array[i] + " ");

		// 1차원 배열의 출력 3 - for-each문
		array = new int[]{3, 4, 5, 6, 7};
		for(int k : array) {
			System.out.print(k + " ");
		}

		// 1차원 배열의 출력 4 - Arrays 클래스 toString() 사용
//		int[] array = new int[] {3, 4, 5, 6, 7};
//		System.out.println(Arrays.toString(array)); 
//		
//		String[] array1 = {"철수", "영희", new String("성구")};
//		System.out.println(Arrays.toString(array1));
	}
}
