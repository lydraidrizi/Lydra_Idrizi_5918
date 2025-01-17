

import java.util.ArrayList;

public class PublicationData {
    public static ArrayList<String[]> getBooks() {
        ArrayList<String[]> books = new ArrayList<>();
        // Format: {title, publisher, publicationYear, author, ISBN, pageCount, publicationFee}
        books.add(new String[]{"Zlostorstvo i kazna", "Detska radost", "2018", "Fyodor Dostoevsky", "9786082408786", "362", "1500.00"});
        books.add(new String[]{"Majstorot i Margarita", "Kultura", "2016", "Mikhail Bulgakov", "9786082406616", "411", "2000.00"});
        books.add(new String[]{"Braḱa Karamazovi", "Trimaks", "2016", "Fyodor Dostoevsky", "9786084571361", "677", "1800.00"});
        books.add(new String[]{"Nji lule në mes të dimrit", "Feniks", "2019", "Ismail Kadare", "9789928309860", "205", "1400.00"});
        books.add(new String[]{"Groznica", "Makavej", "2020", "Žarko Kujundžiski", "9786082410864", "233", "1300.00"});
        return books;
    }

    public static ArrayList<String[]> getMagazines() {
        ArrayList<String[]> magazines = new ArrayList<>();
        // Format: {title, publisher, publicationYear, issueNumber, printedMonthly, publicationFee}
        magazines.add(new String[]{"National Geographic", "National Geographic Society", "2022", "4", "true", "400.00"});
        magazines.add(new String[]{"Forbes", "Integrated Whale Media Investments", "2023", "2", "true", "500.00"});
        magazines.add(new String[]{"Time", "Time USA, LLC", "2022", "19", "true", "350.00"});
        magazines.add(new String[]{"The Economist", "The Economist Group", "2023", "1", "false", "450.00"});
        magazines.add(new String[]{"Politiko", "Zoran Ivanov", "2022", "131", "true", "200.00"});
        return magazines;
    }
}
