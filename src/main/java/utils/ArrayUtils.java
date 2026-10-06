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
        for(int i = 0; i < nums.length; i++){
            System.out.println("Index " + i + ": " + nums[i]);
        }
    }

}
