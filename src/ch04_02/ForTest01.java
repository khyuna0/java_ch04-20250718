package ch04_02;

public class ForTest01 {
// 반복문 for 문
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		System.out.println("======================");
		
		// for 문 기본 양식 -> for (초기화; 조건식; 증감식) {실행문;}
 		
		int a = 0; //초기화 식 | 초기화 식을 실수로 저장할 일은 거의 없음
		
		// 1 ~ 5의 수를 더하는 프로그램
		for (int i=1; i<=5; i++) { // 초; 조; 증 | 조건문에 따라 반복할 횟수를 정함 - 조건식이 참일 때만 반복, 거짓이면 멈춤
			a = a + i;
			System.out.println("i 값 : " + i);
		}
		System.out.println(a);
		
		System.out.println("======================");
		
		// 안녕하세요 5번 출력
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요");
		}
		
		System.out.println("======================");
		
		// 1~10까지의 짝수만 출력
		for(int i=0; i<=10; i=i+2) { // 증감식 = 스텝 값 -> 얼마나 증가(감소)?
			System.out.println("i값 : " + i);
		}
		
		System.out.println("======================");
		
		// 1~10 사이의 홀수만 출력
		for(int i=1; i<=10; i=i+2) {
			System.out.println("i값 : " + i);
		}
		
		System.out.println("======================");
		
		// 1부터 100까지의 모든 수의 합을 구하시오
		int sum = 0; // (0으로 시작하는) 최종 값을 저장할 변수
		for (int i=1; i<=100; i++) {
			sum = sum + i; // 누적식 sum = sum + i; (sum += i)| i <= 100 까지 반복함 
			// System.out.println("sum 값 :" + sum); sum 값이 100번 찍힘
		} System.out.println("sum 값 : " + sum); // 최종 값
		
		System.out.println("======================");
		
		// 1~10 사이의 짝수만 출력하시오
		for(int i=1;i<=10;i++) { 
			if(i % 2 == 0) { // for 문 안에 if 문을 넣을 수 있음
				System.out.println("i값 : " + i);
			}
		}
		
		System.out.println("======================");
		
		// 1~10 사이의 홀수만 출력하시오
		for(int i=1;i<=10;i++) { 
			if(i % 2 != 0) { 
				System.out.println("i값 : " + i);
			}
		}
		
		
		
		
		
	}	
	
}
