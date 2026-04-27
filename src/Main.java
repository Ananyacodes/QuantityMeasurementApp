public class Main {
    public static void main(String[] args) {
        QuantityMeasurementApp.QuantityLength feetPlusFeet = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET)
        );
        QuantityMeasurementApp.QuantityLength feetPlusInches = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES)
        );
        QuantityMeasurementApp.QuantityLength inchesPlusFeet = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET)
        );
        QuantityMeasurementApp.QuantityLength yardsPlusFeet = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET)
        );
        QuantityMeasurementApp.QuantityLength inchesPlusYards = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS)
        );
        QuantityMeasurementApp.QuantityLength centimetersPlusInches = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.54, QuantityMeasurementApp.LengthUnit.CENTIMETERS),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES)
        );

        System.out.println("Input: add(Quantity(1.0, FEET), Quantity(2.0, FEET))");
        System.out.println("Output: " + feetPlusFeet);
        System.out.println("Input: add(Quantity(1.0, FEET), Quantity(12.0, INCHES))");
        System.out.println("Output: " + feetPlusInches);
        System.out.println("Input: add(Quantity(12.0, INCHES), Quantity(1.0, FEET))");
        System.out.println("Output: " + inchesPlusFeet);
        System.out.println("Input: add(Quantity(1.0, YARDS), Quantity(3.0, FEET))");
        System.out.println("Output: " + yardsPlusFeet);
        System.out.println("Input: add(Quantity(36.0, INCHES), Quantity(1.0, YARDS))");
        System.out.println("Output: " + inchesPlusYards);
        System.out.println("Input: add(Quantity(2.54, CENTIMETERS), Quantity(1.0, INCHES))");
        System.out.println("Output: " + centimetersPlusInches);
    }
}
