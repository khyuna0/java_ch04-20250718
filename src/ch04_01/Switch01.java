package ch04_01;

public class Switch01 {
// switch 문
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Switch 문 / switch (변수) {}
		
		int d = (int) (Math.random() * 6) + 1;
		
		switch (d) { 
			case 1:	// case n: n = 변수값이 가질 수 있는 경우의 수 -> 변수 (d) 값이 1 이면 출력하는 출력문 
				System.out.println("11111111111");
				System.out.println("일이 나왔습니다.");
			break;
				
			case 2:	 
				System.out.println("22222222222");
				System.out.println("이가 나왔습니다.");
			break;
			
			case 3:	 
				System.out.println("33333333333");
				System.out.println("삼이 나왔습니다.");
			break;
			
			case 4:	 
				System.out.println("44444444444");
				System.out.println("사가 나왔습니다.");
			break;
			
			case 5:	 
				System.out.println("55555555555");
				System.out.println("오가 나왔습니다.");
			break;
			
			case 6:	 
				System.out.println("66666666666");
				System.out.println("육이 나왔습니다.");
			break;

			default: // 모든 case number 값에 해당 안 되는 값일 때 출력 / default = 초깃값
			System.out.println("주사위에서 나올 수 없는 숫자가 입력되었습니다.");
			break;
		
		}
		
	
	}

}
