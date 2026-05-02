import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Solution {
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        ArrayList<String> res = new ArrayList<>();
        helper(str, 0, "", res);
        return res;
    }
    
    private static void helper(String str, int index, String current, ArrayList<String> res) {
        
        // Base case
        if (index == str.length()) {
            if (!current.equals("")) {   // skip empty subsequence
                res.add(current);
            }
            return;
        }
        
        // Include current character
        helper(str, index + 1, current + str.charAt(index), res);
        
        // Exclude current character
        helper(str, index + 1, current, res);
    }
}