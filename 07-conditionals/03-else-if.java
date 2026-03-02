// Else If Statement

// Run: java 07-conditionals/03-else-if.java

// This example demonstrates else if for multiple conditions

public class ElseIf {
    public static void main(String[] args) {
        int grade = 85;
        if (grade >= 90) {
            System.out.println("A grade");
        } else if (grade >= 80) {
            System.out.println("B grade");
        } else if (grade >= 70) {
            System.out.println("C grade");
        } else {
            System.out.println("F grade");
        }
    }
}
