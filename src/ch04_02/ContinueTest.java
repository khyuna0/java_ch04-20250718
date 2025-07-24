package ch04_02;

public class ContinueTest {
	// continue 문 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// continue 문 -> for 문의 증감식, (do-)while 문의 조건식으로 이동 
		
		for(int i=1;i<=10;i++) { // 홀수 출력
			if( i % 2 == 0) {
				continue; // for 문의 증감식으로 이동
			}
			System.out.println(i);
		}
		
		System.out.println("=======================");
		
		for(int i=1;i<=10;i++) { // if 문의 조건식이 거짓이면 멈춤 -> 1 출력
			if( i % 2 == 0) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
