import java.io.*;
import java.lang.*;
import java.util.*;




class MinMax {
    public Pairs<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        if(arr == null || arr.length ==0)return null;
        int min=arr[0];
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new Pairs<>(min, max);

    }
}



class Pairs<K, V> {
    private final K key;
    private final V value;

    public Pairs(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }

    public V getValue() { return value; }
}

class MinMaxInArray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the test case: ");
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            System.out.println("Enter space-separated integers for test case " + (t + 1) + ":");
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

            MinMax ob = new MinMax();
            Pairs<Integer, Integer> pp = ob.getMinMax(arr);
            System.out.println(pp.getKey() + " " + pp.getValue());

            System.out.println("~");
        }
    }
}

