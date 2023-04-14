package baekjoon.ch02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_01_1330 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int a = Integer.parseInt( st.nextToken() );
            int b = Integer.parseInt( st.nextToken() );

            System.out.println((a>b)? ">" : ((a<b) ? "<" : "=="));
        } catch(Exception e) {

        }
    }
}
