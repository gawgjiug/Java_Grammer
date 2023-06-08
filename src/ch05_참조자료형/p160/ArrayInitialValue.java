// 5.1 배열 - 참조 변수와 배열 객체 원소값 초기화

package ch05_참조자료형.p160;

import java.util.Arrays;

public class ArrayInitialValue {

	public static void main(String[] args) {
		// stack 메모리 초기값 (강제초기화 X) - 지역변수
//		int value1;
//		System.out.println(value1);	//오류
//		int[] value2= null;
//		System.out.println(value2);	//오류

//		int value3 = 0;
//		System.out.println(value3); 
//		int[] value4 = null;
//		System.out.println(value4);

		// heap 메모리 초기값 (강제초기화 O)
//		boolean[] array1 = new boolean[3];  // false로 초기화 됨
//		for(int i=0; i<3; i++) {
//			System.out.print(array1[i]+ " ");
//		}

//		int[] array2 = new int[3];
//		for(int i=0; i<3; i++) {
//			System.out.print(array2[i]+ " ");
//		}

//		double[] array3 = new double[3]; 
//		for(int i=0; i<3; i++) {
//			System.out.print(array3[i]+ " ");
//		}

//		String[] array4 = new String[3]; 
//		for(int i=0; i<3; i++) {
//			System.out.print(array4[i]+ " ");
//		}
		
		// 기본자료형과 참조자료형 변수 복사의 차이점
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);

//		int[] array1 = new int[] {3, 4, 5};
//		int[] array2 = array1;
//		array2[0] = 7;
//		System.out.println(array1[0]);
//		System.out.println(array2[0]);
	}
}
