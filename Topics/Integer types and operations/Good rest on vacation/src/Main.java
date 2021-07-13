
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // get input
        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();
        int in3 = scanner.nextInt();
        int in4 = scanner.nextInt();
        /*
        in1 duration in days
        in2 total food cost per day
        in3 one-way flight cost
        in4 cost of one night in a hotel (the number of nights equal duration minus one)
        */

        int sum = (in1*((in4)+(in2)))+(in3*2)-in4;

        System.out.println(sum);
    }
}