package task_1;
/*
Створити клас Zoo. У класі створити список, який записати 8 тварин через метод add(index, element). Вивести список у консоль.
 */
import java.util.ArrayList;
import java.util.ListIterator;
public class Zoo {
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

        ListIterator<String> listIterator = zoo.listIterator();

        while (listIterator.hasNext()){
            String str = listIterator.next();
            System.out.println(str);
        }
    }
}
