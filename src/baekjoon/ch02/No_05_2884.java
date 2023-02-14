package baekjoon.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_05_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if(minute-45 <0) {
            minute += 15;
            if(hour==0)
                hour = 23;
            else
                hour -= 1;
        }
        else
            minute -= 45;

        System.out.println(hour+" "+minute);
    }
}
