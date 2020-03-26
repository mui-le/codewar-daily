/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars.com;

/**
 *
 * @author Admin
 */
public class Validate {

    public static boolean validate(String n) {
        String[] s = n.split("");
        int tong = 0;
        boolean check = true;
        for (int i = s.length - 1; i >= 0; i--) {
            int k = Integer.parseInt(s[i]);
            if (!check) {
                k = k * 2;
                if (k > 9) {
                    String kString = String.valueOf(k);
                    k = Integer.parseInt(String.valueOf(kString.charAt(0)))
                            + Integer.parseInt(String.valueOf(kString.charAt(1)));
                }
            }
            check = !check;
            tong = tong + k;
        }
        return (tong % 10 == 0);
    }

    public static void main(String[] args) {
        System.out.println(validate("1230"));
    }

}
