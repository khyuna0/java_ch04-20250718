package ch04_01;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주사위를 굴려서 만약 3이 나오면 한글로 "삼이 나왔습니다." 를 출력하는 프로그램을 만드시오
		
		// Math.random() ->  0 ~ 1 사이 수 중 소수점 16자리까지의 수를 랜덤으로 수출해주는 라이브러리
		System.out.println(Math.random()); 
		
		System.out.println(Math.random() * 6 + " 이 나왔습니다."); // -> 실수 값으로 출력
		
		int d = (int) (Math.random() * 6) + 1; // -> integer 로 강제 형 변환. 1, 2, 3, 4, 5, 6 중 랜덤으로 하나를 변수에 저장
		
		if (d == 1) {
			System.out.println("일이 나왔습니다");}
		 else if (d == 2) {
			System.out.println("이가 나왔습니다");}
		 else if (d == 3) {
			System.out.println("삼이 나왔습니다");}
		 else if (d == 4) {
			System.out.println("사가 나왔습니다");}
		 else if (d == 5) {
			System.out.println("오가 나왔습니다");}
		 else {
			System.out.println("육이 나왔습니다");}
		
		
		// 로또 번호 출력 프로그램
		
		System.out.println((int) (Math.random() * 45) + 1 + "번"); 
		
		
	}

}
