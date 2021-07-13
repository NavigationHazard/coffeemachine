import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        str = str.replace("a", "b");
        System.out.println(str);
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'A'){
//                str.replac = 'b';
//            }
//        }
    }
}