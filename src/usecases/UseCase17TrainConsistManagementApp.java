import java.util.Arrays;

public class UseCase17TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("=======================================\n");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Bogie Names Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println("\nBogie Names After Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 built-in sorting completed successfully...");
    }
}
