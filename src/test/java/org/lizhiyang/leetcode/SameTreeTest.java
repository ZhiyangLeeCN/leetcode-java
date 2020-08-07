package org.lizhiyang.leetcode;

import org.junit.Test;
import org.junit.Assert;
public class SameTreeTest {

    private SameTree sameTree = new SameTree();

    @Test
    public void testCase1() {
        SameTree.TreeNode pNode = new SameTree.TreeNode();
        pNode.val = 1;
        pNode.left = new SameTree.TreeNode(2, null, null);
        pNode.right = new SameTree.TreeNode(3, null, null);

        SameTree.TreeNode qNode = new SameTree.TreeNode();
        qNode.val = 1;
        qNode.left = new SameTree.TreeNode(2, null, null);
        qNode.right = new SameTree.TreeNode(3, null, null);

        Assert.assertTrue(this.sameTree.isSameTree(pNode, qNode));
    }

    @Test
    public void testCase2() {
        SameTree.TreeNode pNode = new SameTree.TreeNode();
        pNode.val = 1;
        pNode.left = new SameTree.TreeNode(2, null, null);
        pNode.right = null;

        SameTree.TreeNode qNode = new SameTree.TreeNode();
        qNode.val = 1;
        qNode.left = null;
        qNode.right = new SameTree.TreeNode(2, null, null);

        Assert.assertFalse(this.sameTree.isSameTree(pNode, qNode));
    }

}
