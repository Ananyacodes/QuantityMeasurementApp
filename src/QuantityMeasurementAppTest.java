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
        testConversion_FeetToInches();
        testConversion_InchesToFeet();
        testConversion_YardsToInches();
        testConversion_InchesToYards();
        testConversion_CentimetersToInches();
        testConversion_FeetToYard();
        testConversion_RoundTrip_PreservesValue();
        testConversion_ZeroValue();
        testConversion_NegativeValue();
        testConversion_SameUnit();
        testConversion_InvalidUnit_Throws();
        testConversion_NaNOrInfinite_Throws();
        testConversion_PrecisionTolerance();
        testConversion_InstanceMethod();
        testConversion_DemonstrateOverload();
        testAddition_SameUnit_FeetPlusFeet();
        testAddition_SameUnit_InchPlusInch();
        testAddition_CrossUnit_FeetPlusInches();
        testAddition_CrossUnit_InchPlusFeet();
        testAddition_CrossUnit_YardPlusFeet();
        testAddition_CrossUnit_CentimeterPlusInch();
        testAddition_Commutativity();
        testAddition_WithZero();
        testAddition_NegativeValues();
        testAddition_NullSecondOperand();
        testAddition_LargeValues();
        testAddition_SmallValues();
        testAddition_StaticOverload_WithTargetUnit();
        testAddition_InstanceMethod_WithTargetUnit();
        testAddition_ExplicitTargetUnit_Feet();
        testAddition_ExplicitTargetUnit_Inches();
        testAddition_ExplicitTargetUnit_Yards();
        testAddition_ExplicitTargetUnit_Centimeters();
        testAddition_ExplicitTargetUnit_SameAsFirstOperand();
        testAddition_ExplicitTargetUnit_SameAsSecondOperand();
        testAddition_ExplicitTargetUnit_Commutativity();
        testAddition_ExplicitTargetUnit_WithZero();
        testAddition_ExplicitTargetUnit_NegativeValues();
        testAddition_ExplicitTargetUnit_NullTargetUnit();
        testAddition_ExplicitTargetUnit_LargeToSmallScale();
        testAddition_ExplicitTargetUnit_SmallToLargeScale();
        testAddition_ExplicitTargetUnit_PrecisionTolerance();

        System.out.println("All UC7 tests passed.");
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

    private static void testConversion_FeetToInches() {
        assertDoubleEquals(
                12.0,
                QuantityMeasurementApp.convert(1.0, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCHES),
                "Expected 1.0 feet to convert to 12.0 inches."
        );
    }

    private static void testConversion_InchesToFeet() {
        assertDoubleEquals(
                2.0,
                QuantityMeasurementApp.convert(24.0, QuantityMeasurementApp.LengthUnit.INCHES,
                        QuantityMeasurementApp.LengthUnit.FEET),
                "Expected 24.0 inches to convert to 2.0 feet."
        );
    }

    private static void testConversion_YardsToInches() {
        assertDoubleEquals(
                36.0,
                QuantityMeasurementApp.convert(1.0, QuantityMeasurementApp.LengthUnit.YARDS,
                        QuantityMeasurementApp.LengthUnit.INCHES),
                "Expected 1.0 yard to convert to 36.0 inches."
        );
    }

    private static void testConversion_InchesToYards() {
        assertDoubleEquals(
                2.0,
                QuantityMeasurementApp.convert(72.0, QuantityMeasurementApp.LengthUnit.INCHES,
                        QuantityMeasurementApp.LengthUnit.YARDS),
                "Expected 72.0 inches to convert to 2.0 yards."
        );
    }

    private static void testConversion_CentimetersToInches() {
        assertDoubleEquals(
                1.0,
                QuantityMeasurementApp.convert(2.54, QuantityMeasurementApp.LengthUnit.CENTIMETERS,
                        QuantityMeasurementApp.LengthUnit.INCHES),
                "Expected 2.54 centimeters to convert to about 1.0 inch."
        );
    }

    private static void testConversion_FeetToYard() {
        assertDoubleEquals(
                2.0,
                QuantityMeasurementApp.convert(6.0, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.YARDS),
                "Expected 6.0 feet to convert to 2.0 yards."
        );
    }

    private static void testConversion_RoundTrip_PreservesValue() {
        double originalValue = 5.75;
        double convertedValue = QuantityMeasurementApp.convert(
                originalValue,
                QuantityMeasurementApp.LengthUnit.YARDS,
                QuantityMeasurementApp.LengthUnit.CENTIMETERS
        );
        double roundTripValue = QuantityMeasurementApp.convert(
                convertedValue,
                QuantityMeasurementApp.LengthUnit.CENTIMETERS,
                QuantityMeasurementApp.LengthUnit.YARDS
        );

        assertDoubleEquals(
                originalValue,
                roundTripValue,
                "Expected round-trip conversion to preserve the original value."
        );
    }

    private static void testConversion_ZeroValue() {
        assertDoubleEquals(
                0.0,
                QuantityMeasurementApp.convert(0.0, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCHES),
                "Expected zero conversion to remain zero."
        );
    }

    private static void testConversion_NegativeValue() {
        assertDoubleEquals(
                -12.0,
                QuantityMeasurementApp.convert(-1.0, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCHES),
                "Expected negative values to preserve sign during conversion."
        );
    }

    private static void testConversion_SameUnit() {
        assertDoubleEquals(
                5.0,
                QuantityMeasurementApp.convert(5.0, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.FEET),
                "Expected same-unit conversion to return the original value."
        );
    }

    private static void testConversion_InvalidUnit_Throws() {
        assertThrows(
                () -> QuantityMeasurementApp.convert(1.0, null, QuantityMeasurementApp.LengthUnit.FEET),
                "Expected a null source unit to be rejected."
        );
        assertThrows(
                () -> QuantityMeasurementApp.convert(1.0, QuantityMeasurementApp.LengthUnit.FEET, null),
                "Expected a null target unit to be rejected."
        );
    }

    private static void testConversion_NaNOrInfinite_Throws() {
        assertThrows(
                () -> QuantityMeasurementApp.convert(Double.NaN, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCHES),
                "Expected NaN values to be rejected."
        );
        assertThrows(
                () -> QuantityMeasurementApp.convert(Double.POSITIVE_INFINITY, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCHES),
                "Expected infinite values to be rejected."
        );
    }

    private static void testConversion_PrecisionTolerance() {
        assertDoubleEquals(
                0.0833333333,
                QuantityMeasurementApp.convert(1.0, QuantityMeasurementApp.LengthUnit.INCHES,
                        QuantityMeasurementApp.LengthUnit.FEET),
                "Expected inch-to-feet conversion to stay within precision tolerance."
        );
    }

    private static void testConversion_InstanceMethod() {
        QuantityMeasurementApp.QuantityLength length =
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength converted =
                length.convertTo(QuantityMeasurementApp.LengthUnit.INCHES);

        assertDoubleEquals(36.0, converted.getValue(), "Expected instance conversion to return 36.0 inches.");
        assertCondition(
                converted.getUnit() == QuantityMeasurementApp.LengthUnit.INCHES,
                "Expected instance conversion to return the requested target unit."
        );
    }

    private static void testConversion_DemonstrateOverload() {
        QuantityMeasurementApp.QuantityLength length =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);

        assertDoubleEquals(
                36.0,
                QuantityMeasurementApp.demonstrateLengthConversion(length,
                        QuantityMeasurementApp.LengthUnit.INCHES),
                "Expected overloaded demonstration method to convert an existing quantity."
        );
    }

    private static void testAddition_SameUnit_FeetPlusFeet() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET)
        );

        assertQuantityEquals(
                3.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                result,
                "Expected 1.0 feet + 2.0 feet to equal 3.0 feet."
        );
    }

    private static void testAddition_SameUnit_InchPlusInch() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(6.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(6.0, QuantityMeasurementApp.LengthUnit.INCHES)
        );

        assertQuantityEquals(
                12.0,
                QuantityMeasurementApp.LengthUnit.INCHES,
                result,
                "Expected 6.0 inches + 6.0 inches to equal 12.0 inches."
        );
    }

    private static void testAddition_CrossUnit_FeetPlusInches() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES)
        );

        assertQuantityEquals(
                2.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                result,
                "Expected 1.0 feet + 12.0 inches to equal 2.0 feet."
        );
    }

    private static void testAddition_CrossUnit_InchPlusFeet() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET)
        );

        assertQuantityEquals(
                24.0,
                QuantityMeasurementApp.LengthUnit.INCHES,
                result,
                "Expected 12.0 inches + 1.0 feet to equal 24.0 inches."
        );
    }

    private static void testAddition_CrossUnit_YardPlusFeet() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET)
        );

        assertQuantityEquals(
                2.0,
                QuantityMeasurementApp.LengthUnit.YARDS,
                result,
                "Expected 1.0 yard + 3.0 feet to equal 2.0 yards."
        );
    }

    private static void testAddition_CrossUnit_CentimeterPlusInch() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.54, QuantityMeasurementApp.LengthUnit.CENTIMETERS),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES)
        );

        assertQuantityEquals(
                5.08,
                QuantityMeasurementApp.LengthUnit.CENTIMETERS,
                result,
                "Expected 2.54 centimeters + 1.0 inch to equal about 5.08 centimeters."
        );
    }

    private static void testAddition_Commutativity() {
        QuantityMeasurementApp.QuantityLength firstResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.INCHES
        );
        QuantityMeasurementApp.QuantityLength secondResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertCondition(
                firstResult.equals(secondResult),
                "Expected addition to be commutative when results are expressed in the same target unit."
        );
    }

    private static void testAddition_WithZero() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.0, QuantityMeasurementApp.LengthUnit.INCHES)
        );

        assertQuantityEquals(
                5.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                result,
                "Expected adding zero to keep the original value."
        );
    }

    private static void testAddition_NegativeValues() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(-2.0, QuantityMeasurementApp.LengthUnit.FEET)
        );

        assertQuantityEquals(
                3.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                result,
                "Expected 5.0 feet + (-2.0 feet) to equal 3.0 feet."
        );
    }

    private static void testAddition_NullSecondOperand() {
        assertThrows(
                () -> QuantityMeasurementApp.add(
                        new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                        null
                ),
                "Expected a null second operand to be rejected."
        );
    }

    private static void testAddition_LargeValues() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1e6, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(1e6, QuantityMeasurementApp.LengthUnit.FEET)
        );

        assertQuantityEquals(
                2e6,
                QuantityMeasurementApp.LengthUnit.FEET,
                result,
                "Expected large-value addition to remain accurate."
        );
    }

    private static void testAddition_SmallValues() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(0.001, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.002, QuantityMeasurementApp.LengthUnit.FEET)
        );

        assertQuantityEquals(
                0.003,
                QuantityMeasurementApp.LengthUnit.FEET,
                result,
                "Expected small-value addition to remain accurate."
        );
    }

    private static void testAddition_StaticOverload_WithTargetUnit() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                1.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                12.0,
                QuantityMeasurementApp.LengthUnit.INCHES,
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertQuantityEquals(
                24.0,
                QuantityMeasurementApp.LengthUnit.INCHES,
                result,
                "Expected static overload to honor the explicit target unit."
        );
    }

    private static void testAddition_InstanceMethod_WithTargetUnit() {
        QuantityMeasurementApp.QuantityLength firstLength =
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength secondLength =
                new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCHES);

        QuantityMeasurementApp.QuantityLength result = firstLength.add(
                secondLength,
                QuantityMeasurementApp.LengthUnit.FEET
        );

        assertQuantityEquals(
                6.0,
                QuantityMeasurementApp.LengthUnit.FEET,
                result,
                "Expected instance add overload to honor the requested target unit."
        );
    }

    private static void testAddition_ExplicitTargetUnit_Feet() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.FEET
        );

        assertQuantityEquals(2.0, QuantityMeasurementApp.LengthUnit.FEET, result,
                "Expected explicit target FEET addition to return 2.0 FEET.");
    }

    private static void testAddition_ExplicitTargetUnit_Inches() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertQuantityEquals(24.0, QuantityMeasurementApp.LengthUnit.INCHES, result,
                "Expected explicit target INCHES addition to return 24.0 INCHES.");
    }

    private static void testAddition_ExplicitTargetUnit_Yards() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.YARDS
        );

        assertQuantityEquals(2.0 / 3.0, QuantityMeasurementApp.LengthUnit.YARDS, result,
                "Expected explicit target YARDS addition to return about 0.667 YARDS.");
    }

    private static void testAddition_ExplicitTargetUnit_Centimeters() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.CENTIMETERS
        );

        assertQuantityEquals(5.08, QuantityMeasurementApp.LengthUnit.CENTIMETERS, result,
                "Expected explicit target CENTIMETERS addition to return about 5.08 CENTIMETERS.");
    }

    private static void testAddition_ExplicitTargetUnit_SameAsFirstOperand() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET),
                QuantityMeasurementApp.LengthUnit.YARDS
        );

        assertQuantityEquals(3.0, QuantityMeasurementApp.LengthUnit.YARDS, result,
                "Expected explicit target matching first operand to be honored.");
    }

    private static void testAddition_ExplicitTargetUnit_SameAsSecondOperand() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET),
                QuantityMeasurementApp.LengthUnit.FEET
        );

        assertQuantityEquals(9.0, QuantityMeasurementApp.LengthUnit.FEET, result,
                "Expected explicit target matching second operand to be honored.");
    }

    private static void testAddition_ExplicitTargetUnit_Commutativity() {
        QuantityMeasurementApp.QuantityLength firstResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.YARDS
        );
        QuantityMeasurementApp.QuantityLength secondResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                QuantityMeasurementApp.LengthUnit.YARDS
        );

        assertCondition(firstResult.equals(secondResult),
                "Expected explicit target-unit addition to remain commutative.");
    }

    private static void testAddition_ExplicitTargetUnit_WithZero() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.YARDS
        );

        assertQuantityEquals(5.0 / 3.0, QuantityMeasurementApp.LengthUnit.YARDS, result,
                "Expected zero operand with explicit target conversion to preserve value.");
    }

    private static void testAddition_ExplicitTargetUnit_NegativeValues() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(-2.0, QuantityMeasurementApp.LengthUnit.FEET),
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertQuantityEquals(36.0, QuantityMeasurementApp.LengthUnit.INCHES, result,
                "Expected explicit target-unit addition to handle negative values.");
    }

    private static void testAddition_ExplicitTargetUnit_NullTargetUnit() {
        assertThrows(
                () -> QuantityMeasurementApp.add(
                        new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                        new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                        null
                ),
                "Expected a null explicit target unit to be rejected."
        );
    }

    private static void testAddition_ExplicitTargetUnit_LargeToSmallScale() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1000.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(500.0, QuantityMeasurementApp.LengthUnit.FEET),
                QuantityMeasurementApp.LengthUnit.INCHES
        );

        assertQuantityEquals(18000.0, QuantityMeasurementApp.LengthUnit.INCHES, result,
                "Expected explicit target conversion from feet to inches to stay accurate for large values.");
    }

    private static void testAddition_ExplicitTargetUnit_SmallToLargeScale() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.YARDS
        );

        assertQuantityEquals(2.0 / 3.0, QuantityMeasurementApp.LengthUnit.YARDS, result,
                "Expected explicit target conversion from inches to yards to stay accurate.");
    }

    private static void testAddition_ExplicitTargetUnit_PrecisionTolerance() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.54, QuantityMeasurementApp.LengthUnit.CENTIMETERS),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCHES),
                QuantityMeasurementApp.LengthUnit.CENTIMETERS
        );

        assertQuantityEquals(5.08, QuantityMeasurementApp.LengthUnit.CENTIMETERS, result,
                "Expected explicit target-unit addition to stay within precision tolerance.");
    }

    private static void assertCondition(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void assertQuantityEquals(
            double expectedValue,
            QuantityMeasurementApp.LengthUnit expectedUnit,
            QuantityMeasurementApp.QuantityLength actual,
            String message
    ) {
        assertDoubleEquals(expectedValue, actual.getValue(), message);
        assertCondition(actual.getUnit() == expectedUnit, message + " Expected unit: " + expectedUnit
                + ", Actual unit: " + actual.getUnit());
    }

    private static void assertDoubleEquals(double expected, double actual, String message) {
        if (Math.abs(expected - actual) > 1e-5) {
            throw new AssertionError(message + " Expected: " + expected + ", Actual: " + actual);
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
