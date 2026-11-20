import java.util.*;
import java.io.*;
public class Arlist {

    public static void main(String args[]){
     ArrayList<Integer> al = new ArrayList<>(Arrays.asList(28,45,31,29,74,34,19));
     System.out.println(al);
     al.add(17);
     al.add(60);
     System.out.println(al);
     al.remove(5);
     al.set(0,10);
     System.out.println(al);
     System.out.println(al.get(4));
     System.out.println(al.indexOf(45));

    }
}
