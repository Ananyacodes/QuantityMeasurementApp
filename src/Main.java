public class Main {
    public static void main(String[] args) {
        System.out.println("Input: convert(1.0, FEET, INCHES) -> Output: "
                + QuantityMeasurementApp.demonstrateLengthConversion(
                1.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                QuantityMeasurementApp.LengthUnit.INCHES
        ));
        System.out.println("Input: convert(3.0, YARDS, FEET) -> Output: "
                + QuantityMeasurementApp.demonstrateLengthConversion(
                3.0,
                QuantityMeasurementApp.LengthUnit.YARDS,
                QuantityMeasurementApp.LengthUnit.FEET
        ));
        System.out.println("Input: convert(36.0, INCHES, YARDS) -> Output: "
                + QuantityMeasurementApp.demonstrateLengthConversion(
                36.0,
                QuantityMeasurementApp.LengthUnit.INCHES,
                QuantityMeasurementApp.LengthUnit.YARDS
        ));
        System.out.println("Input: convert(1.0, CENTIMETERS, INCHES) -> Output: "
                + QuantityMeasurementApp.demonstrateLengthConversion(
                1.0,
                QuantityMeasurementApp.LengthUnit.CENTIMETERS,
                QuantityMeasurementApp.LengthUnit.INCHES
        ));
        System.out.println("Input: convert(0.0, FEET, INCHES) -> Output: "
                + QuantityMeasurementApp.demonstrateLengthConversion(
                0.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                QuantityMeasurementApp.LengthUnit.INCHES
        ));
    }
}
