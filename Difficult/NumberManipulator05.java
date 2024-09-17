import java.util.Scanner;

// Base class
class Number {
    double value;

    // Constructor
    public Number(double value) {
        this.value = value;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Value: " + value;
    }

    // Method to perform some basic manipulation
    public double manipulate() {
        return value; // Base manipulation, just return the value
    }
}

// Derived class 1
class IntegerNumber extends Number {
    // Constructor
    public IntegerNumber(int value) {
        super(value); // Call the base class constructor
    }

    // Overloaded constructor for flexibility
    public IntegerNumber(double value) {
        super((int) value); // Convert and call the base class constructor
    }

    // Overridden method for integer-specific manipulation
    @Override
    public double manipulate() {
        return value * 2; // Double the value for integers
    }
}

// Derived class 2
class DecimalNumber extends Number {
    // Constructor
    public DecimalNumber(double value) {
        super(value); // Call the base class constructor
    }

    // Overloaded constructor for flexibility
    public DecimalNumber(int value) {
        super(value); // Convert and call the base class constructor
    }

    // Overridden method for decimal-specific manipulation
    @Override
    public double manipulate() {
        return value / 2; // Halve the value for decimals
    }
}

public class NumberManipulator05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        IntegerNumber intNumber = new IntegerNumber(intValue);

        System.out.print("Enter a decimal number: ");
        double doubleValue = scanner.nextDouble();
        DecimalNumber decNumber = new DecimalNumber(doubleValue);

        System.out.println("\nManipulated Integer: " + intNumber.manipulate());
        System.out.println("Manipulated Decimal: " + decNumber.manipulate());

        scanner.close();
    }
}

