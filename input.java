import java.util.Scanner;

public class input {
    public static void main(String [] Args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        if(a==b)
            System.out.println("A and B are equal");
        sc.close();
    }
}
