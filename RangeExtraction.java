/*
individual integers
or a range of integers denoted by the starting integer separated 
from the end integer in the range by a dash, '-'. 
The range includes all integers in the interval including both endpoints. 
It is not considered a range unless it spans at least 3 numbers.
For example ("12, 13, 15-17")
Complete the solution so that it takes a list of integers in increasing order 
and returns a correctly formatted string in the range format.
Example:
Solution.rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
# returns "-6,-3-1,3-5,7-11,14,15,17-20"
 */
package codewars.com;

public class RangeExtraction {

    public static String rangeExtraction(int[] arr) {
        String s = "";
        int count;
        int j, i = 0;
        while (i < arr.length - 1) {
            count = 1;
            j = i;
            while (arr[j] == arr[j + 1] - 1) {
                j++;
                count++;
                if (j == arr.length - 1) {
                    break;
                }
            }
            switch (count) {
                case 1:
                    s = s + String.valueOf(arr[i]) + ",";
                    break;
                case 2:
                    s = s + String.valueOf(arr[i]) + "," + String.valueOf(arr[i + 1]) + ",";
                    break;
                default:
                    s = s + String.valueOf(arr[i]) + "-" + String.valueOf(arr[j]) + ",";
                    break;
            }
            i = i + count;
            if (i == arr.length - 1) {
                s = s + String.valueOf(arr[i]) + ",";
            }
        }
        s = s.substring(0, s.lastIndexOf(","));
        return s;
    }

    public static void main(String[] args) {
        int[] arr1 = {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20, 22, 24, 25, 26, 28};
        int[] arr2 = {-3, -2, -1, 2, 10, 15, 16, 18, 19, 20};
        System.out.println(rangeExtraction(arr1));
        System.out.println(rangeExtraction(arr2));
    }
}
