package ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_02_2587 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int temp, sum = 0;

        for (int i = 0; i < 5; i++) {
            temp = Integer.parseInt(br.readLine());
            sum += temp;
            arr[i] = temp;
        }

        sort(arr);

        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int temp = arr[i];
            int idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (temp > arr[j]) {
                    temp = arr[j];
                    idx = j;
                }
            }

            swap(arr, i, idx);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
