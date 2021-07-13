import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String out = scanner.next();
        out = out.substring(0,1);
        int set = Integer.parseInt(out);
        System.out.println(set);
    }
}
