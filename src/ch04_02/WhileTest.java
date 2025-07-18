package ch04_02;
// while 문
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 90;
		
		if(score > 70) {
			System.out.println("통과");
		}
		
		System.out.println("=========================");
		
		// while 문 -> 조건문이 거짓이 될 때까지 실행문 반복
		
//		while (score > 70) {
//			거짓을 만드는 조건문을 넣어야 함
//			System.out.println("통과"); }
		
		int i = 1;
		while(i <= 3) { // 반복할 횟수를 모를 때
			System.out.println("통과");
			i++;
		}
		System.out.println("축하");
		
		
		// do-while 문
		
		int kor = 80;
		
		while(kor >= 100) {
			System.out.println("코리아 파이팅");
		}
		
		do {
			System.out.println("코리아 파이팅");
		}
		
		while(kor >= 100); {
			System.out.println("코리아 파이팅");
		}
		
	}
 
}
