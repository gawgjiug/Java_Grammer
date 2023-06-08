// 3. 다음 클래스 A 내부에는 int[] 객체를 입력 매개변수로 입력받아 
//    배열의 모든 원소를 합한 후 리턴하는 arraySum() 메서드가 정의돼 있다. 
//    다음과 같이 4가지 방법으로 arraySum() 메서드를 호출할 때 
//    오류가 발생하는 코드와 그 이유를 설명하시오.

package ch07_클래스내부구성요소.probs.prob03;

class A {
	int arraySum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}

public class Test {

	public static void main(String[] args) {
//		A a = new A();
//		int[] data1 = new int[] {1, 2, 3};
//		int[] data2 = {1, 2, 3}; 
//		System.out.println(a.arraySum(data1));
//		System.out.println(a.arraySum(data2));
//		System.out.println(a.arraySum(new int[] {1, 2, 3}));
//		System.out.println(a.arraySum({1, 2, 3})); //오류
	}
}
