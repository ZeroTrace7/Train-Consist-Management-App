import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseCase12TrainConsistManagementApp {

    private static class GoodsBogie {
        private final String type;
        private final String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("=======================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Goods Bogies in Train:");
        displayGoodsBogies(goodsBogies);

        Predicate<GoodsBogie> safetyRule = bogie ->
                !"Cylindrical".equalsIgnoreCase(bogie.getType())
                        || "Petroleum".equalsIgnoreCase(bogie.getCargo());

        boolean isSafetyCompliant = goodsBogies.stream().allMatch(safetyRule);

        System.out.println("\nSafety Compliance Status: " + isSafetyCompliant);
        System.out.println(isSafetyCompliant
                ? "Train formation is SAFE."
                : "Train formation is NOT SAFE.");

        System.out.println("\nUC12 safety validation completed...");
    }

    private static void displayGoodsBogies(List<GoodsBogie> goodsBogies) {
        for (GoodsBogie goodsBogie : goodsBogies) {
            System.out.println(goodsBogie);
        }
    }
}
