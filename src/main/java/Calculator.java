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
                    System.out.println("Result of sum operation is: " + sum(firstSumNumber, secondSumNumber) + "\n\n" + "Play again!");
                    break;
                case "2":
                    System.out.println("Type any 2 numbers to sub (use space between): ");
                    int firstSubNumber = userInput.nextInt();
                    int secondSubNumber = userInput.nextInt();
                    System.out.println("Result of sub operation is: " + sub(firstSubNumber, secondSubNumber) + "\n\n" + "Play again!");
                    break;
                case "3":
                    System.out.println("Type any 2 numbers to mul (use space between): ");
                    long firstMulNumber = userInput.nextLong();
                    long secondMulNumber = userInput.nextLong();
                    System.out.println("Result of mul operation is: " + mul(firstMulNumber, secondMulNumber)+ "\n\n" + "Play again!");
                    break;
                case "4":
                    System.out.println("Type any 2 numbers to div (use space between): ");
                    int firstDivNumber = userInput.nextInt();
                    int secondDivNumber = userInput.nextInt();
                    System.out.println("Result of div operation is: " + div(firstDivNumber, secondDivNumber)+ "\n\n" + "Play again!");
                    break;
                case "5":
                    System.out.println("Type any number to sqrt: ");
                    double sqrtNumber = userInput.nextDouble();
                    System.out.println("Result of sqrt operation is: " + sqrt(sqrtNumber)+ "\n\n" + "Play again!");
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
        return firstNumber*secondNumber;
    }
    public static int div(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Can't divide to 0!");
        }
        return firstNumber / secondNumber;
    }
    public static double sqrt(double Number) {
        return Math.sqrt(Number);
    }
}

