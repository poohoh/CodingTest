package baekjoon.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_07_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int money = 0;

        if((a==b) && (b==c))
            money = 10000 + a*1000;
        else if((a==b) || (a==c))
            money = 1000 + a*100;
        else if((b==c))
            money = 1000 + b*100;
        else
            money = Math.max(a, Math.max(b, c))*100;

        System.out.println(money);
    }
}
