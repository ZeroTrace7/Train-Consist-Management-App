public class UseCase15TrainConsistManagementApp {

    private static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String message) {
            super(message);
        }
    }

    private static class GoodsBogie {
        private final String shape;
        private String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return shape + " -> " + (cargo == null ? "No Cargo Assigned" : cargo);
        }
    }

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("UC15 - Safe Cargo Assignment Using try-catch-finally");
        System.out.println("=======================================\n");

        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");
        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");

        assignCargoSafely(cylindricalBogie, "Petroleum");
        assignCargoSafely(rectangularBogie, "Petroleum");
        assignCargoSafely(rectangularBogie, "Coal");

        System.out.println("\nFinal Bogie Status:");
        System.out.println(cylindricalBogie);
        System.out.println(rectangularBogie);

        System.out.println("\nUC15 runtime exception handling completed...");
    }

    private static void assignCargoSafely(GoodsBogie goodsBogie, String cargo) {
        System.out.println("Attempting cargo assignment: " + goodsBogie.getShape() + " -> " + cargo);

        try {
            validateCargoAssignment(goodsBogie.getShape(), cargo);
            goodsBogie.setCargo(cargo);
            System.out.println("Cargo assigned successfully.");
        } catch (CargoSafetyException exception) {
            System.out.println("Error: " + exception.getMessage());
        } finally {
            System.out.println("Assignment check completed.");
        }
    }

    private static void validateCargoAssignment(String shape, String cargo) {
        if ("Rectangular".equalsIgnoreCase(shape) && "Petroleum".equalsIgnoreCase(cargo)) {
            throw new CargoSafetyException("Petroleum cannot be assigned to a Rectangular bogie");
        }
    }
}
