package Step08;

import java.util.Scanner;

public class Q07 {

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int V = scanner.nextInt();

		// 마지막 날 전까지 올라야 할 거리
		int days = (V - B) / (A - B);
		// 마지막 날 전까지 올라간 뒤 V 미터를 도달했는지 확인
		if ((V - B) % (A - B) != 0)
			days++;
		System.out.println(days);

		scanner.close();
	}

	public static void main(String[] args) {
		Q07 q = new Q07();
		q.Function();
	}
}
