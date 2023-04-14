package baekjoon.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_04_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int price = 0;
        int count = 0;
        String str;
        StringTokenizer st;

        for(int i=0; i<N; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");

            price = Integer.parseInt(st.nextToken());
            count = Integer.parseInt(st.nextToken());
            sum += price * count;
        }

        if(sum == totalPrice)
            System.out.println("Yes");
        else
            System.out.println("No");

        br.close();
    }
}
