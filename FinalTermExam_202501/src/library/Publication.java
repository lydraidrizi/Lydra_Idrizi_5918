package library;




abstract class Publication {

    String title, publisher;

    int publicationYear;



    Publication(String title, String publisher, int year) {

        this.title = title; this.publisher = publisher; this.publicationYear = year;

    }



    abstract void printDetails();

    abstract double getPublicationFee();

}



