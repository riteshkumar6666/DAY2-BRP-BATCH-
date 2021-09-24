import java.util.Scanner;

public class Distance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            //Take the values from the user
            System.out.print("Enter the value of X :-");
            Double X=sc.nextDouble();
            System.out.print("Enter the value of Y :-");
            Double Y =sc.nextDouble();

            //Computation
             double Distance= Math.sqrt((X*X) + (Y*Y));
            System.out.print("Distance: "+Distance);

        }
}


