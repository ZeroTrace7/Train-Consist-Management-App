import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistManagementApp {

    private static class Bogie {
        private final String name;
        private final int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity + " seats";
        }
    }

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=======================================\n");

        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("Economy Plus", 80));

        System.out.println("All Passenger Bogies:");
        displayBogies(passengerBogies);

        int threshold = 60;
        List<Bogie> highCapacityBogies = filterBogiesByCapacity(passengerBogies, threshold);

        System.out.println("\nPassenger Bogies With Capacity Greater Than " + threshold + ":");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies matched the filter condition.");
        } else {
            displayBogies(highCapacityBogies);
        }

        System.out.println("\nOriginal Passenger Bogie List Remains Unchanged:");
        displayBogies(passengerBogies);

        System.out.println("\nUC8 stream-based filtering completed...");
    }

    private static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(bogie -> bogie.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    private static void displayBogies(List<Bogie> bogies) {
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }
    }
}
