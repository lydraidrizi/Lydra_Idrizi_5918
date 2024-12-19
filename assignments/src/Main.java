import java.util.Scanner;

class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        try {
            System.out.print("Enter a numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter a denominator: ");
            int denominator = scanner.nextInt();


            result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
        } finally {

            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}