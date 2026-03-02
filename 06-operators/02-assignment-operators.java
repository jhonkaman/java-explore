// Assignment Operators

// Run: java 06-operators/02-assignment-operators.java

// This example demonstrates assignment operators (=, +=, -=, *=, /=)

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Initial: " + x);
        x += 5;
        System.out.println("After += 5: " + x);
        x -= 3;
        System.out.println("After -= 3: " + x);
        x *= 2;
        System.out.println("After *= 2: " + x);
        x /= 4;
        System.out.println("After /= 4: " + x);
    }
}
