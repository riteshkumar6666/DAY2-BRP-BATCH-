import java.util.Scanner;

import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("precedence of the operator");
        System.out.println("a");
        double a= sc.nextDouble();
        System.out.println("b");
        double b= sc.nextDouble();
        System.out.println("c");
        double c= sc.nextDouble();

        double operation1= a+b*c;
        double operation2=a*b+c;
        double operation3=c+a/b;
        double operation4=a%b+c;

        System.out.println(" operation1: "+operation1);
        System.out.println(" operation2:  "+operation2);
        System.out.println("operation3:    "+operation3);
        System.out.println("operation4:     "+operation4);

    }
}
