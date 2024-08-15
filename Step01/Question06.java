package Step01;

import java.util.Scanner;

public class Question06 {

	private static void Function() {
		Scanner scanner=new Scanner(System.in);
		
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		Function();
	}
}
