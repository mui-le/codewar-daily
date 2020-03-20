/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters 
then it should replace the missing second character of the final pair with an underscore ('_').
Examples:
StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */
package codewars.com;

public class StringSplit {

    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s + "_";
        }
        String[] arrS = new String[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            arrS[i / 2] = s.substring(i, i + 2);
        }
        return arrS;
    }

    public static void main(String[] args) {
        String s = "abcdef";
        String[] arrS = solution(s);
        for (int i = 0; i < arrS.length; i++) {
            System.out.println(arrS[i]);
        }
    }
}
