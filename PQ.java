import java.util.*;
import java.io.*;

public class PQ {
    public static void main(String[] args){
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        Q.add(12);
        Q.add(5);
        Q.add(9);
        Q.add(10);
        Q.add(2);
        System.out.println(Q);
        PriorityQueue<Integer> Qp = new PriorityQueue<>(Comparator.reverseOrder());
        Qp.addAll(Q);
        System.out.println(Qp);
        System.out.println("===============================================================");
        System.out.println(Q);
        for(int i = 0 ;i<=4;i++){
            Q.poll();
            System.out.println(Q);
        }
        System.out.println("===============================================================");
        System.out.println(Qp);
        for(int i = 0 ;i<=4;i++){
            Qp.poll();
            System.out.println(Qp);
        }
        System.out.println("===============================================================");



    }
}
