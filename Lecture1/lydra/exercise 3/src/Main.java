import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt();
        System.out.println("Generated score: " + score);


        if(score >= 60) {
           System.out.println("You've passed the exam");
  } else {
System.out.println("You've failed");
}
}
}




