import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch = str.charAt(0);
        if(ch == 'J' || ch == 'j'){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}