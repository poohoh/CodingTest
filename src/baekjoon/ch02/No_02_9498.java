package baekjoon.ch02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_02_9498 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int score = Integer.parseInt(br.readLine());

            if(score>=90) System.out.println("A");
            else if(score>=80) System.out.println("B");
            else if(score>=70) System.out.println("C");
            else if(score>=60) System.out.println("D");
            else System.out.println("F");
        } catch(Exception e){

        }
    }
}
