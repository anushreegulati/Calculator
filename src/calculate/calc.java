package calculate;

import java.util.*;

public class calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printMenu();

        double ans = 0;
        int choice = inputChoice(scan);

        double num1 = inputNumber(scan);
        double num2 = inputNumber(scan);
        switch (choice) {
            case 1:
                ans = num1 + num2;
                break;
            case 2:
                ans = num1 - num2;
                break;
            case 3:
                ans = num1 * num2;
                break;
            case 5:
                ans = num1 % num2;
                break;
        }
        System.out.println("Answer is: " + ans);
    }

    private static double inputNumber(Scanner scan) {
        double num;
        System.out.println("Enter nos.");
        num = scan.nextDouble();
        return num;
    }

    private static int inputChoice(Scanner scan) {
        int choice;
        choice = scan.nextInt();
        return choice;
    }

    private static void printMenu() {
        System.out.println("MENU");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
    }
}
