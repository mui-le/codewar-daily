/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word.
Leave punctuation marks untouched.
Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !

 */
package codewars.com;

public class PigLatin {

    public static String pigIt(String str) {
        String s = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!"!".equals(arr[i]) && !"?".equals(arr[i])) {
                arr[i] = arr[i].substring(1, arr[i].length()) + arr[i].charAt(0) + "ay";
            }
            s = s + arr[i] + " ";
        }
        return s.trim();
       // return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static void main(String[] args) {
        String str = "Pig latin is cool !";
        System.out.println(pigIt(str));
    }
}
