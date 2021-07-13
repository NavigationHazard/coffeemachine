

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long product = a;
        // sum all integers between a and b as well as the sum of and
        for (long i = a+1; i < b; i++) {
            product = product * i;

        }
        System.out.println(product);
    }
}