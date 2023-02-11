package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_05_10989 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int temp, range = 10000000;

        int[] count = new int[range + 1];
        int[] arranged = new int[num];

        // count �迭 �ʱ�ȭ
        for (int i = 0; i < range + 1; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(br.readLine());
            count[temp]++;
        }

        /*int l = 0;
        for (int j = 0; j < range + 1; j++) {
            if (count[j] != 0) {
                for (int k = 0; k < count[j]; k++) {
                    arranged[l] = j;
                    l++;
                }
            }
        }*/

        int j = 0;
        for (int i = 0; i < range + 1; i++) {
            while (count[i] > 0) {
                arranged[j] = i;
                count[i]--;
                j++;
            }
        }

        for (int i = 0; i < num; i++) {
            sb.append(arranged[i]).append('\n');
        }

        System.out.println(sb);

    }
}
