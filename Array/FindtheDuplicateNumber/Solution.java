/*
 * ============================================================
 *  Problem  : Find the Duplicate Number
 *  Sheet    : Love Babbar 450 — Arrays, Q1o
 *  Platform : Leetcode
 *  Link     : https://leetcode.com/problems/find-the-duplicate-number/
 * 
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i< nums.length; i++)
        {
            if(!set.add(nums[i]))
            return nums[i];
        }
        return 0;
    }
}