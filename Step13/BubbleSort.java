package Step13;

public class BubbleSort {

	// 버블 정렬 메소드
	public static void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// 인접 요소를 비교하여 교환
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	// 메인 메소드: 배열을 정렬하고 출력
	public static void main(String[] args) {
		int[] array = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Given Array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();

		bubbleSort(array);

		System.out.println("\nSorted Array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
