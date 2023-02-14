package baekjoon.ch04_array;

import java.util.Scanner;

public class No_09_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        int sum = 0;
        double avg = 0.0;
        int count;

        for(int i=0; i<line; i++) {
            int students = sc.nextInt();
            int[] scores = new int[students];
            sum=0;
            count=0;

            for(int j=0; j<students; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            avg = (double) sum / students;

            for(int j=0; j<students; j++) {
                if(scores[j] > avg)
                    count++;
            }

            System.out.printf("%.3f%%\n", (double)count/students * 100);
        }

        sc.close();
    }
}
