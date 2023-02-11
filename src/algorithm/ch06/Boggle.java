package algorithm.ch06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boggle {

    static char[][] words = {
            {'d', 'd', 'd', 'd', 'd'},
            {'d', 'd', 'd', 'd', 'd'},
            {'d', 'd', 'd', 'd', 'd'},
            {'d', 'd', 'd', 'd', 'd'},
            {'d', 'd', 'd', 'd', 'd'}
    };

    static char[] word = {'d', 'd', 'd', 'd', 'd'};


    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean result = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                result = hasWord(words, word, i, j, 0);
            }
        }

        System.out.println(result);

    }

    public static boolean hasWord(char[][] words, char[] word, int x, int y, int wordCount) {

        // 위치가 전체 게임판을 벗어나는지 확인
        if (x < 0 || x > 4 || y < 0 || y > 4)
            return false;

        // 단어 길이보다 카운트가 길면 이전까지 일치한다는 의미이므로 true 리턴
        if (wordCount > word.length)
            return true;

        // 해당 위치의 단어가 일치하지 않으면 false 리턴
        if ((words[x][y] == word[wordCount]))
            return false;

        // 현재 위치에서 주변 위치의 단어들이 다음 단어와 일치하면 true 리턴
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (hasWord(words, word, i, j, wordCount + 1)) {
                    return true;
                }
            }
        }

        return false;
    }
}
