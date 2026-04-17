import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistManagementApp {

    private static final Pattern TRAIN_ID_PATTERN = Pattern.compile("TRN-\\d{4}");
    private static final Pattern CARGO_CODE_PATTERN = Pattern.compile("PET-[A-Z]{2}");

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC11 - Validate Train ID & Cargo Codes");
        System.out.println("=======================================\n");

        String validTrainId = "TRN-1234";
        String invalidTrainId = "TRAIN12";
        String validCargoCode = "PET-AB";
        String invalidCargoCode = "PET-ab";

        System.out.println("Train ID Validation:");
        displayValidationResult("Valid Train ID", validTrainId, isValidTrainId(validTrainId));
        displayValidationResult("Invalid Train ID", invalidTrainId, isValidTrainId(invalidTrainId));

        System.out.println("\nCargo Code Validation:");
        displayValidationResult("Valid Cargo Code", validCargoCode, isValidCargoCode(validCargoCode));
        displayValidationResult("Invalid Cargo Code", invalidCargoCode, isValidCargoCode(invalidCargoCode));

        System.out.println("\nUC11 regex validation completed successfully...");
    }

    private static boolean isValidTrainId(String trainId) {
        Matcher matcher = TRAIN_ID_PATTERN.matcher(trainId);
        return matcher.matches();
    }

    private static boolean isValidCargoCode(String cargoCode) {
        Matcher matcher = CARGO_CODE_PATTERN.matcher(cargoCode);
        return matcher.matches();
    }

    private static void displayValidationResult(String label, String value, boolean isValid) {
        System.out.println(label + ": " + value);
        System.out.println("Status: " + (isValid ? "Valid" : "Invalid"));
    }
}
