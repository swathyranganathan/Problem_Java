import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array of numbers:  ");
        int arr[] = new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        SecLarge obj = new SecLarge();
        int answer = obj.getSecondLargest(arr);
        System.out.println(answer);
    }
}
class SecLarge {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int large = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        int Slarge = -1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>Slarge && arr[j]!=large){
                Slarge = arr[j];
            }
        }
        return Slarge;
    }
}
