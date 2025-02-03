import java.util.Scanner;

public class suma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student id: ");
        int id = sc.nextInt();
        System.out.println("enter student name: ");
        String name = sc.next();
        System.out.println("enter student fees: ");
        Float fees = sc.nextFloat();
        System.out.println("enter student gender: ");
        char gen = sc.next().charAt(0);
        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("FEES: "+fees);
        System.out.println("GENDER: "+gen);
    }
}
