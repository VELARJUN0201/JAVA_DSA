import java.io.*;
import java.util.*;

public class HM {
    public static void main(String[] args){
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Maya");
        students.put(2, "Arun");
        students.put(3, "Priya");
        students.put(2, "Ravi");

        System.out.println(students.containsKey(2));
        System.out.println(students.get(2));

        students.remove(1);

        System.out.println(students.size());

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        students.clear();
        System.out.println(students.isEmpty());
    }
}
