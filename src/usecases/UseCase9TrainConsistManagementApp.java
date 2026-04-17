import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCase9TrainConsistManagementApp {

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
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("=======================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("All Bogies:");
        displayBogies(bogies);

        Map<String, List<Bogie>> groupedBogies = groupBogiesByType(bogies);

        System.out.println("\nGrouped Bogies:");
        displayGroupedBogies(groupedBogies);

        System.out.println("\nOriginal Bogie List Remains Unchanged:");
        displayBogies(bogies);

        System.out.println("\nUC9 grouping completed successfully...");
    }

    private static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName, LinkedHashMap::new, Collectors.toList()));
    }

    private static void displayBogies(List<Bogie> bogies) {
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }
    }

    private static void displayGroupedBogies(Map<String, List<Bogie>> groupedBogies) {
        if (groupedBogies.isEmpty()) {
            System.out.println("No bogies available for grouping.");
            return;
        }

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie bogie : entry.getValue()) {
                System.out.println("  " + bogie);
            }
        }
    }
}
