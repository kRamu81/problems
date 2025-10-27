package LinkedList;
import java.util.*;


public class removeNthNode19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("[]");
            return;
        }


        String[] parts = line.replaceAll("\\[|\\]", " ").split("\\s+");

        ListNode head = new ListNode(Integer.parseInt(parts[0]));
        ListNode curr = head;
        for (int i = 1; i < parts.length; i++) {
            curr.next = new ListNode(Integer.parseInt(parts[i]));
            curr = curr.next;
        }

        int n = s.nextInt();
        head = removeNnode(head, n);
        printList(head);
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

    static ListNode removeNnode(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;


        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
