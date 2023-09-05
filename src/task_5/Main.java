package task_5;
import java.util.ArrayList;
/*
Створити class Main, у ньому створити список, додати вчителів, яких ви зможете згадати зі школи.
І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("teacher1");
        teachers.add("teacher2");
        teachers.add("bestTeacher");
        teachers.add("teacher4");
        teachers.add("teacher5");
        teachers.add("worstTeacher");

        int bestTeacherIndex = teachers.indexOf("bestTeacher");
        int worstTeacherIndex = teachers.indexOf("worstTeacher");

        System.out.println("Best teacher index: " + bestTeacherIndex);
        System.out.println("Worst teacher index: " + worstTeacherIndex);
        System.out.println(teachers);
    }
}
