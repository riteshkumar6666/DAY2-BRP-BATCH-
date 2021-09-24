import java.util.Scanner;
public class IntOpt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("precedence of the operator");
        System.out.println("a");
        int a= sc.nextInt();
        System.out.println("b");
        int b= sc.nextInt();
        System.out.println("c");
        int c= sc.nextInt();

        int operation1= a+b*c;
        int operation2=a*b+c;
        double operation3=c+a/b;
        double operation4=a%b+c;

        System.out.println(" operation1: "+operation1);
        System.out.println(" operation2:  "+operation2);
        System.out.println("operation3:    "+operation3);
        System.out.println("operation4:     "+operation4);




    }
}
