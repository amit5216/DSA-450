/*
 * ============================================================
 *  Problem  : Rotate an Array
 *  Sheet    : Love Babbar 450 — Arrays, Q6
 *  Platform : code360
 *  Link     : https://www.naukri.com/code360/problems/rotate-array_1230543?topList=love-babbar-dsa-sheet-problems&utm_source=website&utm_medium=affiliate&utm_campaign=450dsatracker&leftPanelTabValue=PROBLEM
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        k = k % n;  // handle k > n

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);
        
        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);
        
        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);
        
        return arr;
    }
    
    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            Collections.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
