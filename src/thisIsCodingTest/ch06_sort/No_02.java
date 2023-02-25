package thisIsCodingTest.ch06_sort;

public class No_02 {
    public static void main(String args[]) {
        int[] arr = {3, 5};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
