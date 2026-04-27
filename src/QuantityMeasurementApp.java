public class QuantityMeasurementApp {

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

    public enum LengthUnit {
        FEET(1.0),
        INCHES(1.0 / 12.0),
        YARDS(3.0),
        CENTIMETERS(0.393701 / 12.0);

        private final double conversionFactorToFeet;

        LengthUnit(double conversionFactorToFeet) {
            this.conversionFactorToFeet = conversionFactorToFeet;
        }

        public double toFeet(double value) {
            return value * conversionFactorToFeet;
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

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            QuantityLength quantityLength = (QuantityLength) obj;
            return Double.compare(unit.toFeet(value), quantityLength.unit.toFeet(quantityLength.value)) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(unit.toFeet(value));
        }

        @Override
        public String toString() {
            return "Quantity(" + value + ", " + unit.name() + ")";
        }

        private static void validateValue(double value) {
            if (Double.isNaN(value) || Double.isInfinite(value)) {
                throw new IllegalArgumentException("Value must be a finite number.");
            }
        }
    }
}
