import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random ();

        int score = random.nextInt();
        System.out.println("Generated score is :" + score);

        String grade;
        String message;
        if (score >= 90){
            grade = "A";
        }else if(score >= 80){
            grade = "B";{
        }else if(score >= 70){
                grade = "C";{
                }else if(score >= 60){
                    grade = "D";
                }else{
                    grade = "F";
                }
                switch (grade) {
                    case "A"
                        ;
                        message = "Exellent job!";
                        break;
                    case "B"
                        ;
                        message = "Great job!";
                        break;
                    case "C"
                        ;
                        message = "Good job!";
                        break;
                    case "D"
                        ;
                        message = "Needs inprovement!";
                        break;
                    case "F"
                        ;
                        message = "Failed!";
                        break;
                }


                }
            }



    }
}