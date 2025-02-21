import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array of numbers: ");
        for(int i=0;i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number to search");
        int x= sc.nextInt();

        SearchSolution ss = new SearchSolution();
        int answer =ss.search(arr,x);
        System.out.println("Index:" + answer);
        sc.close();
    }
}
class SearchSolution {
    static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Return immediately when x is found
            }
        }
        return -1; // Return -1 if x is not found
    }
}

