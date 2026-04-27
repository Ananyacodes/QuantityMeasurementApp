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

        double valueInFeet = sourceUnit.toFeet(value);
        return targetUnit.fromFeet(valueInFeet);
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
        if (firstLength == null || secondLength == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        validateUnit(targetUnit, "Target unit cannot be null.");

        double firstValueInFeet = firstLength.getUnit().toFeet(firstLength.getValue());
        double secondValueInFeet = secondLength.getUnit().toFeet(secondLength.getValue());
        double sumInFeet = firstValueInFeet + secondValueInFeet;
        double resultValue = targetUnit.fromFeet(sumInFeet);
        return new QuantityLength(resultValue, targetUnit);
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

    public enum LengthUnit {
        FEET(1.0),
        INCHES(1.0 / 12.0),
        YARDS(3.0),
        CENTIMETERS((1.0 / 2.54) / 12.0);

        private final double conversionFactorToFeet;

        LengthUnit(double conversionFactorToFeet) {
            this.conversionFactorToFeet = conversionFactorToFeet;
        }

        public double toFeet(double value) {
            return value * conversionFactorToFeet;
        }

        public double fromFeet(double valueInFeet) {
            return valueInFeet / conversionFactorToFeet;
        }
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
            return Math.abs(unit.toFeet(value) - quantityLength.unit.toFeet(quantityLength.value)) <= EPSILON;
        }

        @Override
        public int hashCode() {
            long normalizedValue = Math.round(unit.toFeet(value) / EPSILON);
            return Long.hashCode(normalizedValue);
        }

        @Override
        public String toString() {
            return "Quantity(" + value + ", " + unit.name() + ")";
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
}
