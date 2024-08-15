package Step01;

import java.util.Scanner;

public class Question10 {

	private static void Function() {
		Scanner scanner=new Scanner(System.in);
		
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		
		int[] sep_num2=new int[3];
		sep_num2[0]=num2/100;
		sep_num2[1]=(num2/10)%10;
		sep_num2[2]=num2%10;
		
		for(int i=2;i>=0;i--) {
			System.out.println(num1*sep_num2[i]);
		}
		System.out.println(num1*num2);
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		Function();
	}
}
