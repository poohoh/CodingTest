package baekjoon.ch04_array;

import java.util.Scanner;

public class No_07_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int max = sc.nextInt();
        int sum = max;
        int temp;

        for(int i=0; i<count-1; i++) {
            temp = sc.nextInt();
            sum += temp;

            if(temp > max)
                max = temp;
        }

        System.out.println((double)sum/count / max * 100);
        sc.close();
    }
}
