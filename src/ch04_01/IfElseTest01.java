package ch04_01;

public class IfElseTest01 {
//if-else if-else 문
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ● if-else if-else 문
		
		// 점수가 90점 이상이면 수, 80점 이상 90점 미만이면 우, 70점 이상 80점 미만이면 미, 60점 이상이면 양, 60점 미만이면 가를 출력하는 프로그램
		int score = 55;
		
		if (score >= 90) {
				System.out.println("수");
			}   
			else if(score >= 80 ) {
				System.out.println("우");
			}
			else if(score >= 70 ) {
				System.out.println("미");
			}	
			else if(score >= 60 ) {
				System.out.println("양");
			}	
			else { // if-else if-else if 문 -> else if 이하의 조건문 블럭이 모두 거짓일 때 출력되는 실행문 블럭
				System.out.println("가");
			}
			System.out.println("축하"); // -> 별개
	
			System.out.println(100*(1+100)/2);
			System.out.println(50*(1+99)+50);
			
			
			// 주의점
			
			// value 값이 10 이상 20 미만이면 통과를 출력하시오
			
			int value = 15;
			int value1 = 5;
			int value2 = 25;
			
			if (value >= 10 && value < 20) { // 10 <= value < 20 은 불가
				System.out.println("통과"); }
			
			if (value1 >= 10 && value1 < 20) { 
				System.out.println("통과");
			} else { System.out.println("불합격"); }
			
			if (value2 >= 10 && value2 < 20) { 
				System.out.println("통과");
			} else { System.out.println("불합격"); }
	}
}
