public class CountMaximumConsecutive {
    static int findMaxConsecutive(int[] nums) {
        int cnt = 1; // At least one element exists
        int maxi = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                cnt++;
            } else {
                cnt = 1; // Reset the count for a new number
            }
            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 0, 0, 0, 1, 1};
        System.out.println("Maximum consecutive occurrence: " + findMaxConsecutive(nums));
    }
}
