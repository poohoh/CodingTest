package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_06_2108 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int temp, sum = 0;
        int num = Integer.parseInt(br.readLine());
        int[] cnt = new int[8001];      // -4000���� 4000���� ( �Է°� + 4000 )
        int[] arr = new int[num];       // ���ĵ� �迭

        // cnt �迭 �ʱ�ȭ
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = 0;
        }

        // �� ���� ������ ��� cnt�迭�� ����
        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(br.readLine());
            sum += temp;
            cnt[temp + 4000]++;
        }

        // cnt �迭�� ���� ���ĵ� arr �迭 ���ϱ�
        int k = 0;

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0) {
                for (int j = 0; j < cnt[i]; j++) {
                    arr[k] = i - 4000;
                    k++;
                }
            }
        }

        // cnt �迭���� ���� ���� �� ���ϱ�

        int maxCnt = Integer.MIN_VALUE;
        int minIdx = Integer.MAX_VALUE;
        boolean flag = false;       // ������ �� ���� ���� ������ �����ϴ���
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxCnt) {                 // �� ���� ������ �ִ���
                maxCnt = cnt[i];
                minIdx = i - 4000;
                flag = true;
            } else if (cnt[i] == maxCnt && flag == true) {         // ���� ������ �ִ���
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