/*
 * ============================================================
 *  Problem  : Sum of Maximum and Minimum Element
 *  Sheet    : Love Babbar 450 — Arrays, Q2
 *  Platform : code360
 *  Link     : https://www.naukri.com/code360/problems/sum-of-max-and-min_1081476?topList=love-babbar-dsa-sheet-problems&utm_source=website&utm_medium=affiliate&utm_campaign=450dsatracker
 * ============================================================
 *  Approach :
 *  - Traverse the array once
 *  - Keep track of max and min elements
 *  - Return their sum
 *
 *  Time Complexity  : O(n)
 *  Space Complexity : O(1)
 * ============================================================
 */
import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for(int i = 0; i<n; i++)
      {
        if(max < arr[i])
        {
          max = arr[i];
        }
        if (min > arr[i])
        {
          min = arr[i];
        }
      }
      return max + min;
  }
}