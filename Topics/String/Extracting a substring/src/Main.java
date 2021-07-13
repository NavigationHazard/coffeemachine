import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int fi = scanner.nextInt();
        int sc = scanner.nextInt();

        System.out.println(str.substring(fi,sc+1));
    }
}