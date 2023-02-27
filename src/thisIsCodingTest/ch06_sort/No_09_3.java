package thisIsCodingTest.ch06_sort;

import javax.swing.plaf.FontUIResource;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No_09_3 {
    public static void main(String args[]) {
        List<Fruit2> fruits = new ArrayList<>();

        fruits.add(new Fruit2("사과", 5));
        fruits.add(new Fruit2("바나나", 2));
        fruits.add(new Fruit2("당근", 3));

        // Collections.sort(fruits, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(fruits, (o1, o2) -> o1.getScore() - o2.getScore());

        for (int i = 0; i < fruits.size(); i++) {
            System.out.print("(" + fruits.get(i).getName() + ", " + fruits.get(i).getScore() + ") ");
        }

    }
}

class Fruit2 {
    private String name;
    private int score;

    public Fruit2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
