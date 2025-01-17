package booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Reservation {

    public String reservationCode, roomType;

    public LocalDate checkinDate, checkOutDate;

    public ArrayList<Guest> guests = new ArrayList<>();



    public Reservation(String reservationCode, LocalDate checkinDate, LocalDate checkOutDate, String roomType) {

        this.reservationCode = reservationCode;

        this.checkinDate = checkinDate;

        this.checkOutDate = checkOutDate;

        this.roomType = roomType;

    }



    public void addGuest(Guest guest) { guests.add(guest); }



    public ArrayList<Guest> findGuestsByLastName(String lastName) {

        return (ArrayList<Guest>) guests.stream().filter(g -> g.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());

    }



    public void displayInfo() {

        System.out.printf("Reservation: %s, Room: %s, Check-in: %s, Check-out: %s\nGuests:\n", reservationCode, roomType, checkinDate, checkOutDate);

        guests.forEach(Guest::displayInfo);

    }

}

