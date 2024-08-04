import java.util.Scanner;

public class Project1 {

    // Simple Calculater

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int result = 0;

        System.out.println("Enter the first number ?");
        int n1 = sc.nextInt(); // Enter the first number

        System.out.println("Enter the second number ?");
        int n2 = sc.nextInt(); // Enter the second number

        System.out.println("Choose the symbol : + " + " - " + " * " + " / " + " % ");
        char symbols = sc.next().charAt(0);// Choose the symbols

        if (symbols == '+') { // You choose "+" for addition

            result = n1 + n2;
            System.out.println("Your answer is " + result);
        } else if (symbols == '-') { // You choose "-" for addition

            result = n1 - n2;
            System.out.println("Your answer is " + result);
        }

        else if (symbols == '*') { // You choose "*" for addition

            result = n1 * n2;
            System.out.println("Your answer is " + result);
        }

        else if (symbols == '/') { // You choose "/" for addition

            result = n1 / n2;
            System.out.println("Your answer is " + result);
        }

        else if (symbols == '%') { // You choose "%" for addition

            result = n1 % n2;
            System.out.println("Your answer is " + result);
        }

        else {

            System.out.println("Please check the code again !"); // if there is any type of error
        }
    }
}
