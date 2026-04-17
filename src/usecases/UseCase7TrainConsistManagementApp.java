import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase7TrainConsistManagementApp {

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
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("=======================================\n");

        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("Passenger Bogies Before Sorting:");
        displayBogies(passengerBogies);

        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nPassenger Bogies After Sorting by Capacity:");
        displayBogies(passengerBogies);

        System.out.println("\nHighest Capacity Bogie:");
        if (!passengerBogies.isEmpty()) {
            System.out.println(passengerBogies.get(0).getName() + " with "
                    + passengerBogies.get(0).getCapacity() + " seats");
        }

        System.out.println("\nUC7 capacity-based sorting completed...");
    }

    private static void displayBogies(List<Bogie> bogies) {
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }
    }
}
