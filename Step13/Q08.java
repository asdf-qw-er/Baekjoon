package Step13;

import java.util.Scanner;

public class Q08 {

	public class Position {
		private int x;
		private int y;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	}

	private Position[] Sort(Position[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].getY() > arr[j + 1].getY()
						|| (arr[j].getY() == arr[j + 1].getY() && arr[j].getX() > arr[j + 1].getX())) {
					Position temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	private void PrintArray(Position[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i].getX() + " " + arr[i].getY());
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		Position[] arr = new Position[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Position();
			arr[i].setX(scanner.nextInt());
			arr[i].setY(scanner.nextInt());
		}

		arr = Sort(arr);
		PrintArray(arr);

		scanner.close();
	}

	public static void main(String[] args) {
		Q08 q = new Q08();
		q.__main__();
	}
}
