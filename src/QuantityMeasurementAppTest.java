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
        testLengthUnitEnum_FeetConstant();
        testLengthUnitEnum_InchesConstant();
        testLengthUnitEnum_YardsConstant();
        testLengthUnitEnum_CentimetersConstant();
        testConvertToBaseUnit_FeetToFeet();
        testConvertToBaseUnit_InchesToFeet();
        testConvertToBaseUnit_YardsToFeet();
        testConvertToBaseUnit_CentimetersToFeet();
        testConvertFromBaseUnit_FeetToFeet();
        testConvertFromBaseUnit_FeetToInches();
        testConvertFromBaseUnit_FeetToYards();
        testConvertFromBaseUnit_FeetToCentimeters();
        testQuantityLengthRefactored_Equality();
        testQuantityLengthRefactored_ConvertTo();
        testQuantityLengthRefactored_Add();
        testQuantityLengthRefactored_AddWithTargetUnit();
        testQuantityLengthRefactored_NullUnit();
        testQuantityLengthRefactored_InvalidValue();
        testRoundTripConversion_RefactoredDesign();
        testUnitImmutability();
        testEquality_KilogramToKilogram_SameValue();
        testEquality_KilogramToKilogram_DifferentValue();
        testEquality_KilogramToGram_EquivalentValue();
        testEquality_GramToKilogram_EquivalentValue();
        testEquality_WeightVsLength_Incompatible();
        testEquality_WeightNullComparison();
        testEquality_WeightSameReference();
        testEquality_WeightNullUnit();
        testEquality_WeightTransitiveProperty();
        testEquality_WeightZeroValue();
        testEquality_NegativeWeight();
        testEquality_LargeWeightValue();
        testEquality_SmallWeightValue();
        testConversion_PoundToKilogram();
        testConversion_KilogramToPound();
        testConversion_WeightSameUnit();
        testConversion_WeightZeroValue();
        testConversion_WeightNegativeValue();
        testConversion_WeightRoundTrip();
        testAddition_SameUnit_KilogramPlusKilogram();
        testAddition_CrossUnit_KilogramPlusGram();
        testAddition_CrossUnit_PoundPlusKilogram();
        testAddition_ExplicitTargetUnit_Gram();
        testAddition_WeightCommutativity();
        testAddition_WeightWithZero();
        testAddition_WeightNegativeValues();
        testAddition_WeightLargeValues();
        testWeightUnitEnum_KilogramConstant();
        testWeightUnitEnum_GramConstant();
        testWeightUnitEnum_PoundConstant();
        testWeightUnitConvertToBaseUnit();
        testWeightUnitConvertFromBaseUnit();
        testIMeasurableInterface_LengthUnitImplementation();
        testIMeasurableInterface_WeightUnitImplementation();
        testIMeasurableInterface_ConsistentBehavior();
        testGenericQuantity_LengthOperations_Equality();
        testGenericQuantity_WeightOperations_Equality();
        testGenericQuantity_LengthOperations_Conversion();
        testGenericQuantity_WeightOperations_Conversion();
        testGenericQuantity_LengthOperations_Addition();
        testGenericQuantity_WeightOperations_Addition();
        testCrossCategoryPrevention_LengthVsWeight();
        testGenericQuantity_ConstructorValidation_NullUnit();
        testGenericQuantity_ConstructorValidation_InvalidValue();
        testQuantityMeasurementApp_SimplifiedDemonstration_Equality();
        testQuantityMeasurementApp_SimplifiedDemonstration_Conversion();
        testQuantityMeasurementApp_SimplifiedDemonstration_Addition();
        testTypeWildcard_FlexibleSignatures();
        testHashCode_GenericQuantity_Consistency();
        testEquals_GenericQuantity_ContractPreservation();
        testEnumAsUnitCarrier_BehaviorEncapsulation();
        testTypeErasure_RuntimeSafety();
        testImmutability_GenericQuantity();
        testEquality_LitreToLitre_SameValue();
        testEquality_LitreToLitre_DifferentValue();
        testEquality_LitreToMillilitre_EquivalentValue();
        testEquality_MillilitreToLitre_EquivalentValue();
        testEquality_LitreToGallon_EquivalentValue();
        testEquality_GallonToLitre_EquivalentValue();
        testEquality_VolumeVsLength_Incompatible();
        testEquality_VolumeVsWeight_Incompatible();
        testEquality_VolumeNullComparison();
        testEquality_VolumeSameReference();
        testEquality_VolumeNullUnit();
        testEquality_VolumeTransitiveProperty();
        testEquality_VolumeZeroValue();
        testEquality_NegativeVolume();
        testEquality_LargeVolumeValue();
        testEquality_SmallVolumeValue();
        testConversion_LitreToMillilitre();
        testConversion_MillilitreToLitre();
        testConversion_GallonToLitre();
        testConversion_LitreToGallon();
        testConversion_MillilitreToGallon();
        testConversion_VolumeSameUnit();
        testConversion_VolumeZeroValue();
        testConversion_VolumeNegativeValue();
        testConversion_VolumeRoundTrip();
        testAddition_SameUnit_LitrePlusLitre();
        testAddition_SameUnit_MillilitrePlusMillilitre();
        testAddition_CrossUnit_LitrePlusMillilitre();
        testAddition_CrossUnit_MillilitrePlusLitre();
        testAddition_CrossUnit_GallonPlusLitre();
        testAddition_ExplicitTargetUnit_Litre();
        testAddition_ExplicitTargetUnit_Millilitre();
        testAddition_ExplicitTargetUnit_Gallon();
        testAddition_VolumeCommutativity();
        testAddition_VolumeWithZero();
        testAddition_VolumeNegativeValues();
        testAddition_VolumeLargeValues();
        testAddition_VolumeSmallValues();
        testVolumeUnitEnum_LitreConstant();
        testVolumeUnitEnum_MillilitreConstant();
        testVolumeUnitEnum_GallonConstant();
        testConvertToBaseUnit_LitreToLitre();
        testConvertToBaseUnit_MillilitreToLitre();
        testConvertToBaseUnit_GallonToLitre();
        testConvertFromBaseUnit_LitreToLitre();
        testConvertFromBaseUnit_LitreToMillilitre();
        testConvertFromBaseUnit_LitreToGallon();
        testGenericQuantity_VolumeOperations_Consistency();
        testScalability_VolumeIntegration();
        testSubtraction_SameUnit_FeetMinusFeet();
        testSubtraction_SameUnit_LitreMinusLitre();
        testSubtraction_CrossUnit_FeetMinusInches();
        testSubtraction_CrossUnit_InchesMinusFeet();
        testSubtraction_ExplicitTargetUnit_Inches();
        testSubtraction_ResultingInNegative();
        testSubtraction_ResultingInZero();
        testSubtraction_WithZeroOperand();
        testSubtraction_WithNegativeValues();
        testSubtraction_NonCommutative();
        testSubtraction_NullOperand();
        testSubtraction_NullTargetUnit();
        testSubtraction_ChainedOperations();
        testSubtractionAddition_Inverse();
        testSubtraction_Immutability();
        testDivision_SameUnit_FeetDividedByFeet();
        testDivision_SameUnit_LitreDividedByLitre();
        testDivision_CrossUnit_FeetDividedByInches();
        testDivision_CrossUnit_KilogramDividedByGram();
        testDivision_RatioLessThanOne();
        testDivision_RatioEqualToOne();
        testDivision_NonCommutative();
        testDivision_ByZero();
        testDivision_NullOperand();
        testDivision_AllMeasurementCategories();
        testDivision_Immutability();
        testQuantityMeasurementApp_SimplifiedDemonstration_Subtraction();
        testQuantityMeasurementApp_SimplifiedDemonstration_Division();

        System.out.println("All UC12 tests passed.");
    }

    private static void testEquality_FeetToFeet_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(1.0, FEET) to equal Quantity(1.0, FEET)."
        );
    }

    private static void testEquality_InchToInch_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.INCHES);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(1.0, INCHES) to equal Quantity(1.0, INCHES)."
        );
    }

    private static void testEquality_FeetToInch_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength inchValue =
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES);

        assertCondition(
                feetValue.equals(inchValue),
                "Expected Quantity(1.0, FEET) to equal Quantity(12.0, INCHES)."
        );
    }

    private static void testEquality_InchToFeet_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength inchValue =
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);

        assertCondition(
                inchValue.equals(feetValue),
                "Expected Quantity(12.0, INCHES) to equal Quantity(1.0, FEET)."
        );
    }

    private static void testEquality_FeetToFeet_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.FEET);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, FEET) to not equal Quantity(2.0, FEET)."
        );
    }

    private static void testEquality_InchToInch_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.INCHES);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, INCHES) to not equal Quantity(2.0, INCHES)."
        );
    }

    private static void testEquality_InvalidValue() {
        assertThrows(
                () -> new QuantityMeasurementApp.QuantityLength(Double.NaN, LengthUnit.FEET),
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
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);

        assertCondition(
                value.equals(value),
                "Expected a quantity to be equal to itself."
        );
    }

    private static void testEquality_NullComparison() {
        QuantityMeasurementApp.QuantityLength value =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);

        assertCondition(
                !value.equals(null),
                "Expected a quantity to not be equal to null."
        );
    }

    private static void testEquality_NonQuantityComparison() {
        QuantityMeasurementApp.QuantityLength value =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);

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
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(1.0, YARDS) to equal Quantity(1.0, YARDS)."
        );
    }

    private static void testEquality_YardToYard_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.YARDS);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, YARDS) to not equal Quantity(2.0, YARDS)."
        );
    }

    private static void testEquality_YardToFeet_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(3.0, LengthUnit.FEET);

        assertCondition(
                yardValue.equals(feetValue),
                "Expected Quantity(1.0, YARDS) to equal Quantity(3.0, FEET)."
        );
    }

    private static void testEquality_FeetToYard_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(3.0, LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);

        assertCondition(
                feetValue.equals(yardValue),
                "Expected Quantity(3.0, FEET) to equal Quantity(1.0, YARDS)."
        );
    }

    private static void testEquality_YardToInches_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(36.0, LengthUnit.INCHES);

        assertCondition(
                yardValue.equals(inchesValue),
                "Expected Quantity(1.0, YARDS) to equal Quantity(36.0, INCHES)."
        );
    }

    private static void testEquality_InchesToYard_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(36.0, LengthUnit.INCHES);
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);

        assertCondition(
                inchesValue.equals(yardValue),
                "Expected Quantity(36.0, INCHES) to equal Quantity(1.0, YARDS)."
        );
    }

    private static void testEquality_YardToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.FEET);

        assertCondition(
                !yardValue.equals(feetValue),
                "Expected Quantity(1.0, YARDS) to not equal Quantity(2.0, FEET)."
        );
    }

    private static void testEquality_CentimetersToCentimeters_SameValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.CENTIMETERS);

        assertCondition(
                firstValue.equals(secondValue),
                "Expected Quantity(2.0, CENTIMETERS) to equal Quantity(2.0, CENTIMETERS)."
        );
    }

    private static void testEquality_CentimetersToCentimeters_DifferentValue() {
        QuantityMeasurementApp.QuantityLength firstValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength secondValue =
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.CENTIMETERS);

        assertCondition(
                !firstValue.equals(secondValue),
                "Expected Quantity(1.0, CENTIMETERS) to not equal Quantity(2.0, CENTIMETERS)."
        );
    }

    private static void testEquality_CentimetersToInches_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength centimetersValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(0.393701, LengthUnit.INCHES);

        assertCondition(
                centimetersValue.equals(inchesValue),
                "Expected Quantity(1.0, CENTIMETERS) to equal Quantity(0.393701, INCHES)."
        );
    }

    private static void testEquality_CentimetersToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.QuantityLength centimetersValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.CENTIMETERS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET);

        assertCondition(
                !centimetersValue.equals(feetValue),
                "Expected Quantity(1.0, CENTIMETERS) to not equal Quantity(1.0, FEET)."
        );
    }

    private static void testEquality_MultiUnit_TransitiveProperty() {
        QuantityMeasurementApp.QuantityLength yardValue =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(3.0, LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(36.0, LengthUnit.INCHES);

        assertCondition(
                yardValue.equals(feetValue) && feetValue.equals(inchesValue) && yardValue.equals(inchesValue),
                "Expected transitive equality across YARDS, FEET, and INCHES."
        );
    }

    private static void testEquality_AllUnits_ComplexScenario() {
        QuantityMeasurementApp.QuantityLength yardsValue =
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength feetValue =
                new QuantityMeasurementApp.QuantityLength(6.0, LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength inchesValue =
                new QuantityMeasurementApp.QuantityLength(72.0, LengthUnit.INCHES);

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
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.CENTIMETERS);

        assertCondition(
                value.equals(value),
                "Expected a centimeter quantity to be equal to itself."
        );
    }

    private static void testEquality_CentimetersNullComparison() {
        QuantityMeasurementApp.QuantityLength value =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.CENTIMETERS);

        assertCondition(
                !value.equals(null),
                "Expected a centimeter quantity to not be equal to null."
        );
    }

    private static void testConversion_FeetToInches() {
        assertDoubleEquals(
                12.0,
                QuantityMeasurementApp.convert(1.0, LengthUnit.FEET,
                        LengthUnit.INCHES),
                "Expected 1.0 feet to convert to 12.0 inches."
        );
    }

    private static void testConversion_InchesToFeet() {
        assertDoubleEquals(
                2.0,
                QuantityMeasurementApp.convert(24.0, LengthUnit.INCHES,
                        LengthUnit.FEET),
                "Expected 24.0 inches to convert to 2.0 feet."
        );
    }

    private static void testConversion_YardsToInches() {
        assertDoubleEquals(
                36.0,
                QuantityMeasurementApp.convert(1.0, LengthUnit.YARDS,
                        LengthUnit.INCHES),
                "Expected 1.0 yard to convert to 36.0 inches."
        );
    }

    private static void testConversion_InchesToYards() {
        assertDoubleEquals(
                2.0,
                QuantityMeasurementApp.convert(72.0, LengthUnit.INCHES,
                        LengthUnit.YARDS),
                "Expected 72.0 inches to convert to 2.0 yards."
        );
    }

    private static void testConversion_CentimetersToInches() {
        assertDoubleEquals(
                1.0,
                QuantityMeasurementApp.convert(2.54, LengthUnit.CENTIMETERS,
                        LengthUnit.INCHES),
                "Expected 2.54 centimeters to convert to about 1.0 inch."
        );
    }

    private static void testConversion_FeetToYard() {
        assertDoubleEquals(
                2.0,
                QuantityMeasurementApp.convert(6.0, LengthUnit.FEET,
                        LengthUnit.YARDS),
                "Expected 6.0 feet to convert to 2.0 yards."
        );
    }

    private static void testConversion_RoundTrip_PreservesValue() {
        double originalValue = 5.75;
        double convertedValue = QuantityMeasurementApp.convert(
                originalValue,
                LengthUnit.YARDS,
                LengthUnit.CENTIMETERS
        );
        double roundTripValue = QuantityMeasurementApp.convert(
                convertedValue,
                LengthUnit.CENTIMETERS,
                LengthUnit.YARDS
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
                QuantityMeasurementApp.convert(0.0, LengthUnit.FEET,
                        LengthUnit.INCHES),
                "Expected zero conversion to remain zero."
        );
    }

    private static void testConversion_NegativeValue() {
        assertDoubleEquals(
                -12.0,
                QuantityMeasurementApp.convert(-1.0, LengthUnit.FEET,
                        LengthUnit.INCHES),
                "Expected negative values to preserve sign during conversion."
        );
    }

    private static void testConversion_SameUnit() {
        assertDoubleEquals(
                5.0,
                QuantityMeasurementApp.convert(5.0, LengthUnit.FEET,
                        LengthUnit.FEET),
                "Expected same-unit conversion to return the original value."
        );
    }

    private static void testConversion_InvalidUnit_Throws() {
        assertThrows(
                () -> QuantityMeasurementApp.convert(1.0, null, LengthUnit.FEET),
                "Expected a null source unit to be rejected."
        );
        assertThrows(
                () -> QuantityMeasurementApp.convert(1.0, LengthUnit.FEET, null),
                "Expected a null target unit to be rejected."
        );
    }

    private static void testConversion_NaNOrInfinite_Throws() {
        assertThrows(
                () -> QuantityMeasurementApp.convert(Double.NaN, LengthUnit.FEET,
                        LengthUnit.INCHES),
                "Expected NaN values to be rejected."
        );
        assertThrows(
                () -> QuantityMeasurementApp.convert(Double.POSITIVE_INFINITY, LengthUnit.FEET,
                        LengthUnit.INCHES),
                "Expected infinite values to be rejected."
        );
    }

    private static void testConversion_PrecisionTolerance() {
        assertDoubleEquals(
                0.0833333333,
                QuantityMeasurementApp.convert(1.0, LengthUnit.INCHES,
                        LengthUnit.FEET),
                "Expected inch-to-feet conversion to stay within precision tolerance."
        );
    }

    private static void testConversion_InstanceMethod() {
        QuantityMeasurementApp.QuantityLength length =
                new QuantityMeasurementApp.QuantityLength(3.0, LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength converted =
                length.convertTo(LengthUnit.INCHES);

        assertDoubleEquals(36.0, converted.getValue(), "Expected instance conversion to return 36.0 inches.");
        assertCondition(
                converted.getUnit() == LengthUnit.INCHES,
                "Expected instance conversion to return the requested target unit."
        );
    }

    private static void testConversion_DemonstrateOverload() {
        QuantityMeasurementApp.QuantityLength length =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);

        assertDoubleEquals(
                36.0,
                QuantityMeasurementApp.demonstrateLengthConversion(length,
                        LengthUnit.INCHES),
                "Expected overloaded demonstration method to convert an existing quantity."
        );
    }

    private static void testAddition_SameUnit_FeetPlusFeet() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.FEET)
        );

        assertQuantityEquals(
                3.0,
                LengthUnit.FEET,
                result,
                "Expected 1.0 feet + 2.0 feet to equal 3.0 feet."
        );
    }

    private static void testAddition_SameUnit_InchPlusInch() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(6.0, LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(6.0, LengthUnit.INCHES)
        );

        assertQuantityEquals(
                12.0,
                LengthUnit.INCHES,
                result,
                "Expected 6.0 inches + 6.0 inches to equal 12.0 inches."
        );
    }

    private static void testAddition_CrossUnit_FeetPlusInches() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES)
        );

        assertQuantityEquals(
                2.0,
                LengthUnit.FEET,
                result,
                "Expected 1.0 feet + 12.0 inches to equal 2.0 feet."
        );
    }

    private static void testAddition_CrossUnit_InchPlusFeet() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET)
        );

        assertQuantityEquals(
                24.0,
                LengthUnit.INCHES,
                result,
                "Expected 12.0 inches + 1.0 feet to equal 24.0 inches."
        );
    }

    private static void testAddition_CrossUnit_YardPlusFeet() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, LengthUnit.FEET)
        );

        assertQuantityEquals(
                2.0,
                LengthUnit.YARDS,
                result,
                "Expected 1.0 yard + 3.0 feet to equal 2.0 yards."
        );
    }

    private static void testAddition_CrossUnit_CentimeterPlusInch() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.54, LengthUnit.CENTIMETERS),
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.INCHES)
        );

        assertQuantityEquals(
                5.08,
                LengthUnit.CENTIMETERS,
                result,
                "Expected 2.54 centimeters + 1.0 inch to equal about 5.08 centimeters."
        );
    }

    private static void testAddition_Commutativity() {
        QuantityMeasurementApp.QuantityLength firstResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.INCHES
        );
        QuantityMeasurementApp.QuantityLength secondResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                LengthUnit.INCHES
        );

        assertCondition(
                firstResult.equals(secondResult),
                "Expected addition to be commutative when results are expressed in the same target unit."
        );
    }

    private static void testAddition_WithZero() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.0, LengthUnit.INCHES)
        );

        assertQuantityEquals(
                5.0,
                LengthUnit.FEET,
                result,
                "Expected adding zero to keep the original value."
        );
    }

    private static void testAddition_NegativeValues() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(-2.0, LengthUnit.FEET)
        );

        assertQuantityEquals(
                3.0,
                LengthUnit.FEET,
                result,
                "Expected 5.0 feet + (-2.0 feet) to equal 3.0 feet."
        );
    }

    private static void testAddition_NullSecondOperand() {
        assertThrows(
                () -> QuantityMeasurementApp.add(
                        new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                        null
                ),
                "Expected a null second operand to be rejected."
        );
    }

    private static void testAddition_LargeValues() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1e6, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(1e6, LengthUnit.FEET)
        );

        assertQuantityEquals(
                2e6,
                LengthUnit.FEET,
                result,
                "Expected large-value addition to remain accurate."
        );
    }

    private static void testAddition_SmallValues() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(0.001, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.002, LengthUnit.FEET)
        );

        assertQuantityEquals(
                0.003,
                LengthUnit.FEET,
                result,
                "Expected small-value addition to remain accurate."
        );
    }

    private static void testAddition_StaticOverload_WithTargetUnit() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                1.0,
                LengthUnit.FEET,
                12.0,
                LengthUnit.INCHES,
                LengthUnit.INCHES
        );

        assertQuantityEquals(
                24.0,
                LengthUnit.INCHES,
                result,
                "Expected static overload to honor the explicit target unit."
        );
    }

    private static void testAddition_InstanceMethod_WithTargetUnit() {
        QuantityMeasurementApp.QuantityLength firstLength =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.YARDS);
        QuantityMeasurementApp.QuantityLength secondLength =
                new QuantityMeasurementApp.QuantityLength(36.0, LengthUnit.INCHES);

        QuantityMeasurementApp.QuantityLength result = firstLength.add(
                secondLength,
                LengthUnit.FEET
        );

        assertQuantityEquals(
                6.0,
                LengthUnit.FEET,
                result,
                "Expected instance add overload to honor the requested target unit."
        );
    }

    private static void testAddition_ExplicitTargetUnit_Feet() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.FEET
        );

        assertQuantityEquals(2.0, LengthUnit.FEET, result,
                "Expected explicit target FEET addition to return 2.0 FEET.");
    }

    private static void testAddition_ExplicitTargetUnit_Inches() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.INCHES
        );

        assertQuantityEquals(24.0, LengthUnit.INCHES, result,
                "Expected explicit target INCHES addition to return 24.0 INCHES.");
    }

    private static void testAddition_ExplicitTargetUnit_Yards() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );

        assertQuantityEquals(2.0 / 3.0, LengthUnit.YARDS, result,
                "Expected explicit target YARDS addition to return about 0.667 YARDS.");
    }

    private static void testAddition_ExplicitTargetUnit_Centimeters() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.INCHES),
                LengthUnit.CENTIMETERS
        );

        assertQuantityEquals(5.08, LengthUnit.CENTIMETERS, result,
                "Expected explicit target CENTIMETERS addition to return about 5.08 CENTIMETERS.");
    }

    private static void testAddition_ExplicitTargetUnit_SameAsFirstOperand() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, LengthUnit.FEET),
                LengthUnit.YARDS
        );

        assertQuantityEquals(3.0, LengthUnit.YARDS, result,
                "Expected explicit target matching first operand to be honored.");
    }

    private static void testAddition_ExplicitTargetUnit_SameAsSecondOperand() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.0, LengthUnit.YARDS),
                new QuantityMeasurementApp.QuantityLength(3.0, LengthUnit.FEET),
                LengthUnit.FEET
        );

        assertQuantityEquals(9.0, LengthUnit.FEET, result,
                "Expected explicit target matching second operand to be honored.");
    }

    private static void testAddition_ExplicitTargetUnit_Commutativity() {
        QuantityMeasurementApp.QuantityLength firstResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );
        QuantityMeasurementApp.QuantityLength secondResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                LengthUnit.YARDS
        );

        assertCondition(firstResult.equals(secondResult),
                "Expected explicit target-unit addition to remain commutative.");
    }

    private static void testAddition_ExplicitTargetUnit_WithZero() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(0.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );

        assertQuantityEquals(5.0 / 3.0, LengthUnit.YARDS, result,
                "Expected zero operand with explicit target conversion to preserve value.");
    }

    private static void testAddition_ExplicitTargetUnit_NegativeValues() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(5.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(-2.0, LengthUnit.FEET),
                LengthUnit.INCHES
        );

        assertQuantityEquals(36.0, LengthUnit.INCHES, result,
                "Expected explicit target-unit addition to handle negative values.");
    }

    private static void testAddition_ExplicitTargetUnit_NullTargetUnit() {
        assertThrows(
                () -> QuantityMeasurementApp.add(
                        new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET),
                        new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                        null
                ),
                "Expected a null explicit target unit to be rejected."
        );
    }

    private static void testAddition_ExplicitTargetUnit_LargeToSmallScale() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(1000.0, LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(500.0, LengthUnit.FEET),
                LengthUnit.INCHES
        );

        assertQuantityEquals(18000.0, LengthUnit.INCHES, result,
                "Expected explicit target conversion from feet to inches to stay accurate for large values.");
    }

    private static void testAddition_ExplicitTargetUnit_SmallToLargeScale() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );

        assertQuantityEquals(2.0 / 3.0, LengthUnit.YARDS, result,
                "Expected explicit target conversion from inches to yards to stay accurate.");
    }

    private static void testAddition_ExplicitTargetUnit_PrecisionTolerance() {
        QuantityMeasurementApp.QuantityLength result = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityLength(2.54, LengthUnit.CENTIMETERS),
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.INCHES),
                LengthUnit.CENTIMETERS
        );

        assertQuantityEquals(5.08, LengthUnit.CENTIMETERS, result,
                "Expected explicit target-unit addition to stay within precision tolerance.");
    }

    private static void testLengthUnitEnum_FeetConstant() {
        assertDoubleEquals(1.0, LengthUnit.FEET.getConversionFactor(),
                "Expected FEET conversion factor to be 1.0.");
    }

    private static void testLengthUnitEnum_InchesConstant() {
        assertDoubleEquals(1.0 / 12.0, LengthUnit.INCHES.getConversionFactor(),
                "Expected INCHES conversion factor to be 1/12.");
    }

    private static void testLengthUnitEnum_YardsConstant() {
        assertDoubleEquals(3.0, LengthUnit.YARDS.getConversionFactor(),
                "Expected YARDS conversion factor to be 3.0.");
    }

    private static void testLengthUnitEnum_CentimetersConstant() {
        assertDoubleEquals(1.0 / 30.48, LengthUnit.CENTIMETERS.getConversionFactor(),
                "Expected CENTIMETERS conversion factor to be 1/30.48.");
    }

    private static void testConvertToBaseUnit_FeetToFeet() {
        assertDoubleEquals(5.0, LengthUnit.FEET.convertToBaseUnit(5.0),
                "Expected FEET base conversion to leave the value unchanged.");
    }

    private static void testConvertToBaseUnit_InchesToFeet() {
        assertDoubleEquals(1.0, LengthUnit.INCHES.convertToBaseUnit(12.0),
                "Expected 12 inches to convert to 1 foot.");
    }

    private static void testConvertToBaseUnit_YardsToFeet() {
        assertDoubleEquals(3.0, LengthUnit.YARDS.convertToBaseUnit(1.0),
                "Expected 1 yard to convert to 3 feet.");
    }

    private static void testConvertToBaseUnit_CentimetersToFeet() {
        assertDoubleEquals(1.0, LengthUnit.CENTIMETERS.convertToBaseUnit(30.48),
                "Expected 30.48 centimeters to convert to 1 foot.");
    }

    private static void testConvertFromBaseUnit_FeetToFeet() {
        assertDoubleEquals(2.0, LengthUnit.FEET.convertFromBaseUnit(2.0),
                "Expected FEET from-base conversion to leave the value unchanged.");
    }

    private static void testConvertFromBaseUnit_FeetToInches() {
        assertDoubleEquals(12.0, LengthUnit.INCHES.convertFromBaseUnit(1.0),
                "Expected 1 foot to convert to 12 inches.");
    }

    private static void testConvertFromBaseUnit_FeetToYards() {
        assertDoubleEquals(1.0, LengthUnit.YARDS.convertFromBaseUnit(3.0),
                "Expected 3 feet to convert to 1 yard.");
    }

    private static void testConvertFromBaseUnit_FeetToCentimeters() {
        assertDoubleEquals(30.48, LengthUnit.CENTIMETERS.convertFromBaseUnit(1.0),
                "Expected 1 foot to convert to 30.48 centimeters.");
    }

    private static void testQuantityLengthRefactored_Equality() {
        assertCondition(
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET)
                        .equals(new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES)),
                "Expected refactored QuantityLength equality to still work across units."
        );
    }

    private static void testQuantityLengthRefactored_ConvertTo() {
        QuantityMeasurementApp.QuantityLength result =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET).convertTo(LengthUnit.INCHES);

        assertQuantityEquals(12.0, LengthUnit.INCHES, result,
                "Expected refactored convertTo to delegate through standalone LengthUnit.");
    }

    private static void testQuantityLengthRefactored_Add() {
        QuantityMeasurementApp.QuantityLength result =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET)
                        .add(new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES), LengthUnit.FEET);

        assertQuantityEquals(2.0, LengthUnit.FEET, result,
                "Expected refactored add to delegate through standalone LengthUnit.");
    }

    private static void testQuantityLengthRefactored_AddWithTargetUnit() {
        QuantityMeasurementApp.QuantityLength result =
                new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET)
                        .add(new QuantityMeasurementApp.QuantityLength(12.0, LengthUnit.INCHES), LengthUnit.YARDS);

        assertQuantityEquals(2.0 / 3.0, LengthUnit.YARDS, result,
                "Expected refactored add with explicit target unit to still work.");
    }

    private static void testQuantityLengthRefactored_NullUnit() {
        assertThrows(
                () -> new QuantityMeasurementApp.QuantityLength(1.0, null),
                "Expected refactored QuantityLength to reject null units."
        );
    }

    private static void testQuantityLengthRefactored_InvalidValue() {
        assertThrows(
                () -> new QuantityMeasurementApp.QuantityLength(Double.NaN, LengthUnit.FEET),
                "Expected refactored QuantityLength to reject invalid values."
        );
    }

    private static void testRoundTripConversion_RefactoredDesign() {
        double converted = LengthUnit.INCHES.convertFromBaseUnit(LengthUnit.YARDS.convertToBaseUnit(2.5));
        double roundTrip = LengthUnit.YARDS.convertFromBaseUnit(LengthUnit.INCHES.convertToBaseUnit(converted));

        assertDoubleEquals(2.5, roundTrip,
                "Expected round-trip conversion using standalone LengthUnit methods to preserve value.");
    }

    private static void testUnitImmutability() {
        assertCondition(
                LengthUnit.values().length == 4
                        && LengthUnit.valueOf("FEET") == LengthUnit.FEET
                        && LengthUnit.valueOf("INCHES") == LengthUnit.INCHES,
                "Expected LengthUnit enum constants to remain stable and immutable."
        );
    }

    private static void testEquality_KilogramToKilogram_SameValue() {
        assertCondition(
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                        .equals(new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)),
                "Expected identical kilogram weights to be equal."
        );
    }

    private static void testEquality_KilogramToKilogram_DifferentValue() {
        assertCondition(
                !new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                        .equals(new QuantityMeasurementApp.QuantityWeight(2.0, WeightUnit.KILOGRAM)),
                "Expected different kilogram weights to not be equal."
        );
    }

    private static void testEquality_KilogramToGram_EquivalentValue() {
        assertCondition(
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                        .equals(new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM)),
                "Expected 1 kilogram to equal 1000 grams."
        );
    }

    private static void testEquality_GramToKilogram_EquivalentValue() {
        assertCondition(
                new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM)
                        .equals(new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)),
                "Expected 1000 grams to equal 1 kilogram."
        );
    }

    private static void testEquality_WeightVsLength_Incompatible() {
        assertCondition(
                !new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                        .equals(new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET)),
                "Expected weight and length quantities to be incomparable."
        );
    }

    private static void testEquality_WeightNullComparison() {
        assertCondition(
                !new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM).equals(null),
                "Expected a weight quantity to not equal null."
        );
    }

    private static void testEquality_WeightSameReference() {
        QuantityMeasurementApp.QuantityWeight weight =
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM);

        assertCondition(weight.equals(weight), "Expected a weight quantity to equal itself.");
    }

    private static void testEquality_WeightNullUnit() {
        assertThrows(
                () -> new QuantityMeasurementApp.QuantityWeight(1.0, null),
                "Expected QuantityWeight to reject a null unit."
        );
    }

    private static void testEquality_WeightTransitiveProperty() {
        QuantityMeasurementApp.QuantityWeight kilograms =
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityMeasurementApp.QuantityWeight grams =
                new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM);
        QuantityMeasurementApp.QuantityWeight pounds =
                new QuantityMeasurementApp.QuantityWeight(2.2046244201837775, WeightUnit.POUND);

        assertCondition(
                kilograms.equals(grams) && grams.equals(pounds) && kilograms.equals(pounds),
                "Expected weight equality to be transitive across units."
        );
    }

    private static void testEquality_WeightZeroValue() {
        assertCondition(
                new QuantityMeasurementApp.QuantityWeight(0.0, WeightUnit.KILOGRAM)
                        .equals(new QuantityMeasurementApp.QuantityWeight(0.0, WeightUnit.GRAM)),
                "Expected zero weight values to be equal across units."
        );
    }

    private static void testEquality_NegativeWeight() {
        assertCondition(
                new QuantityMeasurementApp.QuantityWeight(-1.0, WeightUnit.KILOGRAM)
                        .equals(new QuantityMeasurementApp.QuantityWeight(-1000.0, WeightUnit.GRAM)),
                "Expected negative weights to compare correctly across units."
        );
    }

    private static void testEquality_LargeWeightValue() {
        assertCondition(
                new QuantityMeasurementApp.QuantityWeight(1000000.0, WeightUnit.GRAM)
                        .equals(new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.KILOGRAM)),
                "Expected large weight values to maintain precision across units."
        );
    }

    private static void testEquality_SmallWeightValue() {
        assertCondition(
                new QuantityMeasurementApp.QuantityWeight(0.001, WeightUnit.KILOGRAM)
                        .equals(new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.GRAM)),
                "Expected small weight values to maintain precision across units."
        );
    }

    private static void testConversion_PoundToKilogram() {
        assertWeightEquals(
                0.907184,
                WeightUnit.KILOGRAM,
                new QuantityMeasurementApp.QuantityWeight(2.0, WeightUnit.POUND).convertTo(WeightUnit.KILOGRAM),
                "Expected pounds to convert to kilograms correctly."
        );
    }

    private static void testConversion_KilogramToPound() {
        assertWeightEquals(
                2.2046244201837775,
                WeightUnit.POUND,
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM).convertTo(WeightUnit.POUND),
                "Expected kilograms to convert to pounds correctly."
        );
    }

    private static void testConversion_WeightSameUnit() {
        assertWeightEquals(
                5.0,
                WeightUnit.KILOGRAM,
                new QuantityMeasurementApp.QuantityWeight(5.0, WeightUnit.KILOGRAM).convertTo(WeightUnit.KILOGRAM),
                "Expected same-unit weight conversion to preserve value."
        );
    }

    private static void testConversion_WeightZeroValue() {
        assertWeightEquals(
                0.0,
                WeightUnit.GRAM,
                new QuantityMeasurementApp.QuantityWeight(0.0, WeightUnit.KILOGRAM).convertTo(WeightUnit.GRAM),
                "Expected zero weight conversion to preserve zero."
        );
    }

    private static void testConversion_WeightNegativeValue() {
        assertWeightEquals(
                -1000.0,
                WeightUnit.GRAM,
                new QuantityMeasurementApp.QuantityWeight(-1.0, WeightUnit.KILOGRAM).convertTo(WeightUnit.GRAM),
                "Expected negative weight conversion to preserve sign."
        );
    }

    private static void testConversion_WeightRoundTrip() {
        QuantityMeasurementApp.QuantityWeight roundTrip =
                new QuantityMeasurementApp.QuantityWeight(1.5, WeightUnit.KILOGRAM)
                        .convertTo(WeightUnit.GRAM)
                        .convertTo(WeightUnit.KILOGRAM);

        assertWeightEquals(1.5, WeightUnit.KILOGRAM, roundTrip,
                "Expected weight round-trip conversion to preserve value.");
    }

    private static void testAddition_SameUnit_KilogramPlusKilogram() {
        assertWeightEquals(
                3.0,
                WeightUnit.KILOGRAM,
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                        .add(new QuantityMeasurementApp.QuantityWeight(2.0, WeightUnit.KILOGRAM)),
                "Expected kilogram addition to work without conversion."
        );
    }

    private static void testAddition_CrossUnit_KilogramPlusGram() {
        assertWeightEquals(
                2.0,
                WeightUnit.KILOGRAM,
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                        .add(new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM)),
                "Expected kilogram plus gram addition to convert correctly."
        );
    }

    private static void testAddition_CrossUnit_PoundPlusKilogram() {
        assertWeightEquals(
                4.409248840367555,
                WeightUnit.POUND,
                new QuantityMeasurementApp.QuantityWeight(2.2046244201837775, WeightUnit.POUND)
                        .add(new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)),
                "Expected pound plus kilogram addition to convert correctly."
        );
    }

    private static void testAddition_ExplicitTargetUnit_Gram() {
        assertWeightEquals(
                2000.0,
                WeightUnit.GRAM,
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                        .add(new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM), WeightUnit.GRAM),
                "Expected explicit target weight addition to honor grams."
        );
    }

    private static void testAddition_WeightCommutativity() {
        QuantityMeasurementApp.QuantityWeight firstResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM),
                new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM),
                WeightUnit.GRAM
        );
        QuantityMeasurementApp.QuantityWeight secondResult = QuantityMeasurementApp.add(
                new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM),
                new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM),
                WeightUnit.GRAM
        );

        assertCondition(firstResult.equals(secondResult),
                "Expected weight addition to be commutative for the same target unit.");
    }

    private static void testAddition_WeightWithZero() {
        assertWeightEquals(
                5.0,
                WeightUnit.KILOGRAM,
                new QuantityMeasurementApp.QuantityWeight(5.0, WeightUnit.KILOGRAM)
                        .add(new QuantityMeasurementApp.QuantityWeight(0.0, WeightUnit.GRAM)),
                "Expected adding zero weight to preserve the original value."
        );
    }

    private static void testAddition_WeightNegativeValues() {
        assertWeightEquals(
                3.0,
                WeightUnit.KILOGRAM,
                new QuantityMeasurementApp.QuantityWeight(5.0, WeightUnit.KILOGRAM)
                        .add(new QuantityMeasurementApp.QuantityWeight(-2000.0, WeightUnit.GRAM)),
                "Expected weight addition to handle negative values."
        );
    }

    private static void testAddition_WeightLargeValues() {
        assertWeightEquals(
                2e6,
                WeightUnit.KILOGRAM,
                new QuantityMeasurementApp.QuantityWeight(1e6, WeightUnit.KILOGRAM)
                        .add(new QuantityMeasurementApp.QuantityWeight(1e6, WeightUnit.KILOGRAM)),
                "Expected large weight additions to remain accurate."
        );
    }

    private static void testWeightUnitEnum_KilogramConstant() {
        assertDoubleEquals(1.0, WeightUnit.KILOGRAM.getConversionFactor(),
                "Expected kilogram conversion factor to be 1.0.");
    }

    private static void testWeightUnitEnum_GramConstant() {
        assertDoubleEquals(0.001, WeightUnit.GRAM.getConversionFactor(),
                "Expected gram conversion factor to be 0.001.");
    }

    private static void testWeightUnitEnum_PoundConstant() {
        assertDoubleEquals(0.453592, WeightUnit.POUND.getConversionFactor(),
                "Expected pound conversion factor to be 0.453592.");
    }

    private static void testWeightUnitConvertToBaseUnit() {
        assertDoubleEquals(1.0, WeightUnit.GRAM.convertToBaseUnit(1000.0),
                "Expected grams to convert to kilograms through the base-unit API.");
        assertDoubleEquals(1.0, WeightUnit.POUND.convertToBaseUnit(2.2046244201837775),
                "Expected pounds to convert to kilograms through the base-unit API.");
    }

    private static void testWeightUnitConvertFromBaseUnit() {
        assertDoubleEquals(1000.0, WeightUnit.GRAM.convertFromBaseUnit(1.0),
                "Expected kilograms to convert to grams through the base-unit API.");
        assertDoubleEquals(2.2046244201837775, WeightUnit.POUND.convertFromBaseUnit(1.0),
                "Expected kilograms to convert to pounds through the base-unit API.");
    }

    private static void testIMeasurableInterface_LengthUnitImplementation() {
        IMeasurable measurable = LengthUnit.FEET;
        assertDoubleEquals(1.0, measurable.getConversionFactor(),
                "Expected LengthUnit to implement IMeasurable.");
    }

    private static void testIMeasurableInterface_WeightUnitImplementation() {
        IMeasurable measurable = WeightUnit.KILOGRAM;
        assertDoubleEquals(1.0, measurable.getConversionFactor(),
                "Expected WeightUnit to implement IMeasurable.");
    }

    private static void testIMeasurableInterface_ConsistentBehavior() {
        assertDoubleEquals(12.0, LengthUnit.INCHES.convertFromBaseUnit(1.0),
                "Expected LengthUnit to honor the IMeasurable contract.");
        assertDoubleEquals(1000.0, WeightUnit.GRAM.convertFromBaseUnit(1.0),
                "Expected WeightUnit to honor the IMeasurable contract.");
    }

    private static void testGenericQuantity_LengthOperations_Equality() {
        assertCondition(
                new Quantity<>(1.0, LengthUnit.FEET).equals(new Quantity<>(12.0, LengthUnit.INCHES)),
                "Expected generic Quantity length equality to work."
        );
    }

    private static void testGenericQuantity_WeightOperations_Equality() {
        assertCondition(
                new Quantity<>(1.0, WeightUnit.KILOGRAM).equals(new Quantity<>(1000.0, WeightUnit.GRAM)),
                "Expected generic Quantity weight equality to work."
        );
    }

    private static void testGenericQuantity_LengthOperations_Conversion() {
        assertGenericQuantityEquals(
                12.0,
                LengthUnit.INCHES,
                new Quantity<>(1.0, LengthUnit.FEET).convertTo(LengthUnit.INCHES),
                "Expected generic Quantity length conversion to work."
        );
    }

    private static void testGenericQuantity_WeightOperations_Conversion() {
        assertGenericQuantityEquals(
                1000.0,
                WeightUnit.GRAM,
                new Quantity<>(1.0, WeightUnit.KILOGRAM).convertTo(WeightUnit.GRAM),
                "Expected generic Quantity weight conversion to work."
        );
    }

    private static void testGenericQuantity_LengthOperations_Addition() {
        assertGenericQuantityEquals(
                2.0,
                LengthUnit.FEET,
                new Quantity<>(1.0, LengthUnit.FEET)
                        .add(new Quantity<>(12.0, LengthUnit.INCHES), LengthUnit.FEET),
                "Expected generic Quantity length addition to work."
        );
    }

    private static void testGenericQuantity_WeightOperations_Addition() {
        assertGenericQuantityEquals(
                2.0,
                WeightUnit.KILOGRAM,
                new Quantity<>(1.0, WeightUnit.KILOGRAM)
                        .add(new Quantity<>(1000.0, WeightUnit.GRAM), WeightUnit.KILOGRAM),
                "Expected generic Quantity weight addition to work."
        );
    }

    private static void testCrossCategoryPrevention_LengthVsWeight() {
        assertCondition(
                !new Quantity<>(1.0, LengthUnit.FEET).equals(new Quantity<>(1.0, WeightUnit.KILOGRAM)),
                "Expected generic Quantity to reject cross-category equality."
        );
    }

    private static void testGenericQuantity_ConstructorValidation_NullUnit() {
        assertThrows(
                () -> new Quantity<>(1.0, (LengthUnit) null),
                "Expected generic Quantity to reject null units."
        );
    }

    private static void testGenericQuantity_ConstructorValidation_InvalidValue() {
        assertThrows(
                () -> new Quantity<>(Double.NaN, LengthUnit.FEET),
                "Expected generic Quantity to reject invalid values."
        );
    }

    private static void testQuantityMeasurementApp_SimplifiedDemonstration_Equality() {
        assertCondition(
                QuantityMeasurementApp.demonstrateEquality(
                        new Quantity<>(1.0, LengthUnit.FEET),
                        new Quantity<>(12.0, LengthUnit.INCHES)
                ),
                "Expected generic demonstrateEquality to work for length quantities."
        );
        assertCondition(
                QuantityMeasurementApp.demonstrateEquality(
                        new Quantity<>(1.0, WeightUnit.KILOGRAM),
                        new Quantity<>(1000.0, WeightUnit.GRAM)
                ),
                "Expected generic demonstrateEquality to work for weight quantities."
        );
    }

    private static void testQuantityMeasurementApp_SimplifiedDemonstration_Conversion() {
        assertGenericQuantityEquals(
                12.0,
                LengthUnit.INCHES,
                QuantityMeasurementApp.demonstrateConversion(new Quantity<>(1.0, LengthUnit.FEET), LengthUnit.INCHES),
                "Expected generic demonstrateConversion to work for length quantities."
        );
        assertGenericQuantityEquals(
                1000.0,
                WeightUnit.GRAM,
                QuantityMeasurementApp.demonstrateConversion(new Quantity<>(1.0, WeightUnit.KILOGRAM), WeightUnit.GRAM),
                "Expected generic demonstrateConversion to work for weight quantities."
        );
    }

    private static void testQuantityMeasurementApp_SimplifiedDemonstration_Addition() {
        assertGenericQuantityEquals(
                2.0,
                LengthUnit.FEET,
                QuantityMeasurementApp.demonstrateAddition(
                        new Quantity<>(1.0, LengthUnit.FEET),
                        new Quantity<>(12.0, LengthUnit.INCHES),
                        LengthUnit.FEET
                ),
                "Expected generic demonstrateAddition to work for length quantities."
        );
        assertGenericQuantityEquals(
                2.0,
                WeightUnit.KILOGRAM,
                QuantityMeasurementApp.demonstrateAddition(
                        new Quantity<>(1.0, WeightUnit.KILOGRAM),
                        new Quantity<>(1000.0, WeightUnit.GRAM),
                        WeightUnit.KILOGRAM
                ),
                "Expected generic demonstrateAddition to work for weight quantities."
        );
    }

    private static void testTypeWildcard_FlexibleSignatures() {
        assertCondition(
                isQuantityValid(new Quantity<>(1.0, LengthUnit.FEET))
                        && isQuantityValid(new Quantity<>(1.0, WeightUnit.KILOGRAM)),
                "Expected Quantity<?> signatures to work across measurement categories."
        );
    }

    private static void testHashCode_GenericQuantity_Consistency() {
        Quantity<LengthUnit> first = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> second = new Quantity<>(12.0, LengthUnit.INCHES);

        assertCondition(first.equals(second) && first.hashCode() == second.hashCode(),
                "Expected equal generic quantities to share the same hash code.");
    }

    private static void testEquals_GenericQuantity_ContractPreservation() {
        Quantity<WeightUnit> first = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> second = new Quantity<>(1000.0, WeightUnit.GRAM);
        Quantity<WeightUnit> third = new Quantity<>(2.2046244201837775, WeightUnit.POUND);

        assertCondition(first.equals(first), "Expected generic equals to be reflexive.");
        assertCondition(first.equals(second) && second.equals(first), "Expected generic equals to be symmetric.");
        assertCondition(first.equals(second) && second.equals(third) && first.equals(third),
                "Expected generic equals to be transitive.");
    }

    private static void testEnumAsUnitCarrier_BehaviorEncapsulation() {
        IMeasurable measurable = LengthUnit.YARDS;
        assertDoubleEquals(3.0, measurable.convertToBaseUnit(1.0),
                "Expected enum units to carry conversion behavior through the interface.");
    }

    private static void testTypeErasure_RuntimeSafety() {
        Quantity<?> length = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<?> weight = new Quantity<>(1.0, WeightUnit.KILOGRAM);

        assertCondition(!length.equals(weight),
                "Expected runtime unit-class checks to preserve cross-category safety.");
    }

    private static void testImmutability_GenericQuantity() {
        Quantity<LengthUnit> original = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> converted = original.convertTo(LengthUnit.INCHES);

        assertGenericQuantityEquals(1.0, LengthUnit.FEET, original,
                "Expected generic Quantity to remain immutable after conversion.");
        assertGenericQuantityEquals(12.0, LengthUnit.INCHES, converted,
                "Expected generic Quantity conversion to return a new value object.");
    }

    private static void testEquality_LitreToLitre_SameValue() {
        assertCondition(
                new Quantity<>(1.0, VolumeUnit.LITRE).equals(new Quantity<>(1.0, VolumeUnit.LITRE)),
                "Expected identical litre quantities to be equal."
        );
    }

    private static void testEquality_LitreToLitre_DifferentValue() {
        assertCondition(
                !new Quantity<>(1.0, VolumeUnit.LITRE).equals(new Quantity<>(2.0, VolumeUnit.LITRE)),
                "Expected different litre quantities to not be equal."
        );
    }

    private static void testEquality_LitreToMillilitre_EquivalentValue() {
        assertCondition(
                new Quantity<>(1.0, VolumeUnit.LITRE).equals(new Quantity<>(1000.0, VolumeUnit.MILLILITRE)),
                "Expected 1 litre to equal 1000 millilitres."
        );
    }

    private static void testEquality_MillilitreToLitre_EquivalentValue() {
        assertCondition(
                new Quantity<>(1000.0, VolumeUnit.MILLILITRE).equals(new Quantity<>(1.0, VolumeUnit.LITRE)),
                "Expected 1000 millilitres to equal 1 litre."
        );
    }

    private static void testEquality_LitreToGallon_EquivalentValue() {
        assertCondition(
                new Quantity<>(1.0, VolumeUnit.LITRE).equals(new Quantity<>(0.264172176857989, VolumeUnit.GALLON)),
                "Expected 1 litre to equal about 0.264172 gallons."
        );
    }

    private static void testEquality_GallonToLitre_EquivalentValue() {
        assertCondition(
                new Quantity<>(1.0, VolumeUnit.GALLON).equals(new Quantity<>(3.78541, VolumeUnit.LITRE)),
                "Expected 1 gallon to equal about 3.78541 litres."
        );
    }

    private static void testEquality_VolumeVsLength_Incompatible() {
        assertCondition(
                !new Quantity<>(1.0, VolumeUnit.LITRE).equals(new Quantity<>(1.0, LengthUnit.FEET)),
                "Expected volume and length quantities to be incomparable."
        );
    }

    private static void testEquality_VolumeVsWeight_Incompatible() {
        assertCondition(
                !new Quantity<>(1.0, VolumeUnit.LITRE).equals(new Quantity<>(1.0, WeightUnit.KILOGRAM)),
                "Expected volume and weight quantities to be incomparable."
        );
    }

    private static void testEquality_VolumeNullComparison() {
        assertCondition(
                !new Quantity<>(1.0, VolumeUnit.LITRE).equals(null),
                "Expected a volume quantity to not equal null."
        );
    }

    private static void testEquality_VolumeSameReference() {
        Quantity<VolumeUnit> volume = new Quantity<>(1.0, VolumeUnit.LITRE);
        assertCondition(volume.equals(volume), "Expected a volume quantity to equal itself.");
    }

    private static void testEquality_VolumeNullUnit() {
        assertThrows(
                () -> new Quantity<>(1.0, (VolumeUnit) null),
                "Expected generic Quantity to reject null volume units."
        );
    }

    private static void testEquality_VolumeTransitiveProperty() {
        Quantity<VolumeUnit> litres = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> millilitres = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> gallons = new Quantity<>(0.264172176857989, VolumeUnit.GALLON);

        assertCondition(
                litres.equals(millilitres) && millilitres.equals(gallons) && litres.equals(gallons),
                "Expected volume equality to be transitive across units."
        );
    }

    private static void testEquality_VolumeZeroValue() {
        assertCondition(
                new Quantity<>(0.0, VolumeUnit.LITRE).equals(new Quantity<>(0.0, VolumeUnit.MILLILITRE)),
                "Expected zero volume values to be equal across units."
        );
    }

    private static void testEquality_NegativeVolume() {
        assertCondition(
                new Quantity<>(-1.0, VolumeUnit.LITRE).equals(new Quantity<>(-1000.0, VolumeUnit.MILLILITRE)),
                "Expected negative volume values to compare correctly across units."
        );
    }

    private static void testEquality_LargeVolumeValue() {
        assertCondition(
                new Quantity<>(1000000.0, VolumeUnit.MILLILITRE).equals(new Quantity<>(1000.0, VolumeUnit.LITRE)),
                "Expected large volume values to maintain precision across units."
        );
    }

    private static void testEquality_SmallVolumeValue() {
        assertCondition(
                new Quantity<>(0.001, VolumeUnit.LITRE).equals(new Quantity<>(1.0, VolumeUnit.MILLILITRE)),
                "Expected small volume values to maintain precision across units."
        );
    }

    private static void testConversion_LitreToMillilitre() {
        assertGenericQuantityEquals(
                1000.0,
                VolumeUnit.MILLILITRE,
                new Quantity<>(1.0, VolumeUnit.LITRE).convertTo(VolumeUnit.MILLILITRE),
                "Expected litre to millilitre conversion to work."
        );
    }

    private static void testConversion_MillilitreToLitre() {
        assertGenericQuantityEquals(
                1.0,
                VolumeUnit.LITRE,
                new Quantity<>(1000.0, VolumeUnit.MILLILITRE).convertTo(VolumeUnit.LITRE),
                "Expected millilitre to litre conversion to work."
        );
    }

    private static void testConversion_GallonToLitre() {
        assertGenericQuantityEquals(
                3.78541,
                VolumeUnit.LITRE,
                new Quantity<>(1.0, VolumeUnit.GALLON).convertTo(VolumeUnit.LITRE),
                "Expected gallon to litre conversion to work."
        );
    }

    private static void testConversion_LitreToGallon() {
        assertGenericQuantityEquals(
                1.0,
                VolumeUnit.GALLON,
                new Quantity<>(3.78541, VolumeUnit.LITRE).convertTo(VolumeUnit.GALLON),
                "Expected litre to gallon conversion to work."
        );
    }

    private static void testConversion_MillilitreToGallon() {
        assertGenericQuantityEquals(
                0.264172176857989,
                VolumeUnit.GALLON,
                new Quantity<>(1000.0, VolumeUnit.MILLILITRE).convertTo(VolumeUnit.GALLON),
                "Expected millilitre to gallon conversion to work."
        );
    }

    private static void testConversion_VolumeSameUnit() {
        assertGenericQuantityEquals(
                5.0,
                VolumeUnit.LITRE,
                new Quantity<>(5.0, VolumeUnit.LITRE).convertTo(VolumeUnit.LITRE),
                "Expected same-unit volume conversion to preserve value."
        );
    }

    private static void testConversion_VolumeZeroValue() {
        assertGenericQuantityEquals(
                0.0,
                VolumeUnit.MILLILITRE,
                new Quantity<>(0.0, VolumeUnit.LITRE).convertTo(VolumeUnit.MILLILITRE),
                "Expected zero volume conversion to preserve zero."
        );
    }

    private static void testConversion_VolumeNegativeValue() {
        assertGenericQuantityEquals(
                -1000.0,
                VolumeUnit.MILLILITRE,
                new Quantity<>(-1.0, VolumeUnit.LITRE).convertTo(VolumeUnit.MILLILITRE),
                "Expected negative volume conversion to preserve sign."
        );
    }

    private static void testConversion_VolumeRoundTrip() {
        Quantity<VolumeUnit> roundTrip = new Quantity<>(1.5, VolumeUnit.LITRE)
                .convertTo(VolumeUnit.MILLILITRE)
                .convertTo(VolumeUnit.LITRE);

        assertGenericQuantityEquals(1.5, VolumeUnit.LITRE, roundTrip,
                "Expected volume round-trip conversion to preserve value.");
    }

    private static void testAddition_SameUnit_LitrePlusLitre() {
        assertGenericQuantityEquals(
                3.0,
                VolumeUnit.LITRE,
                new Quantity<>(1.0, VolumeUnit.LITRE).add(new Quantity<>(2.0, VolumeUnit.LITRE)),
                "Expected litre addition to work without conversion."
        );
    }

    private static void testAddition_SameUnit_MillilitrePlusMillilitre() {
        assertGenericQuantityEquals(
                1000.0,
                VolumeUnit.MILLILITRE,
                new Quantity<>(500.0, VolumeUnit.MILLILITRE).add(new Quantity<>(500.0, VolumeUnit.MILLILITRE)),
                "Expected millilitre addition to work without conversion."
        );
    }

    private static void testAddition_CrossUnit_LitrePlusMillilitre() {
        assertGenericQuantityEquals(
                2.0,
                VolumeUnit.LITRE,
                new Quantity<>(1.0, VolumeUnit.LITRE).add(new Quantity<>(1000.0, VolumeUnit.MILLILITRE)),
                "Expected litre plus millilitre addition to convert correctly."
        );
    }

    private static void testAddition_CrossUnit_MillilitrePlusLitre() {
        assertGenericQuantityEquals(
                2000.0,
                VolumeUnit.MILLILITRE,
                new Quantity<>(1000.0, VolumeUnit.MILLILITRE).add(new Quantity<>(1.0, VolumeUnit.LITRE)),
                "Expected millilitre plus litre addition to convert correctly."
        );
    }

    private static void testAddition_CrossUnit_GallonPlusLitre() {
        assertGenericQuantityEquals(
                2.0,
                VolumeUnit.GALLON,
                new Quantity<>(1.0, VolumeUnit.GALLON).add(new Quantity<>(3.78541, VolumeUnit.LITRE)),
                "Expected gallon plus litre addition to convert correctly."
        );
    }

    private static void testAddition_ExplicitTargetUnit_Litre() {
        assertGenericQuantityEquals(
                2.0,
                VolumeUnit.LITRE,
                new Quantity<>(1.0, VolumeUnit.LITRE)
                        .add(new Quantity<>(1000.0, VolumeUnit.MILLILITRE), VolumeUnit.LITRE),
                "Expected explicit target litre addition to work."
        );
    }

    private static void testAddition_ExplicitTargetUnit_Millilitre() {
        assertGenericQuantityEquals(
                2000.0,
                VolumeUnit.MILLILITRE,
                new Quantity<>(1.0, VolumeUnit.LITRE)
                        .add(new Quantity<>(1000.0, VolumeUnit.MILLILITRE), VolumeUnit.MILLILITRE),
                "Expected explicit target millilitre addition to work."
        );
    }

    private static void testAddition_ExplicitTargetUnit_Gallon() {
        assertGenericQuantityEquals(
                2.0,
                VolumeUnit.GALLON,
                new Quantity<>(3.78541, VolumeUnit.LITRE)
                        .add(new Quantity<>(3.78541, VolumeUnit.LITRE), VolumeUnit.GALLON),
                "Expected explicit target gallon addition to work."
        );
    }

    private static void testAddition_VolumeCommutativity() {
        Quantity<VolumeUnit> firstResult = new Quantity<>(1.0, VolumeUnit.LITRE)
                .add(new Quantity<>(1000.0, VolumeUnit.MILLILITRE), VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> secondResult = new Quantity<>(1000.0, VolumeUnit.MILLILITRE)
                .add(new Quantity<>(1.0, VolumeUnit.LITRE), VolumeUnit.MILLILITRE);

        assertCondition(firstResult.equals(secondResult),
                "Expected volume addition to be commutative for the same target unit.");
    }

    private static void testAddition_VolumeWithZero() {
        assertGenericQuantityEquals(
                5.0,
                VolumeUnit.LITRE,
                new Quantity<>(5.0, VolumeUnit.LITRE).add(new Quantity<>(0.0, VolumeUnit.MILLILITRE)),
                "Expected adding zero volume to preserve the original value."
        );
    }

    private static void testAddition_VolumeNegativeValues() {
        assertGenericQuantityEquals(
                3.0,
                VolumeUnit.LITRE,
                new Quantity<>(5.0, VolumeUnit.LITRE).add(new Quantity<>(-2000.0, VolumeUnit.MILLILITRE)),
                "Expected volume addition to handle negative values."
        );
    }

    private static void testAddition_VolumeLargeValues() {
        assertGenericQuantityEquals(
                2e6,
                VolumeUnit.LITRE,
                new Quantity<>(1e6, VolumeUnit.LITRE).add(new Quantity<>(1e6, VolumeUnit.LITRE)),
                "Expected large volume additions to remain accurate."
        );
    }

    private static void testAddition_VolumeSmallValues() {
        assertGenericQuantityEquals(
                0.003,
                VolumeUnit.LITRE,
                new Quantity<>(0.001, VolumeUnit.LITRE).add(new Quantity<>(0.002, VolumeUnit.LITRE)),
                "Expected small volume additions to remain accurate."
        );
    }

    private static void testVolumeUnitEnum_LitreConstant() {
        assertDoubleEquals(1.0, VolumeUnit.LITRE.getConversionFactor(),
                "Expected litre conversion factor to be 1.0.");
    }

    private static void testVolumeUnitEnum_MillilitreConstant() {
        assertDoubleEquals(0.001, VolumeUnit.MILLILITRE.getConversionFactor(),
                "Expected millilitre conversion factor to be 0.001.");
    }

    private static void testVolumeUnitEnum_GallonConstant() {
        assertDoubleEquals(3.78541, VolumeUnit.GALLON.getConversionFactor(),
                "Expected gallon conversion factor to be 3.78541.");
    }

    private static void testConvertToBaseUnit_LitreToLitre() {
        assertDoubleEquals(5.0, VolumeUnit.LITRE.convertToBaseUnit(5.0),
                "Expected litre base conversion to leave the value unchanged.");
    }

    private static void testConvertToBaseUnit_MillilitreToLitre() {
        assertDoubleEquals(1.0, VolumeUnit.MILLILITRE.convertToBaseUnit(1000.0),
                "Expected millilitres to convert to litres through the base-unit API.");
    }

    private static void testConvertToBaseUnit_GallonToLitre() {
        assertDoubleEquals(3.78541, VolumeUnit.GALLON.convertToBaseUnit(1.0),
                "Expected gallons to convert to litres through the base-unit API.");
    }

    private static void testConvertFromBaseUnit_LitreToLitre() {
        assertDoubleEquals(2.0, VolumeUnit.LITRE.convertFromBaseUnit(2.0),
                "Expected litre from-base conversion to leave the value unchanged.");
    }

    private static void testConvertFromBaseUnit_LitreToMillilitre() {
        assertDoubleEquals(1000.0, VolumeUnit.MILLILITRE.convertFromBaseUnit(1.0),
                "Expected litres to convert to millilitres through the base-unit API.");
    }

    private static void testConvertFromBaseUnit_LitreToGallon() {
        assertDoubleEquals(1.0, VolumeUnit.GALLON.convertFromBaseUnit(3.78541),
                "Expected litres to convert to gallons through the base-unit API.");
    }

    private static void testGenericQuantity_VolumeOperations_Consistency() {
        assertGenericQuantityEquals(
                1000.0,
                VolumeUnit.MILLILITRE,
                new Quantity<>(1.0, VolumeUnit.LITRE).convertTo(VolumeUnit.MILLILITRE),
                "Expected generic Quantity to work seamlessly with volume units."
        );
    }

    private static void testScalability_VolumeIntegration() {
        assertCondition(
                QuantityMeasurementApp.demonstrateEquality(
                        new Quantity<>(1.0, VolumeUnit.LITRE),
                        new Quantity<>(1000.0, VolumeUnit.MILLILITRE)
                ),
                "Expected volume to integrate with the generic demonstration flow without code changes."
        );
        assertGenericQuantityEquals(
                2.0,
                VolumeUnit.LITRE,
                QuantityMeasurementApp.demonstrateAddition(
                        new Quantity<>(1.0, VolumeUnit.LITRE),
                        new Quantity<>(1000.0, VolumeUnit.MILLILITRE),
                        VolumeUnit.LITRE
                ),
                "Expected volume to integrate with the generic addition flow without code changes."
        );
    }

    private static void testSubtraction_SameUnit_FeetMinusFeet() {
        assertGenericQuantityEquals(
                5.0,
                LengthUnit.FEET,
                new Quantity<>(10.0, LengthUnit.FEET).subtract(new Quantity<>(5.0, LengthUnit.FEET)),
                "Expected same-unit length subtraction to work."
        );
    }

    private static void testSubtraction_SameUnit_LitreMinusLitre() {
        assertGenericQuantityEquals(
                7.0,
                VolumeUnit.LITRE,
                new Quantity<>(10.0, VolumeUnit.LITRE).subtract(new Quantity<>(3.0, VolumeUnit.LITRE)),
                "Expected same-unit volume subtraction to work."
        );
    }

    private static void testSubtraction_CrossUnit_FeetMinusInches() {
        assertGenericQuantityEquals(
                9.5,
                LengthUnit.FEET,
                new Quantity<>(10.0, LengthUnit.FEET).subtract(new Quantity<>(6.0, LengthUnit.INCHES)),
                "Expected cross-unit subtraction to convert to the first operand's unit."
        );
    }

    private static void testSubtraction_CrossUnit_InchesMinusFeet() {
        assertGenericQuantityEquals(
                60.0,
                LengthUnit.INCHES,
                new Quantity<>(120.0, LengthUnit.INCHES).subtract(new Quantity<>(5.0, LengthUnit.FEET)),
                "Expected cross-unit subtraction to work in inches."
        );
    }

    private static void testSubtraction_ExplicitTargetUnit_Inches() {
        assertGenericQuantityEquals(
                114.0,
                LengthUnit.INCHES,
                new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(6.0, LengthUnit.INCHES), LengthUnit.INCHES),
                "Expected explicit target-unit subtraction to work."
        );
    }

    private static void testSubtraction_ResultingInNegative() {
        assertGenericQuantityEquals(
                -5.0,
                LengthUnit.FEET,
                new Quantity<>(5.0, LengthUnit.FEET).subtract(new Quantity<>(10.0, LengthUnit.FEET)),
                "Expected subtraction to support negative results."
        );
    }

    private static void testSubtraction_ResultingInZero() {
        assertGenericQuantityEquals(
                0.0,
                LengthUnit.FEET,
                new Quantity<>(10.0, LengthUnit.FEET).subtract(new Quantity<>(120.0, LengthUnit.INCHES)),
                "Expected subtracting equivalent quantities to yield zero."
        );
    }

    private static void testSubtraction_WithZeroOperand() {
        assertGenericQuantityEquals(
                5.0,
                LengthUnit.FEET,
                new Quantity<>(5.0, LengthUnit.FEET).subtract(new Quantity<>(0.0, LengthUnit.INCHES)),
                "Expected subtracting zero to preserve the original value."
        );
    }

    private static void testSubtraction_WithNegativeValues() {
        assertGenericQuantityEquals(
                7.0,
                LengthUnit.FEET,
                new Quantity<>(5.0, LengthUnit.FEET).subtract(new Quantity<>(-2.0, LengthUnit.FEET)),
                "Expected subtraction with negative values to work."
        );
    }

    private static void testSubtraction_NonCommutative() {
        Quantity<LengthUnit> first = new Quantity<>(10.0, LengthUnit.FEET)
                .subtract(new Quantity<>(5.0, LengthUnit.FEET));
        Quantity<LengthUnit> second = new Quantity<>(5.0, LengthUnit.FEET)
                .subtract(new Quantity<>(10.0, LengthUnit.FEET));

        assertCondition(first.getValue() == 5.0 && second.getValue() == -5.0,
                "Expected subtraction to be non-commutative.");
    }

    private static void testSubtraction_NullOperand() {
        assertThrows(
                () -> new Quantity<>(10.0, LengthUnit.FEET).subtract(null),
                "Expected subtraction to reject null operands."
        );
    }

    private static void testSubtraction_NullTargetUnit() {
        assertThrows(
                () -> new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(5.0, LengthUnit.FEET), null),
                "Expected subtraction to reject null target units."
        );
    }

    private static void testSubtraction_ChainedOperations() {
        assertGenericQuantityEquals(
                7.0,
                LengthUnit.FEET,
                new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(2.0, LengthUnit.FEET))
                        .subtract(new Quantity<>(1.0, LengthUnit.FEET)),
                "Expected subtraction results to support chaining."
        );
    }

    private static void testSubtractionAddition_Inverse() {
        Quantity<LengthUnit> original = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> other = new Quantity<>(2.0, LengthUnit.FEET);
        Quantity<LengthUnit> result = original.add(other).subtract(other);

        assertGenericQuantityEquals(10.0, LengthUnit.FEET, result,
                "Expected addition followed by subtraction to return the original value.");
    }

    private static void testSubtraction_Immutability() {
        Quantity<LengthUnit> original = new Quantity<>(10.0, LengthUnit.FEET);
        Quantity<LengthUnit> result = original.subtract(new Quantity<>(2.0, LengthUnit.FEET));

        assertGenericQuantityEquals(10.0, LengthUnit.FEET, original,
                "Expected original quantity to remain unchanged after subtraction.");
        assertGenericQuantityEquals(8.0, LengthUnit.FEET, result,
                "Expected subtraction to return a new quantity.");
    }

    private static void testDivision_SameUnit_FeetDividedByFeet() {
        assertDoubleEquals(5.0,
                new Quantity<>(10.0, LengthUnit.FEET).divide(new Quantity<>(2.0, LengthUnit.FEET)),
                "Expected same-unit division to work.");
    }

    private static void testDivision_SameUnit_LitreDividedByLitre() {
        assertDoubleEquals(2.0,
                new Quantity<>(10.0, VolumeUnit.LITRE).divide(new Quantity<>(5.0, VolumeUnit.LITRE)),
                "Expected same-unit volume division to work.");
    }

    private static void testDivision_CrossUnit_FeetDividedByInches() {
        assertDoubleEquals(1.0,
                new Quantity<>(24.0, LengthUnit.INCHES).divide(new Quantity<>(2.0, LengthUnit.FEET)),
                "Expected cross-unit length division to work.");
    }

    private static void testDivision_CrossUnit_KilogramDividedByGram() {
        assertDoubleEquals(1.0,
                new Quantity<>(2.0, WeightUnit.KILOGRAM).divide(new Quantity<>(2000.0, WeightUnit.GRAM)),
                "Expected cross-unit weight division to work.");
    }

    private static void testDivision_RatioLessThanOne() {
        assertDoubleEquals(0.5,
                new Quantity<>(5.0, LengthUnit.FEET).divide(new Quantity<>(10.0, LengthUnit.FEET)),
                "Expected division to support ratios below one.");
    }

    private static void testDivision_RatioEqualToOne() {
        assertDoubleEquals(1.0,
                new Quantity<>(10.0, LengthUnit.FEET).divide(new Quantity<>(10.0, LengthUnit.FEET)),
                "Expected equal quantities to divide to one.");
    }

    private static void testDivision_NonCommutative() {
        double first = new Quantity<>(10.0, LengthUnit.FEET).divide(new Quantity<>(5.0, LengthUnit.FEET));
        double second = new Quantity<>(5.0, LengthUnit.FEET).divide(new Quantity<>(10.0, LengthUnit.FEET));

        assertCondition(first == 2.0 && second == 0.5,
                "Expected division to be non-commutative.");
    }

    private static void testDivision_ByZero() {
        assertArithmeticThrows(
                () -> new Quantity<>(10.0, LengthUnit.FEET).divide(new Quantity<>(0.0, LengthUnit.FEET)),
                "Expected division by zero quantity to throw ArithmeticException."
        );
    }

    private static void testDivision_NullOperand() {
        assertThrows(
                () -> new Quantity<>(10.0, LengthUnit.FEET).divide(null),
                "Expected division to reject null operands."
        );
    }

    private static void testDivision_AllMeasurementCategories() {
        assertDoubleEquals(2.0,
                new Quantity<>(10.0, WeightUnit.KILOGRAM).divide(new Quantity<>(5.0, WeightUnit.KILOGRAM)),
                "Expected division to work for weight.");
        assertDoubleEquals(0.5,
                new Quantity<>(5.0, VolumeUnit.LITRE).divide(new Quantity<>(10.0, VolumeUnit.LITRE)),
                "Expected division to work for volume.");
    }

    private static void testDivision_Immutability() {
        Quantity<LengthUnit> original = new Quantity<>(10.0, LengthUnit.FEET);
        double result = original.divide(new Quantity<>(2.0, LengthUnit.FEET));

        assertGenericQuantityEquals(10.0, LengthUnit.FEET, original,
                "Expected original quantity to remain unchanged after division.");
        assertDoubleEquals(5.0, result, "Expected division to return the correct scalar result.");
    }

    private static void testQuantityMeasurementApp_SimplifiedDemonstration_Subtraction() {
        assertGenericQuantityEquals(
                5.0,
                WeightUnit.KILOGRAM,
                QuantityMeasurementApp.demonstrateSubtraction(
                        new Quantity<>(10.0, WeightUnit.KILOGRAM),
                        new Quantity<>(5000.0, WeightUnit.GRAM),
                        WeightUnit.KILOGRAM
                ),
                "Expected generic subtraction demonstration to work."
        );
    }

    private static void testQuantityMeasurementApp_SimplifiedDemonstration_Division() {
        assertDoubleEquals(
                1.0,
                QuantityMeasurementApp.demonstrateDivision(
                        new Quantity<>(1000.0, VolumeUnit.MILLILITRE),
                        new Quantity<>(1.0, VolumeUnit.LITRE)
                ),
                "Expected generic division demonstration to work."
        );
    }

    private static void assertCondition(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void assertQuantityEquals(
            double expectedValue,
            LengthUnit expectedUnit,
            QuantityMeasurementApp.QuantityLength actual,
            String message
    ) {
        assertDoubleEquals(expectedValue, actual.getValue(), message);
        assertCondition(actual.getUnit() == expectedUnit, message + " Expected unit: " + expectedUnit
                + ", Actual unit: " + actual.getUnit());
    }

    private static void assertWeightEquals(
            double expectedValue,
            WeightUnit expectedUnit,
            QuantityMeasurementApp.QuantityWeight actual,
            String message
    ) {
        assertDoubleEquals(expectedValue, actual.getValue(), message);
        assertCondition(actual.getUnit() == expectedUnit, message + " Expected unit: " + expectedUnit
                + ", Actual unit: " + actual.getUnit());
    }

    private static <U extends IMeasurable> void assertGenericQuantityEquals(
            double expectedValue,
            U expectedUnit,
            Quantity<U> actual,
            String message
    ) {
        assertDoubleEquals(expectedValue, actual.getValue(), message);
        assertCondition(actual.getUnit() == expectedUnit, message + " Expected unit: " + expectedUnit
                + ", Actual unit: " + actual.getUnit());
    }

    private static boolean isQuantityValid(Quantity<?> quantity) {
        return quantity != null && quantity.getUnit() != null;
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

    private static void assertArithmeticThrows(Runnable runnable, String message) {
        try {
            runnable.run();
            throw new AssertionError(message);
        } catch (ArithmeticException ignored) {
        }
    }
}

