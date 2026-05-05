public class Quantity<U extends IMeasurable> {
    private static final double EPSILON = 1e-6;
    private static final double ROUNDING_SCALE = 100.0;

    private final double value;
    private final U unit;

    /**
     * Creates an immutable quantity in the supplied unit.
     *
     * @param value measurement value
     * @param unit measurement unit
     */
    public Quantity(double value, U unit) {
        validateValue(value);
        validateUnit(unit);
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }

    /**
     * Converts this quantity into the requested target unit.
     *
     * @param targetUnit unit to express the quantity in
     * @return converted immutable quantity
     */
    public Quantity<U> convertTo(U targetUnit) {
        validateCompatibleTargetUnit(targetUnit);
        double convertedValue = targetUnit.convertFromBaseUnit(unit.convertToBaseUnit(value));
        return new Quantity<>(convertedValue, targetUnit);
    }

    /**
     * Adds another quantity of the same category and returns the sum in this quantity's unit.
     *
     * @param other quantity to add
     * @return summed quantity in this quantity's unit
     */
    public Quantity<U> add(Quantity<U> other) {
        return add(other, unit);
    }

    /**
     * Adds another quantity of the same category and returns the sum in the requested target unit.
     *
     * @param other quantity to add
     * @param targetUnit unit to express the result in
     * @return summed quantity in the requested target unit
     */
    public Quantity<U> add(Quantity<U> other, U targetUnit) {
        return performBinaryOperation(other, targetUnit, ArithmeticOperation.ADDITION, false);
    }

    /**
     * Subtracts another quantity of the same category and returns the difference in this quantity's unit.
     *
     * @param other quantity to subtract
     * @return difference in this quantity's unit
     */
    public Quantity<U> subtract(Quantity<U> other) {
        return subtract(other, unit);
    }

    /**
     * Subtracts another quantity of the same category and returns the difference in the requested target unit.
     *
     * @param other quantity to subtract
     * @param targetUnit unit to express the result in
     * @return difference in the requested target unit
     */
    public Quantity<U> subtract(Quantity<U> other, U targetUnit) {
        return performBinaryOperation(other, targetUnit, ArithmeticOperation.SUBTRACTION, true);
    }

    /**
     * Divides this quantity by another quantity of the same category and returns a dimensionless ratio.
     *
     * @param other divisor quantity
     * @return dimensionless ratio
     */
    public double divide(Quantity<U> other) {
        validateOperand(other);
        double divisor = other.unit.convertToBaseUnit(other.value);
        if (Math.abs(divisor) <= EPSILON) {
            throw new ArithmeticException("Cannot divide by zero quantity.");
        }
        return unit.convertToBaseUnit(value) / divisor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quantity<?> other)) {
            return false;
        }
        if (unit.getClass() != other.unit.getClass()) {
            return false;
        }

        double thisBaseValue = unit.convertToBaseUnit(value);
        double otherBaseValue = other.unit.convertToBaseUnit(other.value);
        return Math.abs(thisBaseValue - otherBaseValue) <= EPSILON;
    }

    @Override
    public int hashCode() {
        long normalizedValue = Math.round(unit.convertToBaseUnit(value) / EPSILON);
        int result = unit.getClass().hashCode();
        result = 31 * result + Long.hashCode(normalizedValue);
        return result;
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit.getUnitName() + ")";
    }

    private static void validateValue(double value) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be a finite number.");
        }
    }

    private static void validateUnit(IMeasurable unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null.");
        }
    }

    private static void validateQuantity(Quantity<?> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Quantities cannot be null.");
        }
        validateUnit(quantity.unit);
        validateValue(quantity.value);
    }

    private void validateSameCategory(Quantity<?> other) {
        if (unit.getClass() != other.unit.getClass()) {
            throw new IllegalArgumentException("Quantities must belong to the same measurement category.");
        }
    }

    private void validateCompatibleTargetUnit(U targetUnit) {
        validateUnit(targetUnit);
        if (unit.getClass() != targetUnit.getClass()) {
            throw new IllegalArgumentException("Target unit must belong to the same measurement category.");
        }
    }

    private void validateOperand(Quantity<U> other) {
        validateQuantity(other);
        validateSameCategory(other);
    }

    private Quantity<U> performBinaryOperation(
            Quantity<U> other,
            U targetUnit,
            ArithmeticOperation operation,
            boolean shouldRound
    ) {
        validateOperand(other);
        validateCompatibleTargetUnit(targetUnit);
        double thisBaseValue = unit.convertToBaseUnit(value);
        double otherBaseValue = other.unit.convertToBaseUnit(other.value);
        double baseResult = operation.apply(thisBaseValue, otherBaseValue);
        double convertedValue = targetUnit.convertFromBaseUnit(baseResult);
        double normalizedValue = shouldRound ? roundToTwoDecimals(convertedValue) : convertedValue;
        return new Quantity<>(normalizedValue, targetUnit);
    }

    private static double roundToTwoDecimals(double value) {
        return Math.round(value * ROUNDING_SCALE) / ROUNDING_SCALE;
    }

    private enum ArithmeticOperation {
        ADDITION {
            @Override
            double apply(double firstValue, double secondValue) {
                return firstValue + secondValue;
            }
        },
        SUBTRACTION {
            @Override
            double apply(double firstValue, double secondValue) {
                return firstValue - secondValue;
            }
        };

        abstract double apply(double firstValue, double secondValue);
    }
}
