package baekjoon.ch04_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_04_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(br.readLine());
        int maxCount = 1;
        int temp;

        for(int i=2; i<=9; i++) {
            temp = Integer.parseInt(br.readLine());
            if(temp>max) {
                max = temp;
                maxCount = i;
            }
        }

        System.out.println(max);
        System.out.println(maxCount);

        br.close();
    }
}
