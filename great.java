import java.util.Scanner;

public class great{
    public static void main(String [] Args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            System.out.println(a+"is greater");
        else if(a<b)
            System.out.println(b+"is greater");
        else
            System.out.println("Both are equal");
    }
}