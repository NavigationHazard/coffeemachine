import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int in1 = scanner.nextInt();
        int in2 = scanner.nextInt();
        int sum = in2 % in1;
        System.out.println(sum);
    }
}
