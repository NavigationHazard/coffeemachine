import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // sum all integers between a and b as well as the sum of and
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(
                        "FizzBuzz"
                );

            } else if (i % 5 == 0) {
                System.out.println(
                        "Buzz"
                );
            } else if (i % 3 == 0) {
                System.out.println(
                        "Fizz"
                );
            } else System.out.println(i);
        }

    }
}