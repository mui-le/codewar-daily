package NewTest;

import java.util.ArrayList;

public class Fix {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        ArrayList<String> listStr = new ArrayList<>();
        int count;
        for (int i = 0; i < elements.length; i++) {
            listStr.add(String.valueOf(elements[i]));
        }
        for (int i = 0; i < listStr.size(); i++) {
            count = 0;
            for (int j = 0; j < listStr.size(); j++) {
                if (listStr.get(i).equals(listStr.get(j))) {
                    count++;
                }
                if (count > maxOccurrences) {
                    listStr.remove(j);
                    count--;
                    j--;
                }
            }
        }
        int[] newArray = new int[listStr.size()];
        for (int i = 0; i < listStr.size(); i++) {
            newArray[i] = Integer.parseInt(listStr.get(i));
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1};
        int[] arr = deleteNth(elements, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
