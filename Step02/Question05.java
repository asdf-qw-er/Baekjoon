package Step02;

import java.util.Scanner;

public class Question05 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		int minute = scanner.nextInt();

		if (minute >= 45) {
			hour -= 1;
			minute -= 45;
		} else {
			if (hour == 0)
				hour = 23;
			else
				hour -= 1;
			minute = 60 + (minute - 45);
		}
		System.out.println(hour + " " + minute);

		scanner.close();
	}

	public static void main(String[] args) {
		Question05 question05 = new Question05();
		question05.Function();
	}
}
