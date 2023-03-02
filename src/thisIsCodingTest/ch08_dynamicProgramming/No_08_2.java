package thisIsCodingTest.ch08_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_08_2 {

    static int[] currencies;
    static int[] money = new int[10001];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        currencies = new int[N];

        // 화폐 단위 입력
        for (int i = 0; i < N; i++) {
            currencies[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(currencies);

        // 각 액수에 대한 화폐 개수 10001로 초기화
        for (int i = 0; i < 10001; i++) {
            money[i] = 10001;
        }

        // 모든 액수에 대한 화폐의 최소 개수를 저장
        saveCount();

        if (money[M] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(money[M]);
        } 


    }

    public static void saveCount() {

        // 0원은 0개의 화폐로 만들 수 있으므로 0 저장
        money[0] = 0;
        
        for (int i = 0; i < currencies.length; i++) {
            for (int j = currencies[i]; j < 10001; j++) {

                // 화폐 액수의 차이만큼 작은 액수를 만들 수 있다면 - 현재 액수도 만들 수 있음.
                if (j - currencies[i] != 10001) {
                    money[j] = Math.min(money[j], money[j - currencies[i]] + 1);
                }
            }
        }
    }
}
