package task_4;
import java.util.ArrayList;
import java.util.Collections;
/*
створити клас Friends. За допомогою методів ArrayList додати масив імена друзів. Вивести список друзів, після
вивести список друзів, відсортувавши в алфавітному порядку.
 */
public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Anna");
        friends.add("Olha");
        friends.add("John");
        friends.add("Viktor");
        friends.add("Jack");

        System.out.println(friends);

        //friends.sort(null);

        Collections.sort(friends);
        System.out.println(friends);
    }
}
