//You are given an array strarr of strings and an integer k.
//Your task is to return the first longest string consisting of k 
//consecutive strings taken in the array.
//Example:
//longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
//n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
package codewars.com;

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }
        int index = 0;
        int maxStr;
        int max = 0;
        String result = "";
        for (int i = 0; i < k; i++) {
            max = max + strarr[i].length();
        }
        for (int i = 1; i <= (strarr.length - k); i++) {
            maxStr = 0;
            for (int j = 0; j < k; j++) {
                maxStr = maxStr + strarr[i + j].length();
            }
            if (max < maxStr) {
                max = maxStr;
                index = i;
            }
        }
        for (int i = 0; i < k; i++) {
            result = result + strarr[index + i];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        String s = longestConsec(str, 2);
        System.out.println(s);
    }
}
