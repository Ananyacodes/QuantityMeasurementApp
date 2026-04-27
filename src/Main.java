public class Main {
    public static void main(String[] args) {
        boolean isInchesEqual = QuantityMeasurementApp.areInchesEqual(1.0, 1.0);
        boolean isFeetEqual = QuantityMeasurementApp.areFeetEqual(1.0, 1.0);
        boolean isFeetToInchesEqual = QuantityMeasurementApp.areFeetAndInchesEqual(1.0, 12.0);

        System.out.println("Input: 1.0 inch and 1.0 inch");
        System.out.println("Output: Equal (" + isInchesEqual + ")");
        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + isFeetEqual + ")");
        System.out.println("Input: 1.0 ft and 12.0 inch");
        System.out.println("Output: Equal (" + isFeetToInchesEqual + ")");
    }
}
