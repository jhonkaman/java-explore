// Return Values

// Run: java 09-methods/03-return-values.java

// This example demonstrates methods that return values

public class ReturnValues {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
