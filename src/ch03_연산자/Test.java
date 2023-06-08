package ch03_연산자;

import java.io.IOException;
import java.util.Scanner;

public class Test {



    public static void main(String[] args) throws IOException {
        //함수가 아닌 Test 라는 class에 소속되어 있기 때문에 메소드라고 부름
        //반환 타입(void) main(메소드 명) (매개변수 타입 , 매개변수) 로 구성되어 있음
        //프로그램에서 출력스트림 System.out 이라는 클래스를 통해 콘솔로 전달이 되는 것 즉 System.out은 출력스트림임
        //그 중에서 println이라는 메소드를 사용한 것
//        System.out.println("kkk");
//        int a = System.in.read();
//
//        System.out.println(a + " " + (char)a);

        //read는 입력스트림에 데이터가 있으면 일단 읽어들임 1 + 엔터 3byte
        //read 는 1 byte만 읽기 때문에 5byte를 차지하는 '가'와 같은 글자는 제대로 인식하지 못함

        Scanner s = new Scanner(System.in); //생성자 메소드 : 객체를 생성할 때 클래스 이름에 괄호를 넣어서 객체를 생성함
        //프로그램과 콘솔 사이에 입력스트림(System.in)이라는 객체를 Scanner라는 객체로 전환시켜서 이용


    }


}
