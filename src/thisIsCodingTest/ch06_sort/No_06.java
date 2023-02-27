package thisIsCodingTest.ch06_sort;

public class No_06 {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder();

        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] count = new int[10];

        /*
        // 카운트 배열 0으로 초기화
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        */

        // 각 데이터에 해당하는 인덱스 값 증가
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // 각 인덱스 개수만큼 출력
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append(i + " ");
            }
        }

        System.out.println(sb);
    }
}
