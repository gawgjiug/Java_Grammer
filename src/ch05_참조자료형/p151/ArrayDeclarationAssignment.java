// 5.1 배열 - 배열 선언과 값 할당
// - 동일 자료형을 묶어 저장하는 참조 자료형
// - 생성시 크기 지정 필요하며 후에 변경 불가
// - 참조 자료형이 저장되는 힙 메모리 값은 강제 초기화
// - 지역 변수가 저장되는 스택 메모리 값은 초기화 필요
// - 모든 참조변수는 null로 초기화 가능

package ch05_참조자료형.p151;

public class ArrayDeclarationAssignment {

	public static void main(String[] args) {
		// 배열 선언과 생성
		int[] array1 = new int[3];	// int array1[] -> 시용 X
		int[] array2;	// null 초기화 가능
		array2 = new int[3];

		boolean[] array3 = new boolean[3];	// 기본자료형 배열
		int[] array4 = new int[5]; //int 는 0으로 초기화 됨
		double[] array5 = new double[7]; // 0.0으로 초기화 됨
		String[] array6 = new String[9];	// 참조자료형 배열 null로 초기화 되어있음

//		 배열 원소값 할당 1 - 배열 생성 후 각 원소에 할당
//		int[] array1 = new int[3];
//		array1[0]=3;
//		array1[1]=4;
//		array1[2]=5;
//		System.out.print(array1[0] + " " + array1[1] + " " + array1[2]);
//
////		 배열 원소값 할당 2 - 배열 생성시 모든 원소 할당(초기화)
////		int[] array2 = {3, 4, 5};
//		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
//
////		 배열 원소값 할당 3 - 배열 생성후 모든 원소 할당
////		int[] array3;
//		array3 = new int[] {3, 4, 5};	// array3 = {3, 4, 5}; 오류
//		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
	}
}
