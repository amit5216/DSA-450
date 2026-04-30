import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class Solution {
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        ArrayList<String> result = new ArrayList<>();
        helper(str, 0, "", result);
        return result;
    }
    
    private static void helper(String str, int index, String current, ArrayList<String> result) {
        
        // Base case
        if (index == str.length()) {
            if (!current.equals("")) {   // skip empty subsequence
                result.add(current);
            }
            return;
        }
        
        // Include current character
        helper(str, index + 1, current + str.charAt(index), result);
        
        // Exclude current character
        helper(str, index + 1, current, result);
    }
}