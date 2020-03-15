
package NewTest;

import java.util.ArrayList;

public class twoSumImpro {

    public static int[][] twoSum(int[] numbers, int target) {
        ArrayList<String> lists = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    lists.add(String.valueOf(i) + String.valueOf(j));
                }
            }
        }
        if (lists.isEmpty()) {
            return null;
        }
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.size(); j++) {
                if (lists.get(i).charAt(0) == lists.get(j).charAt(1) && i != j
                        && lists.get(i).charAt(1) == lists.get(j).charAt(0)) {
                    lists.remove(j);
                    j--;
                    break;
                }
            }
        }
        int[][] newArray = new int[lists.size()][2];
        for (int i = 0; i < lists.size(); i++) {
            String t = lists.get(i);
            for (int j = 0; j < 2; j++) {
                newArray[i][j] = Integer.parseInt(String.valueOf(t.charAt(j)));
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 10, 5, 3, 3, 15};
        int[][] twoSum1 = twoSum(nums, 18);

        for (int i = 0; i < twoSum1.length; i++) {
            int count = 0;
            for (int j = 0; j < 2; j++) {
                System.out.print(twoSum1[i][j]);
                System.out.print(" ");
                count++;
                if (count == 2) {
                    System.out.println();
                }
            }
        }
    }

}
