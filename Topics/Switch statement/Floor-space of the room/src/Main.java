import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String roomShape = scanner.next();

        switch (roomShape) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double area = (a + b + c) / 2;
                double triangle = Math.sqrt(area * (area - a) * (area - b) * (area - c));
                System.out.println(triangle);
                break;

            case "rectangle":
                double ab = scanner.nextInt();
                double bb = scanner.nextInt();
                double rectangle = ab * bb;
                System.out.println(rectangle);
                break;

            case "circle":
                double pi = 3.14;
                double r = scanner.nextInt();
                double circle = pi * (r * r);
                System.out.println(circle);
                break;

            default:
                break;
        }


    }
}