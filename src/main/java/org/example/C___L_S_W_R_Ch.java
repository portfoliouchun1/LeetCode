package org.example;

import java.util.HashMap;

//  todo:     TUSHUNMADIM
public class C___L_S_W_R_Ch {

        public int lengthOfLongestSubstring(String s) {

            HashMap<Character, Integer> map = new HashMap<>();
            int maxLength = 0;
            int left = 0;

            for (int right = 0; right < s.length(); right++) {
                char currentChar = s.charAt(right);


                if (map.containsKey(currentChar)) {
                    left = Math.max(left, map.get(currentChar) + 1);
                }


                map.put(currentChar, right);


                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }


}
