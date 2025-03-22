package HashMap;
import java.io.*;
import java.util.*;

class FindPairsSolution {
    public boolean findPairs(int arr[]) {
        // HashMap to store sum of pairs and their indices
        HashMap<Integer, int[]> map = new HashMap<>();

        // Iterate through all pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                // If sum is already present in the map, return true
                if (map.containsKey(sum)) {
                    return true;
                }

                // Store sum and indices in the map
                map.put(sum, new int[]{i, j});
            }
        }

        return false; // No pairs found
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of test cases:");
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            System.out.println("Enter the array elements:");
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            FindPairsSolution obj = new FindPairsSolution();
            boolean res = obj.findPairs(arr);

            System.out.println(res ? "true" : "false");
            System.out.println("~");
        }
    }

    static class SingleNumberSolution {
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

            HashMap.FindPairsSolution.SingleNumberSolution sol = new HashMap.FindPairsSolution.SingleNumberSolution();
            int result = sol.singleNumber(nums);
            System.out.println("Single number: " + result);
        }
    }
}
