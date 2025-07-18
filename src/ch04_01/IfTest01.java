package ch04_01;

public class IfTest01 {
// if, if-else, if-else 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ● if 문
		
		// 조건식이 true 면 중괄호 {} 안의 실행문을 실행, false 면 건너뛰고 다음 코드 실행
		
		// 점수가 90점 이상이면 수 80점 이상이면 우 ... 60점 미만이면 가 출력 -> if 문 하나로는 x. 조건을 여러개 넣기 불가능
		
		int sc1 = 85;
		int sc2 = 90;
		int sc3 = 50;
		
		// 조건문이 여러개 필요한 프로그램을 만들 수는 없음
		
//		if (sc1 >= 90) {  
//			System.out.println("우수");
//		} -> 만들 수 없음
		
		// 점수가 90점 이상이면 합격 출력, 90점 미만이면 불합격 출력하는 프로그램
		
		if ( sc1 >= 90 ) {
		System.out.println("합격입니다"); // 실행문 a 블럭
		}
		System.out.println("불합격입니다"); // 실행문 b / 조건문이 false 값이기 때문에 실행문 a 건너뛰고 실행문 b 출력
		
		// ● if - else 문
		
		// 조건식이 true 면 실행문 a 블럭 실행 false 면 (else 이하) 실행문 b 블럭 실행
		
		if ( sc2 >= 90 ) { // if 값이 true 일 때 출력되는 실행문 블럭
			System.out.println("합격입니다"); 
		} else { // if 값이 false 일 때 출력되는 실행문 블럭
			System.out.println("불합격입니다"); 
		}
		
		System.out.println("축하합니다~");
		
		
		
		
	}
}