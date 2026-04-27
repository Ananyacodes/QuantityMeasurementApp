public class QuantityMeasurementAppTest {

    public static void main(String[] args) {
        testEquality_FeetToFeet_SameValue();
        testEquality_InchToInch_SameValue();
        testEquality_FeetToInch_EquivalentValue();
        testEquality_InchToFeet_EquivalentValue();
        testEquality_FeetToFeet_DifferentValue();
        testEquality_InchToInch_DifferentValue();
        testEquality_InvalidValue();
        testEquality_NullUnit();
        testEquality_SameReference();
        testEquality_NullComparison();
        testEquality_NonQuantityComparison();
        testBackwardCompatibility_FeetMethod();
        testBackwardCompatibility_InchesMethod();
        testBackwardCompatibility_FeetAndInchesMethod();

        System.out.println("All UC3 tests passed.");
    }

    private static void testEquality_FeetToFeet_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(1.0, \"feet\") to equal Quantity(1.0, \"feet\")."
        );
    }

    private static void testEquality_InchToInch_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(1.0, \"inches\") to equal Quantity(1.0, \"inches\")."
        );
    }

    private static void testEquality_FeetToInch_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength inchValue =
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                feetValue.equals(inchValue),
                "Expected Quantity(1.0, \"feet\") to equal Quantity(12.0, \"inches\")."
        );
    }

    private static void testEquality_InchToFeet_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength inchValue =
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                inchValue.equals(feetValue),
                "Expected Quantity(12.0, \"inches\") to equal Quantity(1.0, \"feet\")."
        );
    }

    private static void testEquality_FeetToFeet_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, \"feet\") to not equal Quantity(2.0, \"feet\")."
        );
    }

    private static void testEquality_InchToInch_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, \"inches\") to not equal Quantity(2.0, \"inches\")."
        );
    }

    private static void testEquality_InvalidValue() {
        assertThrows(
                () -> new QuantityMeasurementApp.QuantityLength(Double.NaN, QuantityMeasurementApp.LengthUnit.FEET),
                "Expected invalid numeric values to be rejected."
        );
    }

    private static void testEquality_NullUnit() {
        assertThrows(
                () -> new QuantityMeasurementApp.QuantityLength(1.0, null),
                "Expected a null unit to be rejected."
        );
    }

    private static void testEquality_SameReference() {
        QuantityMeasurementApp.QuantityLength value =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                value.equals(value),
                "Expected a quantity to be equal to itself."
        );
    }

    private static void testEquality_NullComparison() {
        QuantityMeasurementApp.QuantityLength value =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                !value.equals(null),
                "Expected a quantity to not be equal to null."
        );
    }

    private static void testEquality_NonQuantityComparison() {
        QuantityMeasurementApp.QuantityLength value =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                !value.equals("non-numeric"),
                "Expected a quantity to not be equal to a non-quantity object."
        );
    }

    private static void testBackwardCompatibility_FeetMethod() {
        assertCondition(
                QuantityMeasurementApp.areFeetEqual(1.0, 1.0),
                "Expected the UC1 feet equality method to remain supported."
        );
    }

    private static void testBackwardCompatibility_InchesMethod() {
        assertCondition(
                QuantityMeasurementApp.areInchesEqual(1.0, 1.0),
                "Expected the UC2 inches equality method to remain supported."
        );
    }

    private static void testBackwardCompatibility_FeetAndInchesMethod() {
        assertCondition(
                QuantityMeasurementApp.areFeetAndInchesEqual(1.0, 12.0),
                "Expected the UC2 feet-to-inches equality method to remain supported."
        );
    }

    private static void assertCondition(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void assertThrows(Runnable runnable, String message) {
        try {
            runnable.run();
            throw new AssertionError(message);
        } catch (IllegalArgumentException ignored) {
        }
    }
}
