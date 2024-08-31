package Step12;

import java.util.Scanner;

public class Q04 {

	private int GetRepaintCount(char[][] Board, char StartWith) {
		char[][] newBoard = new char[8][8];

		newBoard[0][0] = StartWith;

		for (int i = 0; i < 8; i++) {
			if (i < 7) {
				if (newBoard[i][0] == 'W')
					newBoard[i + 1][0] = 'B';
				else
					newBoard[i + 1][0] = 'W';
			}

			for (int j = 0; j < 7; j++) {
				if (newBoard[i][j] == 'W')
					newBoard[i][j + 1] = 'B';
				else
					newBoard[i][j + 1] = 'W';
			}
		}

		int RepaintCount = 0;
		if (Board.length == 8 && Board[0].length == 8) {
			for (int i = 0; i < 8; i++)
				for (int j = 0; j < 8; j++)
					if (Board[i][j] != newBoard[i][j])
						RepaintCount++;
		} else {
			RepaintCount = Board.length * Board[0].length;
			for (int i = 0; i < Board.length - 7; i++) {
				for (int j = 0; j < Board[i].length - 7; j++) {
					int temp = 0;
					for (int a = 0; a < 8; a++)
						for (int b = 0; b < 8; b++)
							if (Board[i + a][j + b] != newBoard[a][b])
								temp++;
					if (temp < RepaintCount)
						RepaintCount = temp;
				}
			}
		}

		return RepaintCount;
	}

	private void __main__() {
		Scanner scanner = new Scanner(System.in);

		int r = scanner.nextInt();
		int c = scanner.nextInt();
		char[][] Board = new char[r][c];

		for (int i = 0; i < r; i++) {
			String temp = scanner.next();
			for (int j = 0; j < c; j++)
				Board[i][j] = temp.toCharArray()[j];
		}

		int w = GetRepaintCount(Board, 'W');
		int b = GetRepaintCount(Board, 'B');
		System.out.println(w < b ? w : b);

		scanner.close();
	}

	public static void main(String[] args) {
		Q04 q = new Q04();
		q.__main__();
	}
}
