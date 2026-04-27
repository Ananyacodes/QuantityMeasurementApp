public class QuantityMeasurementAppTest {

    public static void main(String[] args) {
        testEquality_SameValue();
        testEquality_DifferentValue();
        testEquality_NullComparison();
        testEquality_NonNumericInput();
        testEquality_SameReference();

        System.out.println("All UC1 tests passed.");
    }

    private static void testEquality_SameValue() {
        QuantityMeasurementApp.Feet firstValue = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet secondValue = new QuantityMeasurementApp.Feet(1.0);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected 1.0 ft to be equal to 1.0 ft."
        );
    }

    private static void testEquality_DifferentValue() {
        QuantityMeasurementApp.Feet firstValue = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet secondValue = new QuantityMeasurementApp.Feet(2.0);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected 1.0 ft to not be equal to 2.0 ft."
        );
    }

    private static void testEquality_NullComparison() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);

        assertCondition(
                !value.equals(null),
                "Expected a Feet value to not be equal to null."
        );
    }

    private static void testEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);

        assertCondition(
                !value.equals("non-numeric"),
                "Expected a Feet value to not be equal to a non-Feet object."
        );
    }

    private static void testEquality_SameReference() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);

        assertCondition(
                value.equals(value),
                "Expected a Feet value to be equal to itself."
        );
    }

    private static void assertCondition(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
