package basic.exam3;

import java.util.Scanner;

public class MethodTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		int you = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("You : ");
		caption(you);

		System.out.println("Com : ");
		caption(com);

		switch ((you - com + 3) % 3) {
		case 1:
			System.out.println("당신의 승리입니다");
			break;
		case 2:
			System.out.println("당신의 패배입니다");
			break;
		default:
			System.out.println("무승부입니다.");
			break;
		}

	}

	private static void caption(int value) {
		// TODO Auto-generated method stub
		switch (value) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("에러");
			break;

		}
	}

}
