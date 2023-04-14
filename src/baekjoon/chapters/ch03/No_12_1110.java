package baekjoon.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_12_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int original = Integer.parseInt(br.readLine());
        int temp = original;
        int count = 0;
        int a, b;

        while(true) {
            a = temp/10;
            b = temp%10;

            temp = b*10 + (a+b)%10;

            count++;

            if(temp == original)
                break;
        }

        System.out.println(count);

        br.close();
    }
}
