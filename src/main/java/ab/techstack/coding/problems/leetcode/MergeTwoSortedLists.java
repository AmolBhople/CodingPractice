package ab.techstack.coding.problems.leetcode;

/**
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example 1:
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * <p>
 * Example 2:
 * Input: l1 = [], l2 = []
 * Output: []
 * <p>
 * Example 3:
 * Input: l1 = [], l2 = [0]
 * Output: [0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both l1 and l2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        else if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        ListNode head = null;
        ListNode temp = null;
        while (l1 != null && l2 != null) {
            ListNode nextNode = null;
            if (l1.val > l2.val) {
                nextNode = l2;
                l2 = l2.next;
            } else {
                nextNode = l1;
                l1 = l1.next;
            }
            if (head == null) {
                head = temp = nextNode;
            } else {
                temp.next = nextNode;
                temp = nextNode;
            }
        }
        if (l1 == null) {
            temp.next = l2;
        } else if (l2 == null) {
            temp.next = l1;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
