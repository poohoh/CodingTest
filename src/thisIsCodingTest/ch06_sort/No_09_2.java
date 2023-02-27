package thisIsCodingTest.ch06_sort;

import java.util.*;

public class No_09_2 {
    public static void main(String args[]) {
        List<Fruit1> fruits = new ArrayList<>();

        fruits.add(new Fruit1("바나나", 2));
        fruits.add(new Fruit1("사과", 5));
        fruits.add(new Fruit1("당근", 3));

        Collections.sort(fruits, new Comparator<Fruit1>() {
            @Override
            public int compare(Fruit1 o1, Fruit1 o2) {
                if (o1.getScore() < o2.getScore()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        for (int i = 0; i < fruits.size(); i++) {
            System.out.print("(" + fruits.get(i).getName() + ", " + fruits.get(i).getScore() + ") ");
        }

    }
}

class Fruit1 {
    private String name;
    private int score;

    public Fruit1(String name, int score) {
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
