package Step05;

import java.util.Scanner;

public class Q07 {

	public class testCase {
		private int repeat;
		private String value;

		public int getRepeat() {
			return repeat;
		}

		public void setRepeat(int repeat) {
			this.repeat = repeat;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		testCase[] arr = new testCase[scanner.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new testCase();
			arr[i].setRepeat(scanner.nextInt());
			arr[i].setValue(scanner.next());
		}

		for (int i = 0; i < arr.length; i++) {
			String result = "";
			for (int j = 0; j < arr[i].getValue().length(); j++)
				for (int k = 0; k < arr[i].getRepeat(); k++)
					result += arr[i].getValue().charAt(j);
			System.out.println(result);
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Q07 q = new Q07();
		q.Function();
	}
}
