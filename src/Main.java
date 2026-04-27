public class Main {
    public static void main(String[] args) {
        Quantity<VolumeUnit> volumeOne = new Quantity<>(1.0, VolumeUnit.LITRE);
        Quantity<VolumeUnit> volumeTwo = new Quantity<>(1000.0, VolumeUnit.MILLILITRE);
        Quantity<VolumeUnit> volumeThree = new Quantity<>(1.0, VolumeUnit.GALLON);

        System.out.println("Input: new Quantity<>(1.0, LITRE).equals(new Quantity<>(1000.0, MILLILITRE))");
        System.out.println("Output: " + volumeOne.equals(volumeTwo));
        System.out.println("Input: new Quantity<>(1.0, LITRE).convertTo(MILLILITRE)");
        System.out.println("Output: " + volumeOne.convertTo(VolumeUnit.MILLILITRE));
        System.out.println("Input: new Quantity<>(2.0, GALLON).convertTo(LITRE)");
        System.out.println("Output: " + new Quantity<>(2.0, VolumeUnit.GALLON).convertTo(VolumeUnit.LITRE));
        System.out.println("Input: new Quantity<>(1.0, LITRE).add(new Quantity<>(1000.0, MILLILITRE))");
        System.out.println("Output: " + volumeOne.add(volumeTwo));
        System.out.println("Input: new Quantity<>(1.0, GALLON).add(new Quantity<>(3.78541, LITRE), GALLON)");
        System.out.println("Output: " + volumeThree.add(new Quantity<>(3.78541, VolumeUnit.LITRE), VolumeUnit.GALLON));
        System.out.println("Input: new Quantity<>(1.0, LITRE).equals(new Quantity<>(1.0, FOOT))");
        System.out.println("Output: " + volumeOne.equals(new Quantity<>(1.0, LengthUnit.FEET)));
        System.out.println("Input: new Quantity<>(1.0, LITRE).equals(new Quantity<>(1.0, KILOGRAM))");
        System.out.println("Output: " + volumeOne.equals(new Quantity<>(1.0, WeightUnit.KILOGRAM)));
    }
}
