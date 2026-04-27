public class Main {
    public static void main(String[] args) {
        QuantityMeasurementApp.Feet firstValue = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet secondValue = new QuantityMeasurementApp.Feet(1.0);

        boolean isEqual = firstValue.equals(secondValue);
        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + isEqual + ")");
    }
}
