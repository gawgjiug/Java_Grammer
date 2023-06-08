// 7.2 메소드 - 배열 매개변수가 있는 메소드 호출

package ch07_클래스내부구성요소.p235;

import java.util.Arrays;

public class ArrayArgumentMethod {
	
	public static void main(String[] args) {
		int[] ary = new int[] {1,2,3};
		printArray(ary);
		printArray(new int[] {4,5,6});		
		//a.printArray({1,2,3}); //오류		
	}	
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
