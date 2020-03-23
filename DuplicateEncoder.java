package codewars.com;

public class DuplicateEncoder {

    public static String encode(String s) {
        s = s.toLowerCase();
        String str = "";
//        //cách 1: 
//        boolean check = false;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                check = false;
//                if (s.charAt(i) == s.charAt(j) && i != j) {
//                    check = true;
//                    str = str + ")";
//                    break;
//                }
//            }
//            if (!check) {
//                    str = str + "(";
//            }
//        }
//        return str;
       
     // cách 2
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                str = str + ")";
            } else {
                str = str + "(";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String s1 = ")()";
        String s = "()(";
        System.out.println(encode(s));
        System.out.println(encode(s1));
    }
}
