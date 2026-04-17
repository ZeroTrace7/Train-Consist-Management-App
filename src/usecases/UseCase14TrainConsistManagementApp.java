import java.util.ArrayList;
import java.util.List;

public class UseCase14TrainConsistManagementApp {

    private static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    private static class PassengerBogie {
        private final String type;
        private final int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity + " seats";
        }
    }

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC14 - Handle Invalid Bogie Capacity");
        System.out.println("=======================================\n");

        List<PassengerBogie> trainConsist = new ArrayList<>();

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            trainConsist.add(sleeper);
            System.out.println("Created Bogie: " + sleeper);

            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", 0);
            trainConsist.add(invalidBogie);
            System.out.println("Created Bogie: " + invalidBogie);
        } catch (InvalidCapacityException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        System.out.println("\nPassenger Bogies Successfully Added:");
        displayPassengerBogies(trainConsist);

        System.out.println("\nUC14 custom exception handling completed...");
    }

    private static void displayPassengerBogies(List<PassengerBogie> passengerBogies) {
        if (passengerBogies.isEmpty()) {
            System.out.println("No valid passenger bogies were added.");
            return;
        }

        for (PassengerBogie passengerBogie : passengerBogies) {
            System.out.println(passengerBogie);
        }
    }
}
