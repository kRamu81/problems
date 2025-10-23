package LinkedList;
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Reverselist206 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("[]");
            return;
        }

        // Clean input like [1,2,3,4,5]
        line = line.replaceAll("\\[|\\]|,", " ");
        String[] parts = line.trim().split("\\s+");

        ListNode head = new ListNode(Integer.parseInt(parts[0]));
        ListNode curr = head;
        for (int i = 1; i < parts.length; i++) {
            curr.next = new ListNode(Integer.parseInt(parts[i]));
            curr = curr.next;
        }

        ListNode reverse = reverseList(head);
        printList(reverse);
    }

    static void printList(ListNode head) {
        ListNode temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(",");
            temp = temp.next;
        }
        System.out.println("]");
    }

    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
