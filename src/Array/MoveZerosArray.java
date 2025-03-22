package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosArray {
    public static int[] moveZeros(int n, int []a){
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
    }
}
//no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array of numbers: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        int[] answer = moveZeros(n,arr);
        System.out.println(Arrays.toString(answer));

    }
}