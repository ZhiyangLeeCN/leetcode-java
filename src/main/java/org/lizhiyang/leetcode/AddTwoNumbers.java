package org.lizhiyang.leetcode;

public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void addListNode(ListNode node, int v) {
        if (node.val < 0) {
            node.val = v;
        } else {
            ListNode nextNode = node;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }

            nextNode.next = new ListNode(v);
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addVal = 0;
        ListNode node = new ListNode(-1);
        ListNode iterL1Node = l1;
        ListNode iterL2Node = l2;

        while (iterL1Node != null || iterL2Node != null) {

            int sum = 0;

            if (iterL1Node != null) {
                sum += iterL1Node.val;
                iterL1Node = iterL1Node.next;
            }

            if (iterL2Node != null) {
                sum += iterL2Node.val;
                iterL2Node = iterL2Node.next;
            }

            if (addVal > 0) {
                sum += addVal;
                addVal = 0;
            }

            if (sum < 10) {
                this.addListNode(node, sum);
            } else {
                this.addListNode(node, sum % 10);
                addVal = 1;
            }

        }

        if (addVal > 0) {
            this.addListNode(node, addVal);
        }

        return node;
    }

}
