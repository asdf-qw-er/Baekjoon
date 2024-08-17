package Step04;

import java.util.HashSet;
import java.util.Scanner;

public class Question08 {

	 /*
	 * HashSet은 자바의 컬렉션 프레임워크 중 하나로, 중복을 허용하지 않는 집합(Set) 자료구조입니다.
	 * 
	 * 주요 특징:
	 * 중복된 요소를 허용하지 않음
	 * 순서가 없음
	 * 빠른 검색, 삽입, 삭제
	 * null 값 허용 
	 */

	private void Function() {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scanner.nextInt() % 42;

		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int value : arr) {
			if (!hashSet.contains(value))
				hashSet.add(value);
		}

		System.out.println(hashSet.size());

		scanner.close();
	}

	public static void main(String[] args) {
		Question08 q08 = new Question08();
		q08.Function();
	}
}
