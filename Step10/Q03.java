package Step10;

import java.util.Scanner;

public class Q03 {

	private void GetPosition() {
		Scanner scanner = new Scanner(System.in);

		int[][] xArr = new int[2][2];
		int[][] yArr = new int[2][2];

		for (int i = 0; i < 3; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			boolean isSavedX = false;
			for (int j = 0; j < 2; j++) {
				if (xArr[j][0] == x) {
					xArr[j][1] += 1;
					isSavedX = true;
				}
			}
			if (!isSavedX) {
				for (int j = 0; j < 2; j++) {
					if (xArr[j][0] == 0) {
						xArr[j][0] = x;
						xArr[j][1] += 1;
						break;
					}
				}
			}

			boolean isSavedY = false;
			for (int j = 0; j < 2; j++) {
				if (yArr[j][0] == y) {
					yArr[j][1] += 1;
					isSavedY = true;
				}
			}
			if (!isSavedY) {
				for (int j = 0; j < 2; j++) {
					if (yArr[j][0] == 0) {
						yArr[j][0] = y;
						yArr[j][1] += 1;
						break;
					}
				}
			}
		}

		for (int i = 0; i < 2; i++)
			if (xArr[i][1] != 2)
				System.out.print(xArr[i][0] + " ");
		for (int i = 0; i < 2; i++)
			if (yArr[i][1] != 2)
				System.out.print(yArr[i][0]);
		scanner.close();
	}

	public static void main(String[] args) {
		Q03 q = new Q03();
		q.GetPosition();
	}
}
