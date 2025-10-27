package LinkedList;
import java.util.*;

class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class AddtwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node l1 = readList(s);
        Node l2 = readList(s);
        Node res = addTwoNum(l1, l2);
        printList(res);
    }

    public static Node readList(Scanner s) {
        String line = s.nextLine().trim();
        if (line.isEmpty()) return null;
        String[] parts = line.split("\\s+");
        Node dummy = new Node(0);
        Node curr = dummy;
        for (String p : parts) {
            if (!p.isEmpty()) {
                curr.next = new Node(Integer.parseInt(p));
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public static void printList(Node head) {
        System.out.print("[");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(",");
            temp = temp.next;
        }
        System.out.println("]");
    }

    public static Node addTwoNum(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }
        return dummy.next;
    }
}
