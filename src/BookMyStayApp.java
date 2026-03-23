public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        BOOK MY STAY APP         ");
        System.out.println("=================================");
        System.out.println("Welcome to the Hotel Booking System");
        System.out.println("Application Version: 1.0");

        initializeRooms();

    }

    public static void initializeRooms() {

        int totalRooms = 5;

        System.out.println("Initializing hotel rooms...");

        for(int i = 1; i <= totalRooms; i++) {
            System.out.println("Room " + i + " ready");
        }

    }
}