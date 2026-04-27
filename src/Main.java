public class Main {
    public static void main(String[] args) {
        QuantityMeasurementApp.QuantityLength firstQuantity =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength secondQuantity =
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength thirdQuantity =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength fourthQuantity =
                new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength fifthQuantity =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength sixthQuantity =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength seventhQuantity =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength eighthQuantity =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength ninthQuantity =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength tenthQuantity =
                new QuantityMeasurementApp.QuantityLength(0.393701, QuantityMeasurementApp.LengthUnit.INCHES);

        System.out.println("Input: " + firstQuantity + " and " + secondQuantity);
        System.out.println("Output: Equal (" + firstQuantity.equals(secondQuantity) + ")");
        System.out.println("Input: " + thirdQuantity + " and " + fourthQuantity);
        System.out.println("Output: Equal (" + thirdQuantity.equals(fourthQuantity) + ")");
        System.out.println("Input: " + fifthQuantity + " and " + sixthQuantity);
        System.out.println("Output: Equal (" + fifthQuantity.equals(sixthQuantity) + ")");
        System.out.println("Input: " + seventhQuantity + " and " + eighthQuantity);
        System.out.println("Output: Equal (" + seventhQuantity.equals(eighthQuantity) + ")");
        System.out.println("Input: " + ninthQuantity + " and " + tenthQuantity);
        System.out.println("Output: Equal (" + ninthQuantity.equals(tenthQuantity) + ")");
    }
}
