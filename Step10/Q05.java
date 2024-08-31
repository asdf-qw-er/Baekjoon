package Step10;

import java.util.Scanner;

public class Q05 {

	private int GetArea(int maxX, int minX, int maxY, int minY) {
		return (maxX - minX) * (maxY - minY);
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int maxX = -10001, minX = 10001, maxY = -10001, minY = 10001;
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			if (x > maxX)
				maxX = x;
			if (x < minX)
				minX = x;
			if (y > maxY)
				maxY = y;
			if (y < minY)
				minY = y;
		}

		if (count < 2)
			System.out.println(0);
		else
			System.out.println(GetArea(maxX, minX, maxY, minY));

		scanner.close();
	}

	public static void main(String[] args) {
		Q05 q = new Q05();
		q.__main__();
	}
}
