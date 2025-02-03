
//{ Driver Code Starts
import java.util.Scanner;

 public class sqrt_G {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter test case: ");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("enter the number");
            int a = sc.nextInt();
            lisqroot obj = new lisqroot();
            System.out.println(obj.floorSqrt(a));
            bisqroot obj1 =new bisqroot();
            System.out.println(obj1.floorSqrt2(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class lisqroot {
    int floorSqrt(int n) {
        // Your code here
        int ans =-1;
        for(int i=0; i<=n; i++){
            if(i*i<=n){
                ans =i;
            }
            else{
                break;
            }

        }
        return ans;
    }
}

class bisqroot{
    int floorSqrt2(int n){
        int low =1;
        int high = n;
        int mid =0;
        int ans =0;
        while (low<=high){
            mid=(low+high)/2;
         

            if (mid<=n/mid){
                ans=mid;
                low=mid+1;
            }
            else{
               high=mid-1;
            }
        }
        return ans;
    }
}
