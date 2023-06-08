// 7.2 메소드 - 참조 자료형 매개변수 값의 변화

package ch07_클래스내부구성요소.p238;

import java.util.Arrays;

public class ReferenceDataTypeArgument {
	
	public static void main(String[] args) {		
		int[] array = new int[] {1,2,3};		//만약 array가 아니라 클래스 형식의 타입인 것 시험문제
		modifyData(array);
		printArray(array);
	}	
	
	public static void modifyData(int[] a) {
		a[0]=4;
		a[1]=5;
		a[2]=6;
	}	
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
