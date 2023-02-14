package baekjoon.ch10_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No_11_10814 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        Person[] persons = new Person[num];

        for (int i = 0; i < num; i++) {
            Person person = new Person();

            st = new StringTokenizer(br.readLine());

            person.setAge(Integer.parseInt(st.nextToken()));
            person.setName(st.nextToken());

            persons[i] = person;
        }

        Arrays.sort(persons, Comparator.comparingInt(Person::getAge));

        for (int i = 0; i < num; i++) {
            sb.append(persons[i].getAge()).append(' ').append(persons[i].getName()).append('\n');
        }

        System.out.println(sb);
    }

    static class Person {
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
