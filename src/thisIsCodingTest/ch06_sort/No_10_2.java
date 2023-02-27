package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_10_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
