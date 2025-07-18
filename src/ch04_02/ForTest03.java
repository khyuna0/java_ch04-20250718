package ch04_02;

import java.util.Iterator;

// 이중(중첩) for 문
public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 바깥 for 문 실행문 실행 2. 안쪽 for 문 실행문 실행 3. 바깥 for 문 조건식 결과에 맞게 반복
		for (int i=1;i<=4;i++) {
			System.out.println("안녕하세요");
			for(int j=1;j<=2;j++) {
				System.out.println("반갑습니다"); // 치환처럼 생각. 행렬 
			 }
		} 
		
		System.out.println("======================");
		
		//삼중 for 문
		for (int i=1;i<=4;i++) {
			System.out.println("안녕하세요");
			for(int j=1;j<=3;j++) {
				System.out.println("반갑습니다"); 
				for (int k=1;k<=2;k++) {
					System.out.println("감사합니다");
				}
			}
		}
		
		System.out.println("======================");
		
		
		
	}

}
