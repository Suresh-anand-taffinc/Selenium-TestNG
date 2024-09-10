// 
public class Calculator {
    // Addition method with a potential bug (no overflow check)
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction method with duplicated code
    public int subtract(int a, int b) {
        return a - b;
    }

    // Another addition method (code duplication)
    public int addAgain(int a, int b) {
        return a + b;
    }

    // Method with potential code smell (bad variable naming)
    public int multiply(int x, int y) {
        return x * y;
    }

    // Division method with a potential bug (division by zero)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
