package task_3;
import java.util.ArrayList;
import java.util.ListIterator;
/*
Створити клас Main, створити список цілих чисел і за допомогою ListIterator пройтись по списку і збільшити значення на 1.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(10);
        }

        ListIterator<Integer> listIterator = arr.listIterator();

        while (listIterator.hasNext()){
            int value = listIterator.next();
            listIterator.set(value + 1);
        }
        System.out.println(arr);
    }
}
