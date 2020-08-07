package org.lizhiyang.leetcode;

import org.junit.Test;
import org.junit.Assert;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void testCase1() {
        int nums = this.solution.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, nums);
    }

    @Test
    public void testCase2() {
        int nums = this.solution.lengthOfLongestSubstring("bbbbb");
        Assert.assertEquals(1, nums);
    }

    @Test
    public void testCase3() {
        int nums = this.solution.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(3, nums);
    }

    @Test
    public void testCase4() {
        int nums = this.solution.lengthOfLongestSubstring("aab");
        Assert.assertEquals(2, nums);
    }

    @Test
    public void testCase5() {
        int nums = this.solution.lengthOfLongestSubstring("dvdf");
        Assert.assertEquals(3, nums);
    }

}
