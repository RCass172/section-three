package main.java.com.zinkworks;

public class Main {
    public static void main(String[] args) {

        // Primitive vars
        int one = -240000000;
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println(myMinInt);
        System.out.println(myMaxInt);

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println(myMinByte);
        System.out.println(myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println(myMinShort);
        System.out.println(myMaxShort);

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println(myMinLong);
        System.out.println(myMaxLong);

        // Casting
        byte num = (byte)(myMinByte / 2);
        System.out.println(num);

        // Float/double
        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println(myMinFloatVal);
        System.out.println(myMaxFloatVal);

        // Double is more precise
        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println(myMinDoubleVal);
        System.out.println(myMaxDoubleVal);

        // Challenge convert pounds to kg
        double pounds = 200d;
        double kiloResult = pounds * 0.45359237;
        System.out.println(pounds + " pounds = " + kiloResult + "kg");
    }
}