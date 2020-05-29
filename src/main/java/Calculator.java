import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose the menu item number:");
            System.out.println("1. Sum");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Sqrt");
            System.out.println("0. Exit");

            Scanner userInput = new Scanner(System.in);
            String chosenOperation = userInput.nextLine();
            System.out.println("Chosen item is: " + chosenOperation);

            if (chosenOperation.contains("0") || chosenOperation.contains("exit")) {
                System.out.println("Successfully finished, Goodbye!");
                break;
            }

            switch (chosenOperation) {
                case "1":
                    System.out.println("Type any 2 numbers to sum (use space between): ");
                    int firstSumNumber = userInput.nextInt();
                    int secondSumNumber = userInput.nextInt();
                    System.out.println("Result of sum operation is: " + sum(firstSumNumber, secondSumNumber) + "\n\nPlay again!");
                    break;
                case "2":
                    System.out.println("Type any 2 numbers to sub (use space between): ");
                    int firstSubNumber = userInput.nextInt();
                    int secondSubNumber = userInput.nextInt();
                    System.out.println("Result of sub operation is: " + sub(firstSubNumber, secondSubNumber) + "\n\nPlay again!");
                    break;
                case "3":
                    System.out.println("Type any 2 numbers to mul (use space between): ");
                    long firstMulNumber = userInput.nextLong();
                    long secondMulNumber = userInput.nextLong();
                    System.out.println("Result of mul operation is: " + mul(firstMulNumber, secondMulNumber) + "\n\nPlay again!");
                    break;
                case "4":
                    System.out.println("Type any 2 numbers to div (use space between): ");
                    double firstDivNumber = userInput.nextDouble();
                    double secondDivNumber = userInput.nextDouble();
                    System.out.printf("Result of div operation is: %.2f \n\nPlay again!\n", div(firstDivNumber, secondDivNumber));
                    break;
                case "5":
                    System.out.println("Type any number to sqrt: ");
                    double sqrtNumber = userInput.nextDouble();
                    System.out.printf("Result of sqrt operation is: %.2f \n\nPlay again!\n", sqrt(sqrtNumber));
                    break;
            }
        }
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static long mul(long firstNumber, long secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double div(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Can't divide to 0!");
        }
        return firstNumber / secondNumber;
    }

    public static double sqrt(double Number) {
        return Math.sqrt(Number);
    }
}

