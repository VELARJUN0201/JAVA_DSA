import java.util.*;
import java.io.*;

public class ll {
     static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){

        node h = new node(12);
        h.next = new node(15);

        node n = h;
        while (n!=null){
            System.out.println(n.data);
            n = n.next;
        }

    }
}
