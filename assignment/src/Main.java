
import java.util.Arrays;
 import java.util.List;
 import java.util.stream.Collectors;

 public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Paul", "Sara", "Ana");

        List<Student> students = names.stream()
                .map(name -> StudentUtils.createStudent(name))
                .collect(Collectors.toList());

        students.forEach(StudentUtils::printValues);
    }

 }