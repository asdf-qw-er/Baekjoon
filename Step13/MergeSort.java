package Step13;

public class MergeSort {
	
	 // 병합 정렬을 위한 메소드
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; // 중간 인덱스 계산

            // 좌측 절반 정렬
            mergeSort(array, left, mid);

            // 우측 절반 정렬
            mergeSort(array, mid + 1, right);

            // 정렬된 두 배열 병합
            merge(array, left, mid, right);
        }
    }

    // 두 개의 부분 배열을 병합하는 메소드
    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 임시 배열 생성
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // 데이터 복사
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }

        // 병합 과정
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // 남은 요소 추가
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // 메인 메소드: 배열을 정렬하고 출력
    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
