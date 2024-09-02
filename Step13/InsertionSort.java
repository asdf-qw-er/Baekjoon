package Step13;

public class InsertionSort {
	
	// 삽입 정렬 메소드
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // key보다 큰 요소를 한 칸씩 뒤로 이동
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key; // key를 올바른 위치에 삽입
        }
    }

    // 메인 메소드: 배열을 정렬하고 출력
    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6 };

        System.out.println("Given Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(array);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
