public class Quantity<U extends IMeasurable> {
    private static final double EPSILON = 1e-6;

    private final double value;
    private final U unit;

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

    public Quantity<U> convertTo(U targetUnit) {
        validateUnit(targetUnit);
        double convertedValue = targetUnit.convertFromBaseUnit(unit.convertToBaseUnit(value));
        return new Quantity<>(convertedValue, targetUnit);
    }

    public Quantity<U> add(Quantity<U> other) {
        return add(other, unit);
    }

    public Quantity<U> add(Quantity<U> other, U targetUnit) {
        validateQuantity(other);
        validateUnit(targetUnit);
        double baseSum = unit.convertToBaseUnit(value) + other.unit.convertToBaseUnit(other.value);
        return new Quantity<>(targetUnit.convertFromBaseUnit(baseSum), targetUnit);
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
    }
}
