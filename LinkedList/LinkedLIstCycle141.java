package LinkedList;
import java.util.*;

public class LinkedLIstCycle141 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        int pos = s.nextInt();
        ListNode head = readInput(input);
        if (pos >= 0) createCycle(head, pos);
        boolean ans = hasCycle(head);
        System.out.println(ans);
    }

    public static ListNode readInput(String line) {
        if (line.isEmpty()) return null;
        String[] parts = line.split("\\s+");
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (String p : parts) {
            if (!p.isEmpty()) {
                curr.next = new ListNode(Integer.parseInt(p));
                curr = curr.next;
            }
        }
        return dummy.next;
    }


    public static void createCycle(ListNode head, int pos) {
        if (head == null) return;
        ListNode tail = head;
        ListNode join = null;
        int index = 0;
        while (tail.next != null) {
            if (index == pos) join = tail;
            tail = tail.next;
            index++;
        }
        if (pos == index) join = tail;
        if (join != null) tail.next = join;
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}

