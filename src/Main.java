public class Main {
    public static void main(String[] args) {
        QuantityMeasurementApp.QuantityLength feetTarget = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.FEET
        );
        QuantityMeasurementApp.QuantityLength inchesTarget = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.INCHES
        );
        QuantityMeasurementApp.QuantityLength yardsTarget = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.YARDS
        );
        QuantityMeasurementApp.QuantityLength yardPlusFeetInYards = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET),
                QuantityMeasurementApp.LengthUnit.YARDS
        );
        QuantityMeasurementApp.QuantityLength inchesPlusYardInFeet = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS),
                QuantityMeasurementApp.LengthUnit.FEET
        );
        QuantityMeasurementApp.QuantityLength centimetersTarget = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.54, QuantityMeasurementApp.LengthUnit.CENTIMETERS),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.CENTIMETERS
        );
        QuantityMeasurementApp.QuantityLength zeroInYards = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.YARDS
        );
        QuantityMeasurementApp.QuantityLength negativeInInches = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(-2.0, QuantityMeasurementApp.LengthUnit.FEET),
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        System.out.println("Input: add(Quantity(1.0, FEET), Quantity(12.0, INCHES), FEET)");
        System.out.println("Output: " + feetTarget);
        System.out.println("Input: add(Quantity(1.0, FEET), Quantity(12.0, INCHES), INCHES)");
        System.out.println("Output: " + inchesTarget);
        System.out.println("Input: add(Quantity(1.0, FEET), Quantity(12.0, INCHES), YARDS)");
        System.out.println("Output: " + yardsTarget);
        System.out.println("Input: add(Quantity(1.0, YARDS), Quantity(3.0, FEET), YARDS)");
        System.out.println("Output: " + yardPlusFeetInYards);
        System.out.println("Input: add(Quantity(36.0, INCHES), Quantity(1.0, YARDS), FEET)");
        System.out.println("Output: " + inchesPlusYardInFeet);
        System.out.println("Input: add(Quantity(2.54, CENTIMETERS), Quantity(1.0, INCHES), CENTIMETERS)");
        System.out.println("Output: " + centimetersTarget);
        System.out.println("Input: add(Quantity(5.0, FEET), Quantity(0.0, INCHES), YARDS)");
        System.out.println("Output: " + zeroInYards);
        System.out.println("Input: add(Quantity(5.0, FEET), Quantity(-2.0, FEET), INCHES)");
        System.out.println("Output: " + negativeInInches);
    }
}
