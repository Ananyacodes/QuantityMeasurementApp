public class Main {
    public static void main(String[] args) {
        System.out.println("Input: new Quantity<>(10.0, FEET).subtract(new Quantity<>(6.0, INCHES))");
        System.out.println("Output: " + new Quantity<>(10.0, LengthUnit.FEET)
                .subtract(new Quantity<>(6.0, LengthUnit.INCHES)));

        System.out.println("Input: new Quantity<>(10.0, FEET).subtract(new Quantity<>(6.0, INCHES), INCHES)");
        System.out.println("Output: " + new Quantity<>(10.0, LengthUnit.FEET)
                .subtract(new Quantity<>(6.0, LengthUnit.INCHES), LengthUnit.INCHES));

        System.out.println("Input: new Quantity<>(10.0, KILOGRAM).subtract(new Quantity<>(5000.0, GRAM))");
        System.out.println("Output: " + new Quantity<>(10.0, WeightUnit.KILOGRAM)
                .subtract(new Quantity<>(5000.0, WeightUnit.GRAM)));

        System.out.println("Input: new Quantity<>(5.0, LITRE).subtract(new Quantity<>(500.0, MILLILITRE))");
        System.out.println("Output: " + new Quantity<>(5.0, VolumeUnit.LITRE)
                .subtract(new Quantity<>(500.0, VolumeUnit.MILLILITRE)));

        System.out.println("Input: new Quantity<>(10.0, FEET).divide(new Quantity<>(2.0, FEET))");
        System.out.println("Output: " + new Quantity<>(10.0, LengthUnit.FEET)
                .divide(new Quantity<>(2.0, LengthUnit.FEET)));

        System.out.println("Input: new Quantity<>(24.0, INCHES).divide(new Quantity<>(2.0, FEET))");
        System.out.println("Output: " + new Quantity<>(24.0, LengthUnit.INCHES)
                .divide(new Quantity<>(2.0, LengthUnit.FEET)));

        System.out.println("Input: new Quantity<>(10.0, KILOGRAM).divide(new Quantity<>(5.0, KILOGRAM))");
        System.out.println("Output: " + new Quantity<>(10.0, WeightUnit.KILOGRAM)
                .divide(new Quantity<>(5.0, WeightUnit.KILOGRAM)));

        System.out.println("Input: new Quantity<>(5.0, LITRE).divide(new Quantity<>(10.0, LITRE))");
        System.out.println("Output: " + new Quantity<>(5.0, VolumeUnit.LITRE)
                .divide(new Quantity<>(10.0, VolumeUnit.LITRE)));
    }
}
