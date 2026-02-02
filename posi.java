import java.util.Scanner;

public class posi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c;
        System.out.println("Enter values");
        int a=sc.nextInt();
        if(a>0)
            System.out.println("the number is positive");
        else if(a<0)
            System.out.println("the number is negative");
        else
            System.out.println("Zero");
        sc.close();
    }
    
}
