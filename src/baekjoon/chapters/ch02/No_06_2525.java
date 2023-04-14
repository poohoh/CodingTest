package baekjoon.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_06_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int cook = Integer.parseInt(br.readLine());

        minute = minute + cook;

        if(minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
            if(hour>23)
                hour -= 24;
        }

        System.out.println(hour+" "+minute);
    }
}
