import java.util.*;
public class Merge2Linkedlist {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String[] list1 = s.nextLine().split(" ");
        String[] list2 = s.nextLine().split(" ");

        int[] m = new int[list1.length];
        for(int i=0;i<list1.length;i++){
            m[i] = Integer.parseInt(list1[i]);
        }

        int[] n = new int[list2.length];
        for(int i=0;i<list2.length;i++){
            n[i] = Integer.parseInt(list2[i]);
        }

        ListNode l1 = buildList(m);
        ListNode l2 = buildList(n);

        ListNode merged = mergeTwoLists(l1, l2);
        printList(merged);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}
