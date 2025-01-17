package library;

class Magazine extends Publication {

    int issueNumber; boolean printedMonthly;




    Magazine(String title, String publisher, int year, int issue, boolean monthly) {

        super(title, publisher, year);

        this.issueNumber = issue; this.printedMonthly = monthly;

    }



    void printDetails() {

        System.out.printf("Magazine: %s, %s, %d, Issue %d, Monthly: %b\n", title, publisher, publicationYear, issueNumber, printedMonthly);

    }



    double getPublicationFee() { return printedMonthly ? 20 : 15; }

}

