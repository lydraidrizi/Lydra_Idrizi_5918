
import java.util.Random;

public class StudentUtils {
    public static Student createStudent(String name){
        Random random = new Random();
        int indexNo = random.nextInt(10000) + 1;
        int age = random.nextInt(83) + 18;

        return new Student(name,indexNo, age);
    }
    public static void printValues(Student student){
        System.out.println("Name: " + student.getName());
        System.out.println("Index Number: " + student.getIndexNo());
        System.out.println("Age: " + student.getAge());
    }

}
