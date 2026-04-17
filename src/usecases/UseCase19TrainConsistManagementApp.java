import java.util.Arrays;

public class UseCase19TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("=======================================\n");

        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG309";

        System.out.println("Bogie IDs Before Sorting:");
        System.out.println(Arrays.toString(bogieIds));

        String[] sortedBogieIds = Arrays.copyOf(bogieIds, bogieIds.length);
        Arrays.sort(sortedBogieIds);

        System.out.println("\nBogie IDs After Sorting:");
        System.out.println(Arrays.toString(sortedBogieIds));
        System.out.println("Search Key: " + searchKey);

        boolean bogieFound = binarySearch(sortedBogieIds, searchKey);

        System.out.println("\nSearch Result:");
        System.out.println(bogieFound
                ? "Bogie ID " + searchKey + " exists in the sorted train consist."
                : "Bogie ID " + searchKey + " was not found in the sorted train consist.");

        System.out.println("\nUC19 binary search completed successfully...");
    }

    private static boolean binarySearch(String[] bogieIds, String searchKey) {
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true;
            }

            if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
