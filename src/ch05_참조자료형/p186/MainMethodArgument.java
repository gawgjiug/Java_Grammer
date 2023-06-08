// 5.1 배열 - main() 메소드의 매개변수

package ch05_참조자료형.p186;

import java.util.Arrays;

public class MainMethodArgument {

	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		//args 라는 매개변수에 값을 입력함 그 값을 인수라고 함
////
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
////
		System.out.println(Arrays.toString(args));

		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		System.out.println(s1 + s2 + s3);
////
////		int i1 = Integer.parseInt(s1);
////		int i2 = Integer.parseInt(s2);
////		int i3 = Integer.parseInt(s3);
////		System.out.println(i1 + i2 + i3);
////
////		for(String s : args) {
////			System.out.print(s);
////		}
	}
}
