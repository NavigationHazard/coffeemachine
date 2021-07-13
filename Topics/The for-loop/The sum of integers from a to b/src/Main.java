import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a;
        // sum all integers between a and b as well as the sum of and
        for (int i = a+1; i < b; i++) {
            sum = sum + i;
        }
        System.out.println(sum+b);
    }
}