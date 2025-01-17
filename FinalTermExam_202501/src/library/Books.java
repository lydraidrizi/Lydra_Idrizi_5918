package library;

class Book extends Publication {

    String author, ISBN; int pageCount;



    Book(String title, String publisher, int year, String author, String ISBN, int pages) {

        super(title, publisher, year);

        this.author = author; this.ISBN = ISBN; this.pageCount = pages;

    }




    void printDetails() {

        System.out.printf("Book: %s, %s, %d, %s, %s, %d pages\n", title, publisher, publicationYear, author, ISBN, pageCount);

    }



    double getPublicationFee() { return pageCount * 0.5; }

}

