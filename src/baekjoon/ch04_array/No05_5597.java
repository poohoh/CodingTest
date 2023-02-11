package baekjoon.ch04_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No05_5597 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input;

        boolean[] arr = new boolean[30];

        for (int i = 0; i < 28; i++) {
            input = Integer.parseInt(br.readLine());

            arr[input-1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!arr[i]) {
                System.out.println(i+1);
            }
        }
    }
}
