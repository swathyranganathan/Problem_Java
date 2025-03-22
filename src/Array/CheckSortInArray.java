package Array;

import java.util.Scanner;

public class CheckSortInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array of numbers:  ");
        int nums[] = new int[size];
        for(int i=0;i< nums.length;i++){
            nums[i]= sc.nextInt();
        }
        Check obj= new Check();
        boolean answer = obj.check(nums);
        System.out.println(answer);

    }
}
class Check {
    public boolean check(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
        }
        return count<=1;
    }
}
