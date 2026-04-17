import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistManagementApp {

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
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("=======================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("All Bogies:");
        displayBogies(bogies);

        int totalSeats = calculateTotalSeats(bogies);

        System.out.println("\nTotal Seating Capacity of Train:");
        System.out.println(totalSeats + " seats");

        System.out.println("\nOriginal Bogie List Remains Unchanged:");
        displayBogies(bogies);

        System.out.println("\nUC10 seat aggregation completed successfully...");
    }

    private static int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
    }

    private static void displayBogies(List<Bogie> bogies) {
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }
    }
}
