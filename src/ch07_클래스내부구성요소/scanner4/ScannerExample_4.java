// ScannerExample_4
//OPS { OPS = 출루율 + 장타율 }

package ch07_클래스내부구성요소.scanner4;
import java.util.Scanner;
class Player {
	String name;
	int hitter;
	int safety;

	double obp;
	double slg;



	Player() {

	}
	Player(String name, int hitter,int safety) {
		this.name = name;
		this.hitter = hitter;
		this.safety = safety;
	}

	void speak() {
		System.out.printf("%s의 타율은 %.3f입니다\n", this.name, (double)hitter/safety);
	}
	void speak(double obp,double slg){
		System.out.printf("%s의 OPS는 %.3f입니다\n",this.name,obp+slg);
	}


}

public class ScannerExample_4 {

	public static void main(String[] args) {
		Player[] players = null;
		boolean run = true;

		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.플레이어 수 | 2.기록 입력 | 3.타율 | 4.타율 분석 | 5.종료" );
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if(selectNo == 1) {
				System.out.print("플레이어 수> ");
				int playerNum = scanner.nextInt();
				players = new Player[playerNum];
			} else if(selectNo == 2) {
				for(int i=0; i< players.length; i++) {
					System.out.printf("선수%d 이름: ", i+1);
					String name = scanner.next();
					System.out.printf("선수%d 타수: ", i+1);
					int hitter = scanner.nextInt();
					System.out.printf("선수%d 안타 개수: ", i+1);
					int safety = scanner.nextInt();
					players[i] = new Player(name,hitter,safety);

				}
			} else if(selectNo == 3) {
				for(int i=0; i<players.length; i++) {
					players[i].speak();
					System.out.printf("%s의 출루율을 입력하세요: ", players[i].name);
					double obp =scanner.nextDouble();
					System.out.printf("%s의 장타율을 입력하세요: ", players[i].name);
					double slg = scanner.nextDouble();
					players[i].speak(obp,slg);
				}
			} else if (selectNo == 4) {
				double max = (double) players[0].hitter / players[0].safety; // 첫 번째 선수의 타율로 초기값 설정
				double sum = max; // 첫 번째 선수의 타율로 초기값 설정
				double avg = 0;
				for (int i = 1; i < players.length; i++) { // 두 번째 선수부터 반복문 실행
					double batavrage = (double) players[i].hitter / players[i].safety;
					max = (max < batavrage) ? batavrage : max;
					sum += batavrage;
				}
				avg = sum / players.length;
				System.out.printf("최고 타율 : %.2f\n",max);
				System.out.printf("평균 타율 : %.3f\n",avg);


			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
