package javadev_exam2;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// int n=1;
		// if(n==2){
		// System.out.println("여자");
		//
		// }
		// System.out.println("종료");
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("점수를 입력하세요: ");
		n= sc.nextInt();
		
		if (n == 100) {
			System.out.println("A+");
		}else if(90 <= n && n <=99 ){
			System.out.println("A");
			
		}else if(80 <=n && n <=89){
			System.out.println("B");
		}else if(70 <=n && n <=79){
			System.out.println("C");
		}else if(60 <=n && n <=69){
			System.out.println("D");
		}else if(0 <=n && n <=59){
			System.out.println("F");
		}




	}
}
