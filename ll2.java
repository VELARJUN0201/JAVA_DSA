import java.util.*;

public class ll2 {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    void insert(int num) {
        node newnode = new node(num);

        if (head == null) {
            head = newnode;
            return;
        }

        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    void remove() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
        }

        System.out.println("Removed: " + head.data);
        head = head.next;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ll2 list = new ll2();
        int choice;

        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Remove first node");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!input.hasNextInt()) {
                System.out.print("Please enter a number: ");
                input.next();
            }
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to insert: ");
                    while (!input.hasNextInt()) {
                        System.out.print("Please enter an integer: ");
                        input.next();
                    }
                    list.insert(input.nextInt());
                    System.out.println("Value inserted.");
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    list.remove();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Choose 1 to 4.");
            }
        } while (choice != 4);

        input.close();
    }
}