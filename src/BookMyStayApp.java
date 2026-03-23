import java.util.LinkedList;
import java.util.Queue;

// Reservation class representing a booking request
class Reservation {

    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void displayReservation() {
        System.out.println("Guest: " + guestName + " | Requested Room: " + roomType);
    }
}

// Booking Request Queue
class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    // Add booking request
    public void addRequest(Reservation reservation) {
        requestQueue.offer(reservation);
        System.out.println("Booking request added for " + reservation.getGuestName());
    }

    // Display queued requests
    public void displayRequests() {

        System.out.println("\nCurrent Booking Request Queue:\n");

        for (Reservation r : requestQueue) {
            r.displayReservation();
        }
    }
}


public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("   Book My Stay - Version 5.1");
        System.out.println(" Booking Request Queue (FIFO)");
        System.out.println("===================================\n");

        BookingRequestQueue queue = new BookingRequestQueue();

        // Guests submitting booking requests
        Reservation r1 = new Reservation("Alice", "Single Room");
        Reservation r2 = new Reservation("Bob", "Double Room");
        Reservation r3 = new Reservation("Charlie", "Suite Room");

        queue.addRequest(r1);
        queue.addRequest(r2);
        queue.addRequest(r3);

        // Display queue
        queue.displayRequests();
    }
}