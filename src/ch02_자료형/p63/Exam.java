package ch02_자료형.p63;
//곽지욱 201947003
//    - 프로그램 첫번째 줄에 라인 코멘트 사용하여 이름과 학번 작성
//- 4개 이상의 (지역) 변수 사용 : koreaage(한국나이),name(이름),credit(학점),short(만 나이)
//- 4개 이상의 자료형 사용 : int,String,double,short
//- 4개 이상의 연산자 사용 :  = , + , - , *
//- main() 메소드에 10문장 이상 작성
//- 대소문자, 띄어쓰기, 줄 맞추기 주의
//- 수업에서 배운 내용으로 한정하여 프로그램 작성
//- 패키지 선언하지 말 것
//- 구글클래스에 자바 소스파일만 업로드할 것
//- 정해진 제출 기간에 업로드하지 않으면 무조건 0점 처리
public class Exam {
    public static void main(String[] args) {
        int koreaage = 24;
        String name = "곽지욱";
        double credit =4.23;
        short globalage = 23;

        System.out.println("안녕 내 이름은 " + name + " 이라고 해 ");
        System.out.println("내 나이는 "+ koreaage + "살 이고"+ " 만 나이는 "+ globalage + "이야");
        System.out.println("내 지난 학기 학점은 "+ credit + " 점 이야");
        System.out.println("내 키는 180에 2cm 모자란"  + (180- 2) + "cm야");
        System.out.println("내 몸무게는 " + (10*7) + "kg이야");
        System.out.println("나는 야구를 좋아하고 두산 베어스의 팬이야 작년에는 두산베어스가 "+ "8위로 시즌이 마감돼서 아쉬웠어");


    }

}
