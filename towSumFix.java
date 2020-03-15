package NewTest;

public class towSumFix {

    public static int[] twoSum(int[] numbers, int target) {
        int[] newArray = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    newArray[0] = i;
                    newArray[1] = j;
                    return newArray;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 10, 5, 3, 3, 15};
        int[] twoSum1 = twoSum(nums, 18);

        for (int i = 0; i < twoSum1.length; i++) {
            System.out.print(twoSum1[i] + " ");
        }
    }

}
