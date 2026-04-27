public class QuantityMeasurementApp {
    private static final double EPSILON = 1e-6;

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
        validateValue(value);
        validateUnit(sourceUnit, "Source unit cannot be null.");
        validateUnit(targetUnit, "Target unit cannot be null.");

        double valueInFeet = sourceUnit.convertToBaseUnit(value);
        return targetUnit.convertFromBaseUnit(valueInFeet);
    }

    public static double demonstrateLengthConversion(double value, LengthUnit sourceUnit, LengthUnit targetUnit) {
        return convert(value, sourceUnit, targetUnit);
    }

    public static double demonstrateLengthConversion(QuantityLength quantityLength, LengthUnit targetUnit) {
        validateUnit(targetUnit, "Target unit cannot be null.");
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

    public static QuantityLength add(QuantityLength firstLength, QuantityLength secondLength) {
        if (firstLength == null || secondLength == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        return add(firstLength, secondLength, firstLength.getUnit());
    }

    public static QuantityLength add(
            QuantityLength firstLength,
            QuantityLength secondLength,
            LengthUnit targetUnit
    ) {
        validateLengths(firstLength, secondLength);
        validateUnit(targetUnit, "Target unit cannot be null.");
        return addInTargetUnit(firstLength, secondLength, targetUnit);
    }

    public static QuantityLength add(
            double firstValue,
            LengthUnit firstUnit,
            double secondValue,
            LengthUnit secondUnit,
            LengthUnit targetUnit
    ) {
        return add(
                new QuantityLength(firstValue, firstUnit),
                new QuantityLength(secondValue, secondUnit),
                targetUnit
        );
    }

    public static QuantityWeight add(QuantityWeight firstWeight, QuantityWeight secondWeight) {
        validateWeights(firstWeight, secondWeight);
        return add(firstWeight, secondWeight, firstWeight.getUnit());
    }

    public static QuantityWeight add(
            QuantityWeight firstWeight,
            QuantityWeight secondWeight,
            WeightUnit targetUnit
    ) {
        validateWeights(firstWeight, secondWeight);
        validateUnit(targetUnit, "Target unit cannot be null.");
        return addWeightInTargetUnit(firstWeight, secondWeight, targetUnit);
    }

    public static QuantityWeight add(
            double firstValue,
            WeightUnit firstUnit,
            double secondValue,
            WeightUnit secondUnit,
            WeightUnit targetUnit
    ) {
        return add(
                new QuantityWeight(firstValue, firstUnit),
                new QuantityWeight(secondValue, secondUnit),
                targetUnit
        );
    }

    public static double convert(double value, WeightUnit sourceUnit, WeightUnit targetUnit) {
        validateValue(value);
        validateUnit(sourceUnit, "Source unit cannot be null.");
        validateUnit(targetUnit, "Target unit cannot be null.");

        double valueInKilograms = sourceUnit.convertToBaseUnit(value);
        return targetUnit.convertFromBaseUnit(valueInKilograms);
    }

    public static final class QuantityLength {
        private final double value;
        private final LengthUnit unit;

        public QuantityLength(double value, LengthUnit unit) {
            validateValue(value);
            if (unit == null) {
                throw new IllegalArgumentException("Unit cannot be null.");
            }

            this.value = value;
            this.unit = unit;
        }

        public double getValue() {
            return value;
        }

        public LengthUnit getUnit() {
            return unit;
        }

        public QuantityLength convertTo(LengthUnit targetUnit) {
            validateUnit(targetUnit, "Target unit cannot be null.");
            double convertedValue = QuantityMeasurementApp.convert(value, unit, targetUnit);
            return new QuantityLength(convertedValue, targetUnit);
        }

        public QuantityLength add(QuantityLength other) {
            return QuantityMeasurementApp.add(this, other, unit);
        }

        public QuantityLength add(QuantityLength other, LengthUnit targetUnit) {
            return QuantityMeasurementApp.add(this, other, targetUnit);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            QuantityLength quantityLength = (QuantityLength) obj;
            return Math.abs(
                    unit.convertToBaseUnit(value) - quantityLength.unit.convertToBaseUnit(quantityLength.value)
            ) <= EPSILON;
        }

        @Override
        public int hashCode() {
            long normalizedValue = Math.round(unit.convertToBaseUnit(value) / EPSILON);
            return Long.hashCode(normalizedValue);
        }

        @Override
        public String toString() {
            return "Quantity(" + value + ", " + unit.name() + ")";
        }

    }

    public static final class QuantityWeight {
        private final double value;
        private final WeightUnit unit;

        public QuantityWeight(double value, WeightUnit unit) {
            validateValue(value);
            if (unit == null) {
                throw new IllegalArgumentException("Unit cannot be null.");
            }

            this.value = value;
            this.unit = unit;
        }

        public double getValue() {
            return value;
        }

        public WeightUnit getUnit() {
            return unit;
        }

        public QuantityWeight convertTo(WeightUnit targetUnit) {
            validateUnit(targetUnit, "Target unit cannot be null.");
            double convertedValue = QuantityMeasurementApp.convert(value, unit, targetUnit);
            return new QuantityWeight(convertedValue, targetUnit);
        }

        public QuantityWeight add(QuantityWeight other) {
            return QuantityMeasurementApp.add(this, other, unit);
        }

        public QuantityWeight add(QuantityWeight other, WeightUnit targetUnit) {
            return QuantityMeasurementApp.add(this, other, targetUnit);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            QuantityWeight quantityWeight = (QuantityWeight) obj;
            return Math.abs(
                    unit.convertToBaseUnit(value) - quantityWeight.unit.convertToBaseUnit(quantityWeight.value)
            ) <= EPSILON;
        }

        @Override
        public int hashCode() {
            long normalizedValue = Math.round(unit.convertToBaseUnit(value) / EPSILON);
            return Long.hashCode(normalizedValue);
        }

        @Override
        public String toString() {
            return "Quantity(" + value + ", " + unit.name() + ")";
        }
    }

    private static QuantityLength addInTargetUnit(
            QuantityLength firstLength,
            QuantityLength secondLength,
            LengthUnit targetUnit
    ) {
        double firstValueInFeet = firstLength.getUnit().convertToBaseUnit(firstLength.getValue());
        double secondValueInFeet = secondLength.getUnit().convertToBaseUnit(secondLength.getValue());
        double sumInFeet = firstValueInFeet + secondValueInFeet;
        double resultValue = targetUnit.convertFromBaseUnit(sumInFeet);
        return new QuantityLength(resultValue, targetUnit);
    }

    private static QuantityWeight addWeightInTargetUnit(
            QuantityWeight firstWeight,
            QuantityWeight secondWeight,
            WeightUnit targetUnit
    ) {
        double firstValueInKilograms = firstWeight.getUnit().convertToBaseUnit(firstWeight.getValue());
        double secondValueInKilograms = secondWeight.getUnit().convertToBaseUnit(secondWeight.getValue());
        double sumInKilograms = firstValueInKilograms + secondValueInKilograms;
        double resultValue = targetUnit.convertFromBaseUnit(sumInKilograms);
        return new QuantityWeight(resultValue, targetUnit);
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

    private static void validateValue(double value) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be a finite number.");
        }
    }

    private static void validateUnit(LengthUnit unit, String message) {
        if (unit == null) {
            throw new IllegalArgumentException(message);
        }
    }

    private static void validateUnit(WeightUnit unit, String message) {
        if (unit == null) {
            throw new IllegalArgumentException(message);
        }
    }
}
