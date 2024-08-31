package Step10;

import java.util.Scanner;

public class Q02 {

	private int GetDistance(int x, int y, int w, int h) {
		int[] distance = new int[8];

		distance[0] = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		distance[1] = (int) Math.sqrt(Math.pow(x - w, 2) + Math.pow(y, 2));
		distance[2] = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y - h, 2));
		distance[3] = (int) Math.sqrt(Math.pow(x - w, 2) + Math.pow(y - h, 2));
		distance[4] = Math.abs(w - x);
		distance[5] = Math.abs(x);
		distance[6] = Math.abs(h - y);
		distance[7] = Math.abs(y);

		int min = 1000000;
		for (int i = 0; i < 8; i++)
			if (min > distance[i])
				min = distance[i];
		return min;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int w = scanner.nextInt();
		int h = scanner.nextInt();

		System.out.println(GetDistance(x, y, w, h));

		scanner.close();
	}

	public static void main(String[] args) {
		Q02 q = new Q02();
		q.__main__();
	}
}
