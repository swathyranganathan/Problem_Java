import java.util.*;

class SingleNumberSolution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = hm.getOrDefault(nums[i], 0);
            hm.put(nums[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        SingleNumberSolution sol = new SingleNumberSolution();
        int result = sol.singleNumber(nums);
        System.out.println("Single number: " + result);
    }
}
