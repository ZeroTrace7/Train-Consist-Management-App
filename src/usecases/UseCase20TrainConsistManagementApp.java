import java.util.Arrays;

public class UseCase20TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC20 - Exception Handling During Search Operations");
        System.out.println("=======================================\n");

        String[] bogieIds = {};
        String searchKey = "BG101";

        System.out.println("Current Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));
        System.out.println("Search Key: " + searchKey);

        try {
            boolean bogieFound = searchBogie(bogieIds, searchKey);
            System.out.println("\nSearch Result:");
            System.out.println(bogieFound
                    ? "Bogie ID " + searchKey + " exists in the train consist."
                    : "Bogie ID " + searchKey + " was not found in the train consist.");
        } catch (IllegalStateException exception) {
            System.out.println("\nError: " + exception.getMessage());
        }

        System.out.println("\nUC20 fail-fast search validation completed...");
    }

    private static boolean searchBogie(String[] bogieIds, String searchKey) {
        if (bogieIds.length == 0) {
            throw new IllegalStateException("Cannot search bogies because the train consist is empty");
        }

        for (String bogieId : bogieIds) {
            if (bogieId.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }
}
