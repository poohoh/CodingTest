package ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_06_2108_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int temp, sum = 0, maxCnt = Integer.MIN_VALUE, maxValue;
        Integer count;

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(br.readLine());
            list.add(temp);
            count = map.get(temp);
            sum += temp;

            if (count == null) {
                count = 1;
                map.put(temp, count);
            } else {
                map.put(temp, ++count);
            }

            if (count > maxCnt) {
                maxCnt = count;
            }
        }

        List<Integer> maxCntList = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == maxCnt) {
                maxCntList.add(key);
            }
        }

        Collections.sort(list);
        Collections.sort(maxCntList);

        if (maxCntList.size() == 1) {
            maxValue = maxCntList.get(0);
        } else {
            maxValue = maxCntList.get(1);
        }

        System.out.println(Math.round((float) sum / num));
        System.out.println(list.get(num / 2));
        System.out.println(maxValue);
        System.out.println(list.get(num - 1) - list.get(0));
    }
}
