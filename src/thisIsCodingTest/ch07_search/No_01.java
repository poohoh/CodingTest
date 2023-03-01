package thisIsCodingTest.ch07_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_01 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        String target = st.nextToken();

        System.out.println("앞서 적은 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");

        String[] arr = new String[num];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < num; i++) {
            arr[i] = st.nextToken();
        }

        System.out.println(sequentialSearch(arr, target));
    }

    public static int sequentialSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i + 1;
            }
        }
        return -1;
    }
}
