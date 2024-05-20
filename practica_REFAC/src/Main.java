import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            displayMenu();
            option = scan.nextInt();
            scan.nextLine();
            processOption(option);
        } while (option != 0);
    }

    private static void displayMenu() {
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. End");
    }

    private static void processOption(int option) {
        switch (option) {
            case 1:
                processOption1();
                break;
            case 2:
                processOption2();
                break;
            case 3:
                processOption3();
                break;
            case 0:
                break;
            default:
                System.out.println("WARNING!!! \nIt must be a value between 0 and 5");
        }
    }

    private static void processOption1() {
        System.out.println("intro: ");
        int num1 = scan.nextInt();
        System.out.println("intro: ");
        int num2 = scan.nextInt();
        if (isMax(num1, num2)) {
            System.out.println("aaa");
        } else {
            System.out.println("bbb");
        }
    }

    private static void processOption2() {
        double a = 2;
        double b = 3;
        double c = 1;
        calculateQuadraticEquation(a, b, c);
    }

    private static void processOption3() {
        List<OrderLineItem> lineItems = null;
        Order order = new Order(lineItems, 5.5);
    }

    public static boolean isMax(int a, int b) {
        return a > b;
    }

    public static void calculateQuadraticEquation(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        }
    }
}
