public class Main {
    public static void main(String[] args) {
        QuantityMeasurementApp.QuantityLength firstQuantity =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength secondQuantity =
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength thirdQuantity =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength fourthQuantity =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES);

        System.out.println("Input: " + firstQuantity + " and " + secondQuantity);
        System.out.println("Output: Equal (" + firstQuantity.equals(secondQuantity) + ")");
        System.out.println("Input: " + thirdQuantity + " and " + fourthQuantity);
        System.out.println("Output: Equal (" + thirdQuantity.equals(fourthQuantity) + ")");
        System.out.println("Input: 1.0 ft and 12.0 inch");
        System.out.println("Output: Equal (" + QuantityMeasurementApp.areFeetAndInchesEqual(1.0, 12.0) + ")");
    }
}
