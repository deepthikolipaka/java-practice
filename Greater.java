import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        System.out.println("enter c value");
        int c=sc.nextInt();
        if(a>b &&a>c)
            System.out.println(a+"is greater");
        else if(b>a && b>c)
            System.out.println(b+"is greater");
        else if(c>a && c>b)
            System.out.println(c+"is greater");
        else
            System.out.println("all input values are equal");
        sc.close();
    }
    
}
