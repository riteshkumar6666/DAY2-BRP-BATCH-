public class SumOfTwoDice {
    public static void main(String[] args) {
        int die1=(int) (5*Math.random() +1);
        int die2=(int)  (9*Math.random() +1);

        int SumOfDice =die1+die2;

        System.out.println("DIE 1: "+die1);
        System.out.println("DIE 2:  "+die2);
        System.out.println("TOTAL:   "+SumOfDice);
    }
}
