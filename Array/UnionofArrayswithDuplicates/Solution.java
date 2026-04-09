/*
 * ============================================================
 *  Problem  : Union of Arrays with Duplicates
 *  Sheet    : Love Babbar 450 — Arrays, Q5
 *  Link     : https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
 * ============================================================
 */
package Array.UnionofArrayswithDuplicates;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int n : a)
        {
            set.add(n);
        }
        for(int n : b)
        {
            set.add(n);
        }
        return new ArrayList<>(set);
    }
} {
    
}
