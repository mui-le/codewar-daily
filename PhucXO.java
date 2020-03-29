package codewars.com;

public class PhucXO {

    public static boolean getXO(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                count++;
            } else if (str.charAt(i) == 'o') {
                count--;
            }
        }
        return count == 0;
    }
    //c2
//        return str.replace("o","").length() == str.replace("x","").length();

}
