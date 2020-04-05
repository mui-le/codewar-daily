package codewars.com;

public class Keypad {

    static String[] keyBoard = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};

    public static int presses(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String kyTu = String.valueOf(str.charAt(i)).toUpperCase();
            for (String list : keyBoard) {
                count += list.indexOf(kyTu) + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(presses(",$F'mdSaZyyyMCLen"));

    }

}
