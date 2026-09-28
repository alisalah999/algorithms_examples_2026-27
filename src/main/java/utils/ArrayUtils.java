package utils;
// this class for common array operations
public class ArrayUtils {
    /*    input   : nums (array of integers)
          output  : none (prints each index and value)

          for each index i from 0 up to nums.length - 1:
            print i and the value at nums[i]
          end for
    */
    public static void displayArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index " + i + ": " + nums[i]);
        }
    }

    /*    input   : nums (array of integers)
          output  : average (double)

          set total to 0
          for each index i:
            add nums[i] to total
          end for

          return total divided by nums.length as double
    */
    public static double calcAverage(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return (double) total / nums.length;
    }

    /*    input   : nums (array of integers)
          output  : highest value in nums

          set max to nums[0]

          for each index i from 1 up to nums.length - 1:
            if nums[i] is greater than max:
                update max to nums[i]
          end for

          return max
    */
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
