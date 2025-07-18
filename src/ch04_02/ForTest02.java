package ch04_02;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for ( int i=5;i>=0;i--) {
			System.out.println("i 값 : " + i);
		}
		
		System.out.println("======================");
		
		for ( int i=5;i<=10;i--) {
			System.out.println("i 값 : " + i);
			if (i == 0) {
				break; // for 문 while 문 같은 반복문을 강제 종료 - 순서 주의 ( 이 프로그램은 i 값 표시하고 멈춤)
					  // break 문은 if 문과 같이 사용
			}
		}

		
	}

}
