import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        
        //collect first 3 times and join them
        int first1 = scanner.nextInt();
        int first2 = scanner.nextInt();
        int first3 = scanner.nextInt();
        
        //sum up the seconds of the first time stamp
        int sum1 = ((first1 * 60)*60) + (first2 * 60) + first3;
        
        // colelct the other 3 times and join them
        int second1 = scanner.nextInt();
        int second2 = scanner.nextInt();
        int second3 = scanner.nextInt();
        
        //sum up the seconds of the second time stamp
        int sum2 = ((second1 * 60)*60) + (second2 * 60) + second3;
        
        //subtract time1 from time2 and print it
        int sum3 =  sum2 - sum1;
        
        System.out.println(sum3);
    }
}
