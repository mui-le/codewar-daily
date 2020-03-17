package NewTest;

public class IsoGram {

    public static boolean isIsogram(String str) {
//        if(str.isEmpty()) return true;
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < str.length(); j++) {
//                if(String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(j))) && i != j){
//                    return false;
//                }
//            }
//        }
//        return true;

        return str.length() == str.toLowerCase().chars().distinct().count();//code tụi bá đạo
    }

    public static void main(String[] args) {
        String s = "aa";

        boolean check = isIsogram(s);
        System.out.println(check);
        System.out.println(s.toLowerCase().chars());
        System.out.println(s.toLowerCase().chars().distinct());
        System.out.println(s.toLowerCase().chars().distinct().count());

    }
}
