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
        testEquality_YardToYard_SameValue();
        testEquality_YardToYard_DifferentValue();
        testEquality_YardToFeet_EquivalentValue();
        testEquality_FeetToYard_EquivalentValue();
        testEquality_YardToInches_EquivalentValue();
        testEquality_InchesToYard_EquivalentValue();
        testEquality_YardToFeet_NonEquivalentValue();
        testEquality_CentimetersToCentimeters_SameValue();
        testEquality_CentimetersToCentimeters_DifferentValue();
        testEquality_CentimetersToInches_EquivalentValue();
        testEquality_CentimetersToFeet_NonEquivalentValue();
        testEquality_MultiUnit_TransitiveProperty();
        testEquality_AllUnits_ComplexScenario();
        testEquality_YardWithNullUnit();
        testEquality_CentimetersWithNullUnit();
        testEquality_CentimetersSameReference();
        testEquality_CentimetersNullComparison();

        System.out.println("All UC4 tests passed.");
    }

    private static void testEquality_FeetToFeet_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(1.0, FEET) to equal Quantity(1.0, FEET)."
        );
    }

    private static void testEquality_InchToInch_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(1.0, INCHES) to equal Quantity(1.0, INCHES)."
        );
    }

    private static void testEquality_FeetToInch_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength inchValue =
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                feetValue.equals(inchValue),
                "Expected Quantity(1.0, FEET) to equal Quantity(12.0, INCHES)."
        );
    }

    private static void testEquality_InchToFeet_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength inchValue =
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                inchValue.equals(feetValue),
                "Expected Quantity(12.0, INCHES) to equal Quantity(1.0, FEET)."
        );
    }

    private static void testEquality_FeetToFeet_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, FEET) to not equal Quantity(2.0, FEET)."
        );
    }

    private static void testEquality_InchToInch_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, INCHES) to not equal Quantity(2.0, INCHES)."
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

    private static void testEquality_YardToYard_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(1.0, YARDS) to equal Quantity(1.0, YARDS)."
        );
    }

    private static void testEquality_YardToYard_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARDS);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, YARDS) to not equal Quantity(2.0, YARDS)."
        );
    }

    private static void testEquality_YardToFeet_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                yardValue.equals(feetValue),
                "Expected Quantity(1.0, YARDS) to equal Quantity(3.0, FEET)."
        );
    }

    private static void testEquality_FeetToYard_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);

        assertCondition(
                feetValue.equals(yardValue),
                "Expected Quantity(3.0, FEET) to equal Quantity(1.0, YARDS)."
        );
    }

    private static void testEquality_YardToInches_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                yardValue.equals(inchesValue),
                "Expected Quantity(1.0, YARDS) to equal Quantity(36.0, INCHES)."
        );
    }

    private static void testEquality_InchesToYard_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);

        assertCondition(
                inchesValue.equals(yardValue),
                "Expected Quantity(36.0, INCHES) to equal Quantity(1.0, YARDS)."
        );
    }

    private static void testEquality_YardToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                !yardValue.equals(feetValue),
                "Expected Quantity(1.0, YARDS) to not equal Quantity(2.0, FEET)."
        );
    }

    private static void testEquality_CentimetersToCentimeters_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(2.0, CENTIMETERS) to equal Quantity(2.0, CENTIMETERS)."
        );
    }

    private static void testEquality_CentimetersToCentimeters_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, CENTIMETERS) to not equal Quantity(2.0, CENTIMETERS)."
        );
    }

    private static void testEquality_CentimetersToInches_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength centimetersValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(0.393701, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                centimetersValue.equals(inchesValue),
                "Expected Quantity(1.0, CENTIMETERS) to equal Quantity(0.393701, INCHES)."
        );
    }

    private static void testEquality_CentimetersToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.QuantityLength centimetersValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertCondition(
                !centimetersValue.equals(feetValue),
                "Expected Quantity(1.0, CENTIMETERS) to not equal Quantity(1.0, FEET)."
        );
    }

    private static void testEquality_MultiUnit_TransitiveProperty() {
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                yardValue.equals(feetValue) && feetValue.equals(inchesValue) && yardValue.equals(inchesValue),
                "Expected transitive equality across YARDS, FEET, and INCHES."
        );
    }

    private static void testEquality_AllUnits_ComplexScenario() {
        QuantityMeasurementApp.QuantityLength yardsValue =
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(6.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(72.0, QuantityMeasurementApp.LengthUnit.INCHES);

        assertCondition(
                yardsValue.equals(feetValue) && feetValue.equals(inchesValue) && yardsValue.equals(inchesValue),
                "Expected Quantity(2.0, YARDS), Quantity(6.0, FEET), and Quantity(72.0, INCHES) to be equal."
        );
    }

    private static void testEquality_YardWithNullUnit() {
        assertThrows(
                () -> new QuantityMeasurementApp.QuantityLength(1.0, null),
                "Expected a null unit to be rejected for yard quantities."
        );
    }

    private static void testEquality_CentimetersWithNullUnit() {
        assertThrows(
                () -> new QuantityMeasurementApp.QuantityLength(1.0, null),
                "Expected a null unit to be rejected for centimeter quantities."
        );
    }

    private static void testEquality_CentimetersSameReference() {
        QuantityMeasurementApp.QuantityLength value =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);

        assertCondition(
                value.equals(value),
                "Expected a centimeter quantity to be equal to itself."
        );
    }

    private static void testEquality_CentimetersNullComparison() {
        QuantityMeasurementApp.QuantityLength value =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETERS);

        assertCondition(
                !value.equals(null),
                "Expected a centimeter quantity to not be equal to null."
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
