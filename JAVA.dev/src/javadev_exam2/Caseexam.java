package javadev_exam2;

import java.util.Scanner;

public class Caseexam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("점수를입력하세요."); 

	int n;
	n = sc.nextInt();
	
	switch (n/10){
	case 10:
	case 9:
		System.out.println("A");
	
		break;	
	case 8:

		System.out.println("B");
		break;
	case 7:
		System.out.println("C");
		break;
	case 6:
		System.out.println("D");
		break;
	case 5:
		System.out.println("F");
		break;
	}
}
}
