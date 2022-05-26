package main.java.com.zinkworks;

public class Main {
    public static void main(String[] args) {

        // Primitive data types
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

        char myChar = 'D';
        // https://unicode-table.com/en/
        char myUnicodeChar = '\u0044';
        char myUnicodeCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myUnicodeCopyrightChar);

        // Ternary operator
        boolean isCar = true;
        // if condition isCar is true, assign true, else assign false
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double var = 20.00;
        double varTwo  = 80.00;
        double varThree = (var + varTwo) * 100.00;
        double remainder = varThree % 40.00;
        System.out.println(remainder);
        boolean isNoRemainder = remainder == 0;

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remainder");
        }
    }
}