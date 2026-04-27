public class Main {
    public static void main(String[] args) {
        System.out.println("Input: Quantity(1.0, KILOGRAM).equals(Quantity(1000.0, GRAM))");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                .equals(new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM)));
        System.out.println("Input: Quantity(1.0, KILOGRAM).convertTo(GRAM)");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                .convertTo(WeightUnit.GRAM));
        System.out.println("Input: Quantity(2.0, POUND).convertTo(KILOGRAM)");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityWeight(2.0, WeightUnit.POUND)
                .convertTo(WeightUnit.KILOGRAM));
        System.out.println("Input: Quantity(1.0, KILOGRAM).add(Quantity(1000.0, GRAM))");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                .add(new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM)));
        System.out.println("Input: Quantity(1.0, KILOGRAM).add(Quantity(1000.0, GRAM), GRAM)");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                .add(new QuantityMeasurementApp.QuantityWeight(1000.0, WeightUnit.GRAM), WeightUnit.GRAM));
        System.out.println("Input: Quantity(1.0, KILOGRAM).equals(Quantity(1.0, FEET))");
        System.out.println("Output: " + new QuantityMeasurementApp.QuantityWeight(1.0, WeightUnit.KILOGRAM)
                .equals(new QuantityMeasurementApp.QuantityLength(1.0, LengthUnit.FEET)));
    }
}
