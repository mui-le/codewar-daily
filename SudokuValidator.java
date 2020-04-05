package codewars.com;

import java.util.ArrayList;
import java.util.List;

public class SudokuValidator {

    public static boolean check(int[][] sudo) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> checkList1 = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            String s1 = "";
            String s2 = "";
            for (int j = 0; j < 9; j++) {
                s1 = s1 + String.valueOf(sudo[i][j]);
                s2 = s2 + String.valueOf(sudo[j][i]);
            }
            list1.add(s1);
            list1.add(s2);
        }
        int h = 0;
        int k = 0;
        for (int g = 0; g < 3; g++) {
            for (int f = 0; f < 3; f++) {
                String s1 = "";
                for (int i = h; i < 3 + h; i++) {
                    for (int j = k; j < 3 + k; j++) {
                        s1 = s1 + String.valueOf(sudo[i][j]);
                    }
                }
                list2.add(s1);
                k += 3;
            }
            k = 0;
            h += 3;
        }
        for (String list : list1) {
            for (int i = 1; i < 10; i++) {
                if (!list.contains(String.valueOf(i))) {
                    return false;
                }
            }
            if (!checkList1.contains(list)) {
                checkList1.add(list);
            }

        }
        if (checkList1.size() != list1.size()) {
            return false;
        }
        for (String list : list2) {
            for (int i = 1; i < 10; i++) {
                if (!list.contains(String.valueOf(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        boolean check = check(sudoku);
        System.out.println(check);
    }
}
