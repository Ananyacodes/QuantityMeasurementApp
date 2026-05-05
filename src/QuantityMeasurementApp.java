public class QuantityMeasurementApp {
    public static void main(String[] args) {
        printSubtractionExamples();
        printDivisionExamples();
    }

    public static boolean areFeetEqual(double firstValue, double secondValue) {
        return new QuantityLength(firstValue, LengthUnit.FEET)
                .equals(new QuantityLength(secondValue, LengthUnit.FEET));
    }

    public static boolean areInchesEqual(double firstValue, double secondValue) {
        return new QuantityLength(firstValue, LengthUnit.INCHES)
                .equals(new QuantityLength(secondValue, LengthUnit.INCHES));
    }

    public static boolean areFeetAndInchesEqual(double feetValue, double inchesValue) {
        return new QuantityLength(feetValue, LengthUnit.FEET)
                .equals(new QuantityLength(inchesValue, LengthUnit.INCHES));
    }

    public static double convert(double value, LengthUnit sourceUnit, LengthUnit targetUnit) {
        return new QuantityLength(value, sourceUnit).convertTo(targetUnit).getValue();
    }

    public static double convert(double value, WeightUnit sourceUnit, WeightUnit targetUnit) {
        return new QuantityWeight(value, sourceUnit).convertTo(targetUnit).getValue();
    }

    public static double demonstrateLengthConversion(double value, LengthUnit sourceUnit, LengthUnit targetUnit) {
        return convert(value, sourceUnit, targetUnit);
    }

    public static double demonstrateLengthConversion(QuantityLength quantityLength, LengthUnit targetUnit) {
        if (quantityLength == null) {
            throw new IllegalArgumentException("Quantity cannot be null.");
        }
        return quantityLength.convertTo(targetUnit).getValue();
    }

    public static boolean demonstrateLengthEquality(QuantityLength firstLength, QuantityLength secondLength) {
        if (firstLength == null || secondLength == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        return firstLength.equals(secondLength);
    }

    public static boolean demonstrateLengthComparison(
            double firstValue,
            LengthUnit firstUnit,
            double secondValue,
            LengthUnit secondUnit
    ) {
        return new QuantityLength(firstValue, firstUnit)
                .equals(new QuantityLength(secondValue, secondUnit));
    }

    public static <U extends IMeasurable> boolean demonstrateEquality(Quantity<U> first, Quantity<U> second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        return first.equals(second);
    }

    public static <U extends IMeasurable> Quantity<U> demonstrateConversion(Quantity<U> quantity, U targetUnit) {
        if (quantity == null) {
            throw new IllegalArgumentException("Quantity cannot be null.");
        }
        return quantity.convertTo(targetUnit);
    }

    public static <U extends IMeasurable> Quantity<U> demonstrateAddition(
            Quantity<U> first,
            Quantity<U> second,
            U targetUnit
    ) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        return first.add(second, targetUnit);
    }

    public static <U extends IMeasurable> Quantity<U> demonstrateSubtraction(
            Quantity<U> first,
            Quantity<U> second
    ) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        return first.subtract(second);
    }

    public static <U extends IMeasurable> Quantity<U> demonstrateSubtraction(
            Quantity<U> first,
            Quantity<U> second,
            U targetUnit
    ) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        return first.subtract(second, targetUnit);
    }

    public static <U extends IMeasurable> double demonstrateDivision(Quantity<U> first, Quantity<U> second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        return first.divide(second);
    }

    public static QuantityLength add(QuantityLength firstLength, QuantityLength secondLength) {
        validateLengths(firstLength, secondLength);
        return firstLength.add(secondLength);
    }

    public static QuantityLength add(
            QuantityLength firstLength,
            QuantityLength secondLength,
            LengthUnit targetUnit
    ) {
        validateLengths(firstLength, secondLength);
        return firstLength.add(secondLength, targetUnit);
    }

    public static QuantityLength add(
            double firstValue,
            LengthUnit firstUnit,
            double secondValue,
            LengthUnit secondUnit,
            LengthUnit targetUnit
    ) {
        return new QuantityLength(firstValue, firstUnit)
                .add(new QuantityLength(secondValue, secondUnit), targetUnit);
    }

    public static QuantityWeight add(QuantityWeight firstWeight, QuantityWeight secondWeight) {
        validateWeights(firstWeight, secondWeight);
        return firstWeight.add(secondWeight);
    }

    public static QuantityWeight add(
            QuantityWeight firstWeight,
            QuantityWeight secondWeight,
            WeightUnit targetUnit
    ) {
        validateWeights(firstWeight, secondWeight);
        return firstWeight.add(secondWeight, targetUnit);
    }

    public static QuantityWeight add(
            double firstValue,
            WeightUnit firstUnit,
            double secondValue,
            WeightUnit secondUnit,
            WeightUnit targetUnit
    ) {
        return new QuantityWeight(firstValue, firstUnit)
                .add(new QuantityWeight(secondValue, secondUnit), targetUnit);
    }

    public static final class QuantityLength extends Quantity<LengthUnit> {
        public QuantityLength(double value, LengthUnit unit) {
            super(value, unit);
        }

        @Override
        public QuantityLength convertTo(LengthUnit targetUnit) {
            Quantity<LengthUnit> converted = super.convertTo(targetUnit);
            return new QuantityLength(converted.getValue(), converted.getUnit());
        }

        public QuantityLength add(QuantityLength other) {
            Quantity<LengthUnit> result = super.add(other);
            return new QuantityLength(result.getValue(), result.getUnit());
        }

        public QuantityLength add(QuantityLength other, LengthUnit targetUnit) {
            Quantity<LengthUnit> result = super.add(other, targetUnit);
            return new QuantityLength(result.getValue(), result.getUnit());
        }

        public QuantityLength subtract(QuantityLength other) {
            Quantity<LengthUnit> result = super.subtract(other);
            return new QuantityLength(result.getValue(), result.getUnit());
        }

        public QuantityLength subtract(QuantityLength other, LengthUnit targetUnit) {
            Quantity<LengthUnit> result = super.subtract(other, targetUnit);
            return new QuantityLength(result.getValue(), result.getUnit());
        }
    }

    public static final class QuantityWeight extends Quantity<WeightUnit> {
        public QuantityWeight(double value, WeightUnit unit) {
            super(value, unit);
        }

        @Override
        public QuantityWeight convertTo(WeightUnit targetUnit) {
            Quantity<WeightUnit> converted = super.convertTo(targetUnit);
            return new QuantityWeight(converted.getValue(), converted.getUnit());
        }

        public QuantityWeight add(QuantityWeight other) {
            Quantity<WeightUnit> result = super.add(other);
            return new QuantityWeight(result.getValue(), result.getUnit());
        }

        public QuantityWeight add(QuantityWeight other, WeightUnit targetUnit) {
            Quantity<WeightUnit> result = super.add(other, targetUnit);
            return new QuantityWeight(result.getValue(), result.getUnit());
        }

        public QuantityWeight subtract(QuantityWeight other) {
            Quantity<WeightUnit> result = super.subtract(other);
            return new QuantityWeight(result.getValue(), result.getUnit());
        }

        public QuantityWeight subtract(QuantityWeight other, WeightUnit targetUnit) {
            Quantity<WeightUnit> result = super.subtract(other, targetUnit);
            return new QuantityWeight(result.getValue(), result.getUnit());
        }
    }

    private static void validateLengths(QuantityLength firstLength, QuantityLength secondLength) {
        if (firstLength == null || secondLength == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
    }

    private static void validateWeights(QuantityWeight firstWeight, QuantityWeight secondWeight) {
        if (firstWeight == null || secondWeight == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
    }

    private static void printSubtractionExamples() {
        System.out.println("Subtraction with Implicit Target Unit:");
        printExample(
                "new Quantity<>(10.0, FEET).subtract(new Quantity<>(6.0, INCHES))",
                new Quantity<>(10.0, LengthUnit.FEET).subtract(new Quantity<>(6.0, LengthUnit.INCHES))
        );
        printExample(
                "new Quantity<>(10.0, KILOGRAM).subtract(new Quantity<>(5000.0, GRAM))",
                new Quantity<>(10.0, WeightUnit.KILOGRAM).subtract(new Quantity<>(5000.0, WeightUnit.GRAM))
        );
        printExample(
                "new Quantity<>(5.0, LITRE).subtract(new Quantity<>(500.0, MILLILITRE))",
                new Quantity<>(5.0, VolumeUnit.LITRE).subtract(new Quantity<>(500.0, VolumeUnit.MILLILITRE))
        );
        System.out.println();

        System.out.println("Subtraction with Explicit Target Unit:");
        printExample(
                "new Quantity<>(10.0, FEET).subtract(new Quantity<>(6.0, INCHES), INCHES)",
                new Quantity<>(10.0, LengthUnit.FEET)
                        .subtract(new Quantity<>(6.0, LengthUnit.INCHES), LengthUnit.INCHES)
        );
        printExample(
                "new Quantity<>(10.0, KILOGRAM).subtract(new Quantity<>(5000.0, GRAM), GRAM)",
                new Quantity<>(10.0, WeightUnit.KILOGRAM)
                        .subtract(new Quantity<>(5000.0, WeightUnit.GRAM), WeightUnit.GRAM)
        );
        printExample(
                "new Quantity<>(5.0, LITRE).subtract(new Quantity<>(2.0, LITRE), MILLILITRE)",
                new Quantity<>(5.0, VolumeUnit.LITRE)
                        .subtract(new Quantity<>(2.0, VolumeUnit.LITRE), VolumeUnit.MILLILITRE)
        );
        System.out.println();

        System.out.println("Subtraction Resulting in Negative Values:");
        printExample(
                "new Quantity<>(5.0, FEET).subtract(new Quantity<>(10.0, FEET))",
                new Quantity<>(5.0, LengthUnit.FEET).subtract(new Quantity<>(10.0, LengthUnit.FEET))
        );
        printExample(
                "new Quantity<>(2.0, KILOGRAM).subtract(new Quantity<>(5.0, KILOGRAM))",
                new Quantity<>(2.0, WeightUnit.KILOGRAM).subtract(new Quantity<>(5.0, WeightUnit.KILOGRAM))
        );
        System.out.println();

        System.out.println("Subtraction Resulting in Zero:");
        printExample(
                "new Quantity<>(10.0, FEET).subtract(new Quantity<>(120.0, INCHES))",
                new Quantity<>(10.0, LengthUnit.FEET).subtract(new Quantity<>(120.0, LengthUnit.INCHES))
        );
        printExample(
                "new Quantity<>(1.0, LITRE).subtract(new Quantity<>(1000.0, MILLILITRE))",
                new Quantity<>(1.0, VolumeUnit.LITRE).subtract(new Quantity<>(1000.0, VolumeUnit.MILLILITRE))
        );
        System.out.println();
    }

    private static void printDivisionExamples() {
        System.out.println("Division Operations:");
        printExample(
                "new Quantity<>(10.0, FEET).divide(new Quantity<>(2.0, FEET))",
                new Quantity<>(10.0, LengthUnit.FEET).divide(new Quantity<>(2.0, LengthUnit.FEET))
        );
        printExample(
                "new Quantity<>(24.0, INCHES).divide(new Quantity<>(2.0, FEET))",
                new Quantity<>(24.0, LengthUnit.INCHES).divide(new Quantity<>(2.0, LengthUnit.FEET))
        );
        printExample(
                "new Quantity<>(10.0, KILOGRAM).divide(new Quantity<>(5.0, KILOGRAM))",
                new Quantity<>(10.0, WeightUnit.KILOGRAM).divide(new Quantity<>(5.0, WeightUnit.KILOGRAM))
        );
        printExample(
                "new Quantity<>(5.0, LITRE).divide(new Quantity<>(10.0, LITRE))",
                new Quantity<>(5.0, VolumeUnit.LITRE).divide(new Quantity<>(10.0, VolumeUnit.LITRE))
        );
    }

    private static void printExample(String input, Object output) {
        System.out.println("Input: " + input + " -> Output: " + output);
    }
}
