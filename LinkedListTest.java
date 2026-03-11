import java.util.Scanner;

public class LinkedListTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        while (true) {

            System.out.print("Enter student name (or type stop): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Enter age: ");
            int age = Integer.parseInt(input.nextLine());

            Student s = new Student(name, age);
            Node newNode = new Node(s);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            }
        }

        System.out.println("\nForward:");
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println("\nBackward:");
        current = tail;

        while (current != null) {
            System.out.println(current.data);
            current = current.previous;
        }

        input.close();
    }
}
