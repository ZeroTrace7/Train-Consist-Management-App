import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase13TrainConsistManagementApp {

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
    }

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("=======================================\n");

        List<Bogie> bogies = createBogiesForBenchmark(10_000);
        int threshold = 60;

        long loopStart = System.nanoTime();
        List<Bogie> loopFilteredBogies = filterWithLoop(bogies, threshold);
        long loopEnd = System.nanoTime();

        long streamStart = System.nanoTime();
        List<Bogie> streamFilteredBogies = filterWithStream(bogies, threshold);
        long streamEnd = System.nanoTime();

        long loopElapsed = loopEnd - loopStart;
        long streamElapsed = streamEnd - streamStart;

        System.out.println("Dataset Size: " + bogies.size());
        System.out.println("Capacity Threshold: " + threshold);
        System.out.println("Loop Filter Result Size: " + loopFilteredBogies.size());
        System.out.println("Stream Filter Result Size: " + streamFilteredBogies.size());
        System.out.println("Results Match: " + (loopFilteredBogies.size() == streamFilteredBogies.size()));

        System.out.println("\nExecution Time:");
        System.out.println("Loop-Based Filtering   : " + loopElapsed + " ns");
        System.out.println("Stream-Based Filtering : " + streamElapsed + " ns");

        System.out.println("\nUC13 performance comparison completed...");
    }

    private static List<Bogie> createBogiesForBenchmark(int count) {
        List<Bogie> bogies = new ArrayList<>();
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Economy Plus"};
        int[] capacities = {72, 56, 24, 80};

        for (int i = 0; i < count; i++) {
            int index = i % bogieTypes.length;
            bogies.add(new Bogie(bogieTypes[index], capacities[index]));
        }

        return bogies;
    }

    private static List<Bogie> filterWithLoop(List<Bogie> bogies, int threshold) {
        List<Bogie> filteredBogies = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > threshold) {
                filteredBogies.add(bogie);
            }
        }
        return filteredBogies;
    }

    private static List<Bogie> filterWithStream(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(bogie -> bogie.getCapacity() > threshold)
                .collect(Collectors.toList());
    }
}
