package Step03;

import java.util.ArrayList;
import java.util.Scanner;

public class Question11 {

	public class testCase {
		private int A;
		private int B;

		public int getA() {
			return A;
		}

		public void setA(int a) {
			A = a;
		}

		public int getB() {
			return B;
		}

		public void setB(int b) {
			B = b;
		}
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		ArrayList<testCase> arrCase = new ArrayList<testCase>();

		while (true) {
			testCase temp = new testCase();
			temp.setA(scanner.nextInt());
			temp.setB(scanner.nextInt());

			if (temp.getA() == 0 && temp.getB() == 0)
				break;
			else
				arrCase.add(temp);
		}

		for (int i = 0; i < arrCase.size(); i++)
			System.out.println(arrCase.get(i).getA() + arrCase.get(i).getB());

		scanner.close();
	}

	public static void main(String[] args) {
		Question11 q11 = new Question11();
		q11.Function();
	}
}
