// 5.1 배열 - 2차원 배열

package ch05_참조자료형.p183;

import java.util.Arrays;

public class MultiArrayReadPrint {

	public static void main(String[] args) {
		// 2차원 배열 길이 1
//		int[][] array1 = new int[2][3];
//		System.out.println(array1.length); 
//		System.out.println(array1[0].length); 
//		System.out.println(array1[1].length); 

		// 2차원 배열 길이 2
//		int[][] array2 = new int[][] {{1,2},{3,4,5}};
//		System.out.println(array2.length); 
//		System.out.println(array2[0].length); 
//		System.out.println(array2[1].length); 

		// 2차원 배열 출력 1
//		int[][] array2 = new int[][] {{1,2},{3,4,5}};
//		System.out.print(array2[0][0]+" ");
//		System.out.print(array2[0][1]+" ");
//		System.out.println();
//		System.out.print(array2[1][0]+" ");
//		System.out.print(array2[1][1]+" ");
//		System.out.println(array2[1][2]);

		// 2차원 배열 출력 2
//		int[][] array2 = new int[][] {{1,2},{3,4,5}};
//		for(int i=0; i<array2.length; i++) {
//			for(int j=0; j<array2[i].length; j++) {
//				System.out.print(array2[i][j]+" ");
//			}
//			System.out.println();
//		}

		// 2차원 배열 출력 3
//		int[][] array2 = new int[][] {{1,2},{3,4,5}};
//		for(int[] array: array2) {
//			for(int k:array) {
//				System.out.print(k+" ");				
//			}
//			System.out.println();
//		}

		// 2차원 배열 출력 4
//		int[][] array = {{1,2},{3,4,5}};
//		System.out.println(Arrays.toString(array)); 
//		
//		String[][] array1 = {{"철수"}, {"영희", new String("성구")}};
//		System.out.println(Arrays.toString(array1));
//		
//		int[][] array2 = {{1,2},{3,4,5}};
//		System.out.println(Arrays.deepToString(array2)); 
//		
//		String[][] array3 = {{"철수"}, {"영희", new String("성구")}};
//		System.out.println(Arrays.deepToString(array3));
	}
}
