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

public class MergeTwoSortedLists21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line1 = s.nextLine().trim();
        String line2 = s.nextLine().trim();

        if (line1.isEmpty() && line2.isEmpty()) {
            System.out.println("[]");
            return;
        }

        ListNode l1 = buildList(line1);
        ListNode l2 = buildList(line2);

        ListNode merged = mergeTwoLists(l1, l2);
        printList(merged);
    }

    static ListNode buildList(String line) {
        if (line.isEmpty()) return null;

        line = line.replaceAll("\\[|\\]|,", " ").trim();
        if (line.isEmpty()) return null;

        String[] parts = line.split("\\s+");
        ListNode head = new ListNode(Integer.parseInt(parts[0]));
        ListNode curr = head;
        for (int i = 1; i < parts.length; i++) {
            curr.next = new ListNode(Integer.parseInt(parts[i]));
            curr = curr.next;
        }
        return head;
    }
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null) curr.next = l1;
        if (l2 != null) curr.next = l2;

        return dummy.next;
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
}
