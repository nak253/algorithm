package cote.inflearn.stackqueue;

import java.util.*;

public class Num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int index = scanner.nextInt();
        int count = 0;
        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            q.offer(new Person(i, scanner.nextInt()));
        }


        while (!q.isEmpty()) {
            Person p = q.poll();
            for (Person person : q) {
                if (p.riskNumber < person.riskNumber ) {
                    q.offer(p);
                    p = null;
                    break;
                }
            }
            if (p != null) {
                count ++;
                if (p.index == index){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

class Person {
    int index;
    int riskNumber;

    public Person(int index, int riskNumber) {
        this.index = index;
        this.riskNumber = riskNumber;
    }
}
