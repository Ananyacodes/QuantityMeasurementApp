public class Main {
    public static void main(String[] args) {
        Quantity<LengthUnit> lengthOne = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> lengthTwo = new Quantity<>(12.0, LengthUnit.INCHES);
        Quantity<WeightUnit> weightOne = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> weightTwo = new Quantity<>(1000.0, WeightUnit.GRAM);

        System.out.println("Input: new Quantity<>(1.0, LengthUnit.FEET).equals(new Quantity<>(12.0, LengthUnit.INCHES))");
        System.out.println("Output: " + lengthOne.equals(lengthTwo));
        System.out.println("Input: new Quantity<>(1.0, LengthUnit.FEET).convertTo(LengthUnit.INCHES)");
        System.out.println("Output: " + lengthOne.convertTo(LengthUnit.INCHES));
        System.out.println("Input: new Quantity<>(1.0, LengthUnit.FEET).add(new Quantity<>(12.0, LengthUnit.INCHES), LengthUnit.FEET)");
        System.out.println("Output: " + lengthOne.add(lengthTwo, LengthUnit.FEET));

        System.out.println("Input: new Quantity<>(1.0, WeightUnit.KILOGRAM).equals(new Quantity<>(1000.0, WeightUnit.GRAM))");
        System.out.println("Output: " + weightOne.equals(weightTwo));
        System.out.println("Input: new Quantity<>(1.0, WeightUnit.KILOGRAM).convertTo(WeightUnit.GRAM)");
        System.out.println("Output: " + weightOne.convertTo(WeightUnit.GRAM));
        System.out.println("Input: new Quantity<>(1.0, WeightUnit.KILOGRAM).add(new Quantity<>(1000.0, WeightUnit.GRAM), WeightUnit.KILOGRAM)");
        System.out.println("Output: " + weightOne.add(weightTwo, WeightUnit.KILOGRAM));

        System.out.println("Input: new Quantity<>(1.0, LengthUnit.FEET).equals(new Quantity<>(1.0, WeightUnit.KILOGRAM))");
        System.out.println("Output: " + lengthOne.equals(new Quantity<>(1.0, WeightUnit.KILOGRAM)));
    }
}
