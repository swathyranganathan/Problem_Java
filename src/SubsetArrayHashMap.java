import java.io.*;
import java.lang.*;
import java.util.*;
public class SubsetArrayHashMap {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of test cases: ");
        int t = Integer.parseInt(read.readLine().trim());
        while (t-- > 0) {
            System.out.print("Enter elements of array a: ");
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] a = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                a[i] = Integer.parseInt(numsStr[i]);
            }
            System.out.print("Enter elements of array b: ");
            line = read.readLine().trim();
            numsStr = line.split(" ");
            int[] b = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                b[i] = Integer.parseInt(numsStr[i]);
            }
            Subset ob = new Subset();
            if (ob.isSubset(a, b))
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Subset {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        for(int j=0;j<b.length;j++){
            if(!map.containsKey(b[j]) || map.get(b[j])==0){
                return false;
            }
            map.put(b[j],map.get(b[j])-1);
        }
        return true;
    }
}
