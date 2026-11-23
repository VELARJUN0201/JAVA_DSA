import java.util.*;
import java.io.*;

public class HS {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(20);

        System.out.println(hs.contains(20));

        hs.remove(10);

        System.out.println(hs.size());

        for (Integer number : hs) {
            System.out.println(number);
        }

        hs.clear();
        System.out.println(hs.isEmpty());
    }
}
