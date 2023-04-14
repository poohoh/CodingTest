package baekjoon.ch04_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_03_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int max = Integer.parseInt(st.nextToken());
        int min = max;
        int temp;

        for(int i=0; i<cnt-1; i++) {
            temp = Integer.parseInt(st.nextToken());

            if(temp>max)
                max = temp;

            if(temp<min)
                min = temp;
        }

        System.out.println(min+" "+max);

        br.close();
    }
}
