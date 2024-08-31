package Step10;

import java.util.HashSet;
import java.util.Scanner;

public class Q06 {

	private void GetType(HashSet<Integer> Angle) {
		if (Angle.size() == 3)
			System.out.println("Scalene");
		else if (Angle.size() == 2)
			System.out.println("Isosceles");
		else if (Angle.size() == 1)
			System.out.println("Equilateral");
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		HashSet<Integer> Angle = new HashSet<Integer>();
		int totalAngle = 0;

		for (int i = 0; i < 3; i++) {
			int temp = scanner.nextInt();
			Angle.add(temp);
			totalAngle += temp;
		}

		if (totalAngle != 180)
			System.out.println("Error");
		else
			GetType(Angle);

		scanner.close();
	}

	public static void main(String[] args) {
		Q06 q = new Q06();
		q.__main__();
	}
}
