package Array;

import java.util.*;

class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m + n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            temp[index++] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            temp[index++] = nums2[j];
        }

        Arrays.sort(temp);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        MergeSortedArrays sol = new MergeSortedArrays();
        sol.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}