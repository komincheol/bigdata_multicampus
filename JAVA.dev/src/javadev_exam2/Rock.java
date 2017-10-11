package javadev_exam2;
import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num;//컴퓨터가 낸거
	int scanValue = 0;
	Random random = new Random();
	num = random.nextInt(3);

	System.out.println("Random!" + num);

	System.out.println("입력:");

	String scanString = scan.nextLine();

	if (scanString.equals("가위")) {
		scanValue = 0;
	} else if (scanString.equals("바위")) {
		scanValue = 1;
	} else if (scanString.equals("보")) {
		scanValue = 2;
	}
	if (num == 0) {
		System.out.println("상대방은 가위");

	} else if (num == 1) {
		System.out.println("상대방은 바위");

	} else if (num == 2) {
		System.out.println("상대방은 보");
	}

	switch (scanValue) {

	case 0:
		if (num == 0) {
			System.out.println("비겼습니다.");
		} else if (num == 1) {
			System.out.println("졌습니다.");
		} else if (num == 2) {
			System.out.println("이겼습니다.");
		}
		break;
	case 1:
		if (num == 0) {
			System.out.println("이겼습니다.");
		} else if (num == 1) {
			System.out.println("비겼습니다.");
		} else if (num == 2) {
			System.out.println("졌습니다.");
		}
		break;

	case 2:
		if (num ==0 ) {
			System.out.println("졌습니다.");
		} else if (num == 1) {
			System.out.println("이겼습니다.");
		} else if (num == 2) {
			System.out.println("비겼습니다.");
		}
		break;
	}

	}
	
}

