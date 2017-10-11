package javadev_exam2;
import java.util.Random;
import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {

		System.out.println("Start game");
		Scanner s = new Scanner(System.in);
		String nums = "";
		int strike = 0;
		int ball = 0;
		int count = 0;
		int n = 0;

		while (true) {
			System.out.print("자리 수를 입력 : ");
			n = s.nextInt();
			if (n > 5) {
				System.out.println("최대 자리수는 5자리 입니다.");
			} else if (n < 1) {
				System.out.println("최소 1자리 입니다.");
			} else {
				break;
			}
		}

		// create number

		int[] value = new int[n];
		for (int i = 0; i < n; i++) {
			int v = value();
			while (i == 0 && v == 0) {
				v = value();
			}
			int j = 0;
			while (true) {
				if (j > i) {
					break;
				} else if (value[j] != v) {
					j++;
				} else {
					v = value();
					j = 0;
				}
			}
			value[i] = v;
		}

//		for (int i : value) {
//			System.out.print(i);
//		}
//		System.out.println();

		// execute game

		System.out.println("게임을 시작하지...");
		
		while (true) {
			count++;
			strike = 0;
			ball = 0;
			System.out.println("숫자를 입력하세요! : ");
			nums = s.next();

			if (nums.length() != n) {
				System.out.println("비교 할 수 없습니다.");
				continue;
			}

			String[] num = nums.split("");//string [] num에서 받은 값을 쪼갠다.
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (value[i] == Integer.parseInt(num[j])) {//쪼갠값을 값과 비교한다.
						if (i == j) {//쪼갠값이 일치하면
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike == n) {
				System.out.println(count + " 번 만에 맞추었습니다.");
				break;
			} else if (strike == 0 && ball == 0) {
				System.out.println("out!");
			} else {
				System.out.println(strike + " strike(s) & " + ball + " ball(s) //  count : " + count);
			}
		}
	}

	static int value() {
		int value = new Random().nextInt(10);
		return value;
	}
}
