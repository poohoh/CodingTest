package baekjoon.ch04_array;

import java.util.Scanner;

public class No_06_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hit = new int[42];
        int count=0;
        int result;

        for(int i=0; i<10; i++) {
            result = sc.nextInt() % 42;

            if(hit[result] == 0) {
                count++;
                hit[result] = 1;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
