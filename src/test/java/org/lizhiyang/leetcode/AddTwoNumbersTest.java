package org.lizhiyang.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class AddTwoNumbersTest {

    private AddTwoNumbers solution = new AddTwoNumbers();

    private AddTwoNumbers.ListNode initListNode(int ...args)
    {
        AddTwoNumbers.ListNode headNode = new AddTwoNumbers.ListNode(-1);
        AddTwoNumbers.ListNode curNode = headNode;

        for (int arg : args) {
            if (curNode.val < 0) {
                curNode.val = arg;
            } else {
                AddTwoNumbers.ListNode nextNode = new AddTwoNumbers.ListNode(arg);
                curNode.next = nextNode;
                curNode = nextNode;
            }
        }

        return headNode;
    }

    private boolean listNodeEq(AddTwoNumbers.ListNode listNode, int ...args)
    {
        AddTwoNumbers.ListNode iterNode = listNode;
        List<Integer> list = new ArrayList<>();
        while (iterNode != null) {
            list.add(iterNode.val);
            iterNode = iterNode.next;
        }

        if (list.size() != args.length) {
            return false;
        }

        for (int i = 0; i < args.length; i++) {
            if (args[i] != list.get(i)) {
                return false;
            }
        }

        return true;
    }

    @Test
    public void testCase1() {
        AddTwoNumbers.ListNode l1 = this.initListNode(1, 8);
        AddTwoNumbers.ListNode l2 = this.initListNode(0);

        AddTwoNumbers.ListNode result = this.solution.addTwoNumbers(l1, l2);
        Assert.assertTrue(this.listNodeEq(result, 1, 8));
    }

    @Test
    public void testCase2() {
        AddTwoNumbers.ListNode l1 = this.initListNode(5);
        AddTwoNumbers.ListNode l2 = this.initListNode(5);

        AddTwoNumbers.ListNode result = this.solution.addTwoNumbers(l1, l2);
        Assert.assertTrue(this.listNodeEq(result, 0, 1));
    }

    @Test
    public void testCase3() {
        AddTwoNumbers.ListNode l1 = this.initListNode(2, 4, 3);
        AddTwoNumbers.ListNode l2 = this.initListNode(5, 6, 4);

        AddTwoNumbers.ListNode result = this.solution.addTwoNumbers(l1, l2);
        Assert.assertTrue(this.listNodeEq(result, 7, 0, 8));
    }
}
