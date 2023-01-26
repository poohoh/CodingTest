package ch08_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No06_9020 {
    private static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        prime = new boolean[10001];
        get_prime();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(br.readLine());
            print(input);
        }

    }

    private static void get_prime() {
        //소수: false, 소수 아님: true
        prime[0] = prime[1] = true;

        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if(prime[i])
                continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    private static void print(int input) {
        for (int i = input / 2; i > 0; i--) {
            if (!prime[i] && !prime[input - i]) {
                System.out.println(i + " " + (input-i));
                break;
            }
        }
    }
}
