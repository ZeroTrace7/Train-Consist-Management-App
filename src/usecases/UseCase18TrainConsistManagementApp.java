import java.util.Arrays;

public class UseCase18TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("=======================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));
        System.out.println("Search Key: " + searchKey);

        boolean bogieFound = linearSearch(bogieIds, searchKey);

        System.out.println("\nSearch Result:");
        System.out.println(bogieFound
                ? "Bogie ID " + searchKey + " exists in the train consist."
                : "Bogie ID " + searchKey + " was not found in the train consist.");

        System.out.println("\nUC18 linear search completed successfully...");
    }

    private static boolean linearSearch(String[] bogieIds, String searchKey) {
        for (String bogieId : bogieIds) {
            if (bogieId.equals(searchKey)) {
                return true;
            }
        }
        return false;
    }
}
