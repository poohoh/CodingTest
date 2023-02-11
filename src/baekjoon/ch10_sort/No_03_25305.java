package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_03_25305 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int total = Integer.parseInt(st.nextToken());
        int cutLine = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[total];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (i1, i2) -> i2 - i1);      //Collections.reverseOrder()

        System.out.println(arr[cutLine - 1]);
    }
}
