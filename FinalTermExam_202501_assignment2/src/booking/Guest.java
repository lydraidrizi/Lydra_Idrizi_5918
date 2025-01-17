package booking;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Guest {

    public String firstName, lastName, passportNumber;



    public Guest(String firstName, String lastName, String passportNumber) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.passportNumber = passportNumber;

    }



    public String getLastName() { return lastName; }



    public void displayInfo() {

        System.out.printf("Guest: %s %s, Passport: %s\n", firstName, lastName, passportNumber);

    }

}


