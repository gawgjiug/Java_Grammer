// 4.2 제어 키워드 - break 키워드

package ch04_제어문과제어키워드.p139;

public class BreakStatement {

	public static void main(String[] args) {
		// break 1
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			break;
//		}

//		for(int i=0; i<10; i++) {
//			if(i == 5) {
//				break;
//			}
//			System.out.print(i + " ");			
//		} 		

		// break 2
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j == 2) {
//					break; //가장 가까운 for문만을 빠져나가는 것임  i가 0일때 0 0 0 1 0 빠져나가서 다시 i가 1
//				}
//				System.out.println(i + ", " + j);
//			}
//		} 

		// break 3
//		POS1:	// break+label 이용
//		for(int i=0; i<5; i++) {	
//			for(int j=0; j<5; j++) {
//				if(j == 2) {
//					break POS1; //라벨을 이용 POS1이라는 라벨로 빠져나가라
//				}
//				System.out.println(i + ", " + j);
//			}
//		} 
	}
}
