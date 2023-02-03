package ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_06_2108 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int temp, sum = 0;
        int num = Integer.parseInt(br.readLine());
        int[] cnt = new int[8001];      // -4000부터 4000까지 ( 입력값 + 4000 )
        int[] arr = new int[num];       // 정렬된 배열

        // cnt 배열 초기화
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = 0;
        }

        // 각 숫자 개수를 세어서 cnt배열에 저장
        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(br.readLine());
            sum += temp;
            cnt[temp + 4000]++;
        }

        // cnt 배열을 통해 정렬된 arr 배열 구하기
        int k = 0;

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                for (int j = 0; j < cnt[i]; j++) {
                    arr[k] = i - 4000;
                    k++;
                }
            }
        }

        // cnt 배열에서 가장 많은 수 구하기

        int maxCnt = Integer.MIN_VALUE;
        int minIdx = Integer.MAX_VALUE;
        boolean flag = false;       // 이전에 한 번만 같은 개수가 존재하는지
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxCnt) {                 // 더 많은 개수가 있는지
                maxCnt = cnt[i];
                minIdx = i - 4000;
                flag = true;
            } else if (cnt[i] == maxCnt && flag == true) {         // 같은 개수가 있는지
                minIdx = i - 4000;
                flag = false;
            }
        }

        System.out.println(Math.round((double) sum / num));
        System.out.println(arr[num / 2]);
        System.out.println(minIdx);
        System.out.println(arr[num - 1] - arr[0]);

    }
}