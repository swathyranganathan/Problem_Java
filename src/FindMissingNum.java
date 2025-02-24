import java.util.Scanner;

class FindMissingNum {
    public int missingNumber(int[] nums) {
        // Loop from 0 to nums.length (inclusive) to find the missing number
        for (int i = 0; i <= nums.length; i++) {
            int flag = 0;
            // Check if the number i exists in the array
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    flag = 1;
                    break;
                }
            }
            // If i is not found in the array, return it as the missing number
            if (flag == 0) {
                return i;
            }
        }
        // This should never be reached
        return -1;
    }

    // Main method to get input from the user and test the missingNumber function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindMissingNum finder = new FindMissingNum();

        // Get array size from user
        System.out.print("Enter the size of the array (N): ");
        int N = sc.nextInt();

        // Input array elements from the user
        int[] nums = new int[N];
        System.out.println("Enter " + N + " numbers from 0 to " + N + " (with one number missing):");
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        // Find and print the missing number
        int missing = finder.missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}

