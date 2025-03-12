public class all {
   public int add(int x, int y) {
        return x + y;
    }
    public int subtract(int x, int y) {
        return x - y;
    }
    public int multiply(int x, int y) {
        return x * y;
    }
    public double divide(int x, int y) {
        if (y != 0) {
            return (double) x / y;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        all calc = new all();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}
