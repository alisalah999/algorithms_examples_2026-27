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

    /*    input   : nums (array of integers)
          output  : lowest value in nums

          set min to nums[0]

          for each index i from 1 up to nums.length - 1:
            if nums[i] is less than min:
                update min to nums[i]
          end for

          return min
    */
    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    /*    input   : nums (array of integers), value (integer)
      output  : how many times value appears in nums

      set total to 0

      for each index i from 0 up to nums.length - 1:
        if nums[i] equals value:
            increase total by 1
      end for

      return total
*/
    public static int count(int[] nums, int value) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                total++;
            }
        }
        return total;
    }
    /*    input   : nums (array of integers)
      output  : the value that appears most often

      set mostFrequent to nums[0]
      set highestCount to 0

      for each index i from 0 up to nums.length - 1:
        set currentCount to count(nums, nums[i])

        if currentCount is greater than highestCount:
            update highestCount to currentCount
            update mostFrequent to nums[i]
      end for

      return mostFrequent
*/
    public static int getMostFrequent(int[] nums) {
        int mostFrequent = nums[0];
        int highestCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentCount = count(nums, nums[i]);
            if (currentCount > highestCount) {
                highestCount = currentCount;
                mostFrequent = nums[i];
            }
        }
        return mostFrequent;
    }
    /*    input   : nums (array of integers), value (integer)
      output  : how many elements are greater than value

      set total to 0

      for each index i from 0 up to nums.length - 1:
        if nums[i] is greater than value:
            increase total by 1
      end for

      return total
*/
    public static int countGreater(int[] nums, int value) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > value) {
                total++;
            }
        }
        return total;
    }
    /*    input   : nums (array of integers)
      output  : how many elements are greater than the average

      calculate average using calcAverage(nums)

      set total to 0

      for each index i from 0 up to nums.length - 1:
        if nums[i] is greater than average:
            increase total by 1
      end for

      return total
*/
    public static int countGreaterThanAverage(int[] nums) {
        double average = calcAverage(nums);
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > average) {
                total++;
            }
        }
        return total;
    }

}
