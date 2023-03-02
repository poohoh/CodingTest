package thisIsCodingTest.ch08_dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_08 {

    static int[] currencies;
    static int[] money = new int[10001];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        currencies = new int[N];

        // 각 화폐 단위 입력
        for (int i = 0; i < N; i++) {
            currencies[i] = Integer.parseInt(br.readLine());
        }

        // 모든 돈에 대해 -1로 초기화
        for (int i = 0; i < 10001; i++) {
            money[i] = -1;
        }

        // 0원은 0개의 화폐로 만들 수 있으므로 0을 저장
        money[0] = 0;

        // 각 액수에 대한 최소한의 화폐 개수 배열 생성
        saveCount();

        System.out.println(money[M]);


    }

    public static void saveCount() {

        for (int i = 0; i < 10001; i++) {

            // 돈의 액수에 대해서 각 화폐단위마다 최소 개수 찾기
            for (int j = 0; j < currencies.length; j++) {

                // 액수 - 화폐가 음수이면 패스
                if (i - currencies[j] < 0) {
                    continue;
                }

                // 화폐만큼 작은 액수에 최소 개수가 존재하지 않을 때 (해당 액수를 주어진 화폐로 만들 수 없음)
                if (money[i - currencies[j]] == -1) {
                    continue;
                }

                // 현재 액수에 대한 화폐 개수가 주어져 있을 때는 비교
                if (money[i] != -1) {
                    money[i] = Math.min(money[i], money[i - currencies[j]] + 1);
                } else {
                    money[i] = money[i - currencies[j]] + 1;
                }
            }
        }
    }

    /*public static void saveCount(int x, int count) {

        // 10000을 넘어가는 수에 대해서는 중지
        if (x > 10000) {
            return;
        }

        // 해당 돈의 화폐 개수가 비어있지 않으면
        if (money[x] != -1) {
            // 더 적은 개수로 가능하다면 교환
            if (money[x] > count) {
                money[x] = count;
            }
        } else {    // 해당 액수의 화폐 개수가 비어 있으면 입력된 개수 저장
            money[x] = count;
        }

        // 현재 돈의 액수에서 각 화폐단위만큼 진행
        for (int i = 0; i < currencies.length; i++) {
            saveCount(x + currencies[i], count++);
        }

    }*/
}
