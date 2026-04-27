public class QuantityMeasurementApp {

    private static final double INCHES_PER_FOOT = 12.0;

    public static boolean areFeetEqual(double firstValue, double secondValue) {
        return new Feet(firstValue).equals(new Feet(secondValue));
    }

    public static boolean areInchesEqual(double firstValue, double secondValue) {
        return new Inches(firstValue).equals(new Inches(secondValue));
    }

    public static boolean areFeetAndInchesEqual(double feetValue, double inchesValue) {
        double convertedFeetValue = feetValue * INCHES_PER_FOOT;
        return Double.compare(convertedFeetValue, inchesValue) == 0;
    }

    public static final class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Feet feet = (Feet) obj;
            return Double.compare(value, feet.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    public static final class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Inches inches = (Inches) obj;
            return Double.compare(value, inches.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }
}
