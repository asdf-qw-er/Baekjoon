package Step01;

public class Question12 {

//	private static void Function() {
//		System.out.print
//		("\\    /\\\r\n"
//		+ " )  ( ')\r\n"
//		+ "(  /  )\r\n"
//		+ " \\(__)|");
//	}

	private static void Function() {
		System.out.print("\\    /\\\n" // /가 string에 포함되어 있고 개행문자가 들어갈 시 하나 더 추가.
				+ " )  ( ')\n" // /r과 /n은 같은 의미(운영체제 차이)
				+ "(  /  )\n" + " \\(__)|");
	}

	public static void main(String[] args) {
		Function();
	}
}
