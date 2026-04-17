import java.util.Arrays;

public class UseCase16TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC16 - Sort Passenger Bogies by Capacity");
        System.out.println("=======================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Passenger Bogie Capacities Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        bubbleSort(capacities);

        System.out.println("\nPassenger Bogie Capacities After Bubble Sort:");
        System.out.println(Arrays.toString(capacities));

        System.out.println("\nUC16 bubble sort completed successfully...");
    }

    private static void bubbleSort(int[] capacities) {
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }
}
