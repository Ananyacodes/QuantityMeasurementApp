public class Main {
    public static void main(String[] args) {
        QuantityMeasurementApp.QuantityLength feetTarget = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.FEET
        );
        QuantityMeasurementApp.QuantityLength inchesTarget = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.INCHES
        );
        QuantityMeasurementApp.QuantityLength yardsTarget = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );
        QuantityMeasurementApp.QuantityLength yardPlusFeetInYards = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, LengthUnit.FEET),
                LengthUnit.YARDS
        );
        QuantityMeasurementApp.QuantityLength inchesPlusYardInFeet = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(36.0, LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS),
                LengthUnit.FEET
        );
        QuantityMeasurementApp.QuantityLength centimetersTarget = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.54, LengthUnit.CENTIMETERS),
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.INCHES),
                LengthUnit.CENTIMETERS
        );
        QuantityMeasurementApp.QuantityLength zeroInYards = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );
        QuantityMeasurementApp.QuantityLength negativeInInches = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(-2.0, LengthUnit.FEET),
                LengthUnit.INCHES
        );

        System.out.println("Input: Quantity(1.0, FEET).convertTo(INCHES)");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET).convertTo(LengthUnit.INCHES));
        System.out.println("Input: Quantity(1.0, FEET).add(Quantity(12.0, INCHES), FEET)");
        System.out.println("Output: " + feetTarget);
        System.out.println("Input: Quantity(36.0, INCHES).equals(Quantity(1.0, YARDS))");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityLength(36.0, LengthUnit.INCHES)
                .equals(new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS)));
        System.out.println("Input: Quantity(1.0, YARDS).add(Quantity(3.0, FEET), YARDS)");
        System.out.println("Output: " + yardPlusFeetInYards);
        System.out.println("Input: Quantity(2.54, CENTIMETERS).convertTo(INCHES)");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityLength(2.54, LengthUnit.CENTIMETERS).convertTo(LengthUnit.INCHES));
        System.out.println("Input: Quantity(5.0, FEET).add(Quantity(0.0, INCHES), FEET)");
        System.out.println("Output: " + QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.0, LengthUnit.INCHES),
                LengthUnit.FEET
        ));
        System.out.println("Input: LengthUnit.FEET.convertToBaseUnit(12.0)");
        System.out.println("Output: " + LengthUnit.FEET.convertToBaseUnit(12.0));
        System.out.println("Input: LengthUnit.INCHES.convertToBaseUnit(12.0)");
        System.out.println("Output: " + LengthUnit.INCHES.convertToBaseUnit(12.0));
    }
}
