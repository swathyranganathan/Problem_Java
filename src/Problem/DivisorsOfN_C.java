package Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisorsOfN_C {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int N = sc.nextInt();
        Divisor obj = new Divisor();
        List<Integer> divisors = obj.divisorOfN(N);
        System.out.println("Divisors of " + N + " are : "+divisors);
    }
}
class Divisor{
    public List<Integer> divisorOfN(int n){
        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i == 0)
                divisors.add(i);
        }
        return divisors;
    }
}
