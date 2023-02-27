package thisIsCodingTest.ch06_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No_10_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < num; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);

    }
}
