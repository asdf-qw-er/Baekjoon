package Step02;

import java.util.Scanner;

public class Question06 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int add = scanner.nextInt();

		hour += add / 60;
		minute += add % 60;

		if (minute >= 60) {
			hour += minute / 60;
			minute -= minute / 60 * 60;
		}
		if (hour >= 24) {
			hour -= 24;
		}

		System.out.println(hour + " " + minute);

		scanner.close();
	}

	public static void main(String[] args) {
		Question06 question06 = new Question06();
		question06.Function();
	}
}
