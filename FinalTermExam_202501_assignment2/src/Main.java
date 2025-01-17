package library;


import booking.Guest;
import booking.Reservation;
import java.util.Random;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class HotelDemo {



    public static Guest createGuest(String firstName, String lastName, String passportNumber) {

        return new Guest(firstName, lastName, passportNumber);

    }



    public static void displayGuestInfo(Guest guest) {

        guest.displayInfo();

    }



    public static Reservation createReservation(String reservationCode, LocalDate checkinDate, LocalDate checkOutDate, String roomType) {

        return new Reservation(reservationCode, checkinDate, checkOutDate, roomType);

    }



    public static void displayReservationInfo(Reservation reservation) {

        reservation.displayInfo();

    }



    public static void addGuestToReservation(Reservation reservation, Guest guest) {

        reservation.addGuest(guest);

    }



    public static void main(String[] args) {

        ArrayList<String> guestData = new ArrayList<>(List.of("John Doe", "Jane Smith", "Alice Brown", "Bob White", "Charlie Black"));

        ArrayList<Guest> guests = new ArrayList<>();

        ArrayList<Reservation> reservations = new ArrayList<>();

        Random random = new Random();

        Scanner sc = new Scanner(System.in);





        guestData.forEach(name -> {

            String[] parts = name.split(" ");

            guests.add(createGuest(parts[0], parts[1], "PB" + (100000 + random.nextInt(900000))));

        });





        reservations.add(createReservation("R1", LocalDate.now(), LocalDate.now().plusDays(3), "Single"));

        reservations.add(createReservation("R2", LocalDate.now().plusDays(1), LocalDate.now().plusDays(4), "Double"));

        reservations.add(createReservation("R3", LocalDate.now().plusDays(2), LocalDate.now().plusDays(5), "Suite"));




        reservations.forEach(r -> {

            addGuestToReservation(r, guests.remove(0));

            addGuestToReservation(r, guests.remove(0));

        });





        while (true) {

            System.out.println("\n1. Display All Reservations\n2. Search Guests by Last Name\n3. Exit");

            switch (sc.nextInt()) {

                case 1 -> reservations.forEach(HotelDemo::displayReservationInfo);

                case 2 -> {

                    System.out.print("Enter reservation code: ");

                    String code = sc.next();

                    System.out.print("Enter last name: ");

                    String lastName = sc.next();

                    reservations.stream()

                            .filter(r -> r.reservationCode.equals(code))

                            .findFirst()

                            .ifPresent(r -> {

                                ArrayList<Guest> matches = r.findGuestsByLastName(lastName);

                                if (matches.isEmpty()) System.out.println("No matches found.");

                                else matches.forEach(HotelDemo::displayGuestInfo);

                            });

                }

                case 3 -> { sc.close(); return; }

                default -> System.out.println("Invalid choice.");

            }

        }

    }

}