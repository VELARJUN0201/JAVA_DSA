import java.util.*;
import java.io.*;
public class stackit {
    public static void main (String[] args){
        Stack <Integer> s = new Stack<>();
        s.push(5);
        s.push(3);
        s.push(7);
        s.push(8);
        s.push(10);
        s.push(27);
        s.push(4);
        s.push(6);
        s.push(32);
        System.out.println(s.peek());
        System.out.println(s);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
    }
}
