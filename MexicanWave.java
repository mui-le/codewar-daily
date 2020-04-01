package codewars.com;

public class MexicanWave {

    public static String[] wave(String str) {
        int t = str.replaceAll(" ", "").toCharArray().length;
        String[] arr = new String[t];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                arr[index] = str.substring(0, i)
                        + String.valueOf(str.charAt(i)).toUpperCase()
                        + str.substring(i + 1, str.length());
                index++;
            }
        }
        return arr;
    }
}
