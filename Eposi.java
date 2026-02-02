import java.util.Scanner;

public class Eposi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            if(a%2==0)
                System.out.println("Even Positive");
            else
                System.out.println("ODD positive");
        }
        else
            System.out.println("Negative number");
    }
}