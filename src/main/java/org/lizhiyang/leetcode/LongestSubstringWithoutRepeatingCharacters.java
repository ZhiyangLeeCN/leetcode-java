package org.lizhiyang.leetcode;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    private String set2String(Set<Character> set) {
        StringBuilder sb = new StringBuilder(set.size());
        for (Character character : set) {
            sb.append(character);
        }

        set.clear();
        return sb.toString();
    }

    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        String longSubString = "";
        Set<Character> set = new HashSet<>();

        int index = 0;
        int pos = 0;
        int len = s.length();

        while (pos < len) {

            Character c = null;
            if (index < len) {
                c = s.charAt(index);
            }

            if (null != c && !set.contains(c)) {
                set.add(c);
                index++;
            } else {
                pos++;
                index = pos;

                String subString = set2String(set);

                if (subString.length() > longSubString.length()) {
                    longSubString = subString;
                }
            }
        }

        return longSubString.length();
    }
}
