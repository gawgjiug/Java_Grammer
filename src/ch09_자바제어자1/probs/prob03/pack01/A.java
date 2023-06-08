// 2. 패키지 pack01 내에는 A.java, B.java 파일, 
//    패키지 pack02 내에는 C.java, D.java 파일이 있다. 
//    이들 4개의 소스 파일에서 클래스 A에 포함된 4개의 필드를 사용하고자 한다. 
//    이때 각 클래스 위치에서 사용할 수 있는 모든 필드를 쓰시오.

package ch09_자바제어자1.probs.prob03.pack01;

public class A {
	public int a;
	protected int b;
	int c;
	private int d;

	void abc() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
	}
}
