package library;

import java.util.ArrayList;
import java.util.Scanner;




public class Demo {

    public static void main(String[] args) {

        ArrayList<Publication> publications = new ArrayList<>();

        Scanner sc = new Scanner(System.in);



        while (true) {

            System.out.println("1. Add Book   2. Add Magazine  3. Display All   4. Oldest  5. Newest  6. Avg Fee  7. Exit");

            switch (sc.nextInt()) {

                case 1 -> publications.add(new Book(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));

                case 2 -> publications.add(new Magazine(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextBoolean()));

                case 3 -> publications.forEach(Publication::printDetails);

                case 4 -> publications.stream().min((a, b) -> a.publicationYear - b.publicationYear).ifPresent(Publication::printDetails);

                case 5 -> publications.stream().max((a, b) -> a.publicationYear - b.publicationYear).ifPresent(Publication::printDetails);

                case 6 -> System.out.println(publications.stream().mapToDouble(Publication::getPublicationFee).average().orElse(0));

                case 7 -> { sc.close(); return; }

                default -> System.out.println("Invalid choice");

            }

        }

    }

}
