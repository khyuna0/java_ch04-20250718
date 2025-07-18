package ch04_02;

import java.util.Iterator;

public class ForStarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//별 찍기...
		
				for (int i=1;i<=4;i++) {
					System.out.println("*");
				}
				
				System.out.println("======================");
				
				for (int i=1;i<=4;i++) {
					System.out.print("*");
					for (int j=1;j<=4;j++) {
						System.out.print("*");
					} System.out.println(); // 줄바꿈 
				}
				
				System.out.println("======================");
				
				for (int i=1;i<=4;i++) { 
					for (int j=1;j<(i+1);j++) { // 내부 for 문의 반복 횟수를 내부 for 문으로 조절
						System.out.print("*");
					} System.out.println(); 
				}
				
				System.out.println("======================");
				
				for (int i=3;i>=0;i--) { 
					System.out.print("*");
					for (int j=1;j<i+1;j++) {
						System.out.print("*");
						System.out.print("");
					} System.out.println(); 
				}
				
				for (int i=4;i>0;i++) {
					for (int j=0;j<i;j++)
						System.out.println("*");
				}	System.out.println(); 
	}

}
