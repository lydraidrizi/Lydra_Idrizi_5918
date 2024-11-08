
import java.util.ArrayList;



class Student {

    private String name;

    private int studentId;

    private double grade;



    public Student(String name, int studentId, double grade) {

        this.name = name;

        this.studentId = studentId;

        this.grade = grade;

    }



    public boolean isPassing() {

        return grade >= 60.0;

    }



    public void displayStudentInfo() {

        System.out.println("Student: " + name + ", ID: " + studentId + ", Grade: " + grade);

    }

}



 class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();



        students.add(new Student("Alice", 101, 85.5));

        students.add(new Student("Bob", 102, 55.0));

        students.add(new Student("Charlie", 103, 72.0));

        students.add(new Student("David", 104, 90.0));

        students.add(new Student("Eve", 105, 58.0));



        int passingCount = 0;



        for (Student student : students) {

            student.displayStudentInfo();

            if (student.isPassing()) {

                passingCount++;

            }

        }



        System.out.println("Number of students passing: " + passingCount);

    }

}