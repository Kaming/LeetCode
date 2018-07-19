package easy;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * Created by kaming on 2018/7/19.
 */
public class MergeTwoSortedLists {

    /**
     * Example:
     * <p>
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l111 = new ListNode(4);
        l1.next = l11;
        l11.next = l111;
        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(3);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;
        ListNode node = mergeTwoLists(l1, l2);
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            listNode = l1;
            listNode.next = mergeTwoLists(l1.next, l2);
        } else {
            listNode = l2;
            listNode.next = mergeTwoLists(l1, l2.next);
        }
        return listNode;
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
