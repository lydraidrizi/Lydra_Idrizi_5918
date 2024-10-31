import java.util.Scanner;

class StudentScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first score (0-100): ");
        double score1 = scanner.nextDouble();
        System.out.print("Enter the second score (0-100): ");
        double score2 = scanner.nextDouble();
        System.out.print("Enter the third score (0-100): ");
        double score3 = scanner.nextDouble();


        if (score1 < 0 || score1 > 100 || score2 < 0 || score2 > 100 || score3 < 0 || score3 > 100) {
            System.out.println("Error: Scores must be between 0 and 100.");
            return;
        }


        double average = (score1 + score2 + score3) / 3;


        String performanceCategory;
        if (average >= 85) {
            performanceCategory = "Excellent";
        } else if (average >= 70) {
            performanceCategory = "Good";
        } else if (average >= 50) {
            performanceCategory = "Average";
        } else {
            performanceCategory = "Poor";
        }


        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Performance Category: " + performanceCategory);


        scanner.close();
    }
}
