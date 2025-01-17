import java.util.ArrayList;


public class ReservationData {
    public static ArrayList<String[]> getReservationInfo() {
        ArrayList<String[]> reservations = new ArrayList<>();
        // Format: {reservationCode, checkInDate, checkOutDate, roomType}
        reservations.add(new String[]{"RS2023012", "2023-06-15", "2023-06-22", "Double Room"});
        reservations.add(new String[]{"RS2023034", "2023-07-01", "2023-07-10", "Suite"});
        reservations.add(new String[]{"RS2023056", "2023-08-10", "2023-08-17", "Single Room"});
        reservations.add(new String[]{"RS2023078", "2023-09-05", "2023-09-15", "Double Room"});
        reservations.add(new String[]{"RS2023090", "2023-10-20", "2023-10-25", "Single Room"});
        return reservations;
    }
}