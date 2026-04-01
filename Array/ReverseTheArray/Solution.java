/*
 * ============================================================
 *  Problem  : Reverse an Array
 *  Sheet    : Love Babbar 450 — Arrays, Q1
 *  Platform : code360
 *  Link     : https://www.naukri.com/code360/problems/reverse-the-array_1262298?topList=love-babbar-dsa-sheet-problems&utm_source=website&utm_medium=affiliate&utm_campaign=450dsatracker
 * ============================================================
 *  Approach : Two-pointer technique — swap from both ends
 *  Time     : O(n)
 *  Space    : O(1)
 * ============================================================
 */

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int left = m+1;
        int right = arr.size()-1;
        while(left<right)
        {
            int temp = arr.get(right);

            arr.set(right, arr.get(left));
            arr.set(left, temp);
            
            left++;
            right--;
        }
    }
}
