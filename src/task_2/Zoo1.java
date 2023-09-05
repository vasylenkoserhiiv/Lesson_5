package task_2;
/*
Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.
 */
import java.util.ArrayList;
import java.util.ListIterator;

public class Zoo1 {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "animal1");
        zoo.add(1, "animal2");
        zoo.add(2, "animal3");
        zoo.add(3, "animal4");
        zoo.add(4, "animal5");
        zoo.add(5, "animal6");
        zoo.add(6, "animal7");
        zoo.add(7, "animal8");

        zoo.remove(7);
        zoo.remove(4);
        zoo.remove(2);

        System.out.println(zoo.size() + "\n");

        ListIterator<String> listIterator = zoo.listIterator();
        while (listIterator.hasNext()){
            String tmp = listIterator.next();
            System.out.println(tmp);
        }
    }
}
