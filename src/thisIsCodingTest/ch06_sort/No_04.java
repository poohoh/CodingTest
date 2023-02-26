package thisIsCodingTest.ch06_sort;

public class No_04 {
    public static void main(String args[]) {
        int[] array = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(int[] array, int start, int end) {

        // 원소가 하나만 남은 경우 종료
        if (start >= end) {
            return;
        }

        int pivot = start;
        int left = start + 1, right = end;

        while (left <= right) {

            // 피벗보다 큰 데이터를 찾을 때까지 반복
            while (left <= end && array[left] <= array[pivot]) {
                left++;
            }

            // 피벗보다 작은 데이터를 찾을 때까지 반복
            while (right > start && array[right] >= array[pivot]) {
                right--;
            }

            // 엇갈린 경우 작은 값과 피벗을 교환
            if (left > right) {
                swap(array, right, pivot);
            } else {    // 엇갈리지 않은 경우 작은 값과 큰 값을 교환
                swap(array, left, right);
            }

        }

        quickSort(array, start, right - 1);
        quickSort(array, right + 1, end);

    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
