package baekjoon.ch04_array;

import java.util.Scanner;

public class No_08_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        char input;
        int score;
        int serial;

        for(int i=0; i<n; i++) {
            score = 0;
            serial = 1;

            String str = sc.nextLine();

            for(int j=0; j<str.length(); j++) {
                input = str.charAt(j);

                if(input == 'O') {
                    score += serial;
                    serial++;
                }
                else
                    serial = 1;
            }
            System.out.println(score);
        }

        sc.close();
    }
}
