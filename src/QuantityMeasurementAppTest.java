public class QuantityMeasurementAppTest {

    public static void main(String[] args) {
        testFeetEquality_SameValue();
        testFeetEquality_DifferentValue();
        testFeetEquality_NullComparison();
        testFeetEquality_NonNumericInput();
        testFeetEquality_SameReference();
        testInchesEquality_SameValue();
        testInchesEquality_DifferentValue();
        testInchesEquality_NullComparison();
        testInchesEquality_NonNumericInput();
        testInchesEquality_SameReference();
        testFeetAndInchesEquality_EquivalentValues();
        testFeetAndInchesEquality_DifferentValues();

        System.out.println("All UC2 tests passed.");
    }

    private static void testFeetEquality_SameValue() {
        QuantityMeasurementApp.Feet firstValue = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet secondValue = new QuantityMeasurementApp.Feet(1.0);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected 1.0 ft to be equal to 1.0 ft."
        );
    }

    private static void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet firstValue = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet secondValue = new QuantityMeasurementApp.Feet(2.0);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected 1.0 ft to not be equal to 2.0 ft."
        );
    }

    private static void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);

        assertCondition(
                !value.equals(null),
                "Expected a Feet value to not be equal to null."
        );
    }

    private static void testFeetEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);

        assertCondition(
                !value.equals("non-numeric"),
                "Expected a Feet value to not be equal to a non-Feet object."
        );
    }

    private static void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet value = new QuantityMeasurementApp.Feet(1.0);

        assertCondition(
                value.equals(value),
                "Expected a Feet value to be equal to itself."
        );
    }

    private static void testInchesEquality_SameValue() {
        QuantityMeasurementApp.Inches firstValue = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches secondValue = new QuantityMeasurementApp.Inches(1.0);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected 1.0 inch to be equal to 1.0 inch."
        );
    }

    private static void testInchesEquality_DifferentValue() {
        QuantityMeasurementApp.Inches firstValue = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches secondValue = new QuantityMeasurementApp.Inches(2.0);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected 1.0 inch to not be equal to 2.0 inch."
        );
    }

    private static void testInchesEquality_NullComparison() {
        QuantityMeasurementApp.Inches value = new QuantityMeasurementApp.Inches(1.0);

        assertCondition(
                !value.equals(null),
                "Expected an Inches value to not be equal to null."
        );
    }

    private static void testInchesEquality_NonNumericInput() {
        QuantityMeasurementApp.Inches value = new QuantityMeasurementApp.Inches(1.0);

        assertCondition(
                !value.equals("non-numeric"),
                "Expected an Inches value to not be equal to a non-Inches object."
        );
    }

    private static void testInchesEquality_SameReference() {
        QuantityMeasurementApp.Inches value = new QuantityMeasurementApp.Inches(1.0);

        assertCondition(
                value.equals(value),
                "Expected an Inches value to be equal to itself."
        );
    }

    private static void testFeetAndInchesEquality_EquivalentValues() {
        assertCondition(
                QuantityMeasurementApp.areFeetAndInchesEqual(1.0, 12.0),
                "Expected 1.0 ft to be equal to 12.0 inch."
        );
    }

    private static void testFeetAndInchesEquality_DifferentValues() {
        assertCondition(
                !QuantityMeasurementApp.areFeetAndInchesEqual(1.0, 11.0),
                "Expected 1.0 ft to not be equal to 11.0 inch."
        );
    }

    private static void assertCondition(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
