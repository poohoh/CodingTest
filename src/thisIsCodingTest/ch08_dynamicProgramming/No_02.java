package thisIsCodingTest.ch08_dynamicProgramming;

public class No_02 {

    static long[] arr = new long[100];

    public static void main(String args[]) {
        System.out.println(fibo(50));
    }

    public static long fibo(int n) {

        // 종료 조건
        if (n == 1 || n == 2) {
            return 1;
        }

        // 이미 계산했던 항이면 계산했던 결과를 리턴
        if (arr[n] != 0) {
            return arr[n];
        }

        // 아직 계산하지 않은 항이면 계산한 후 배열에 저장
        arr[n] = fibo(n - 1) + fibo(n - 2);

        return arr[n];
    }
}
