import java.util.Scanner;

public class grade {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        if(marks<35){
            System.out.println("The student failed the exam");
                }
        else if(marks<45)
            System.out.println("The student just passed the exam");
        else if(marks<55)
            System.out.println("The student passed with third class");
        else if(marks<65)
            System.out.println("The student passed with second class");
        else if(marks<75)
            System.out.println("The student passed with first class");
        else if(marks<99)
            System.out.println("The student passed exam with distinction");
        else
            System.out.println("The student is secured 100%");


    }
}
