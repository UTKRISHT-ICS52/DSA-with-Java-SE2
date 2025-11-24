public class OperatorDemo {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Unary Operators
        int x = 5;
        System.out.println("\nUnary:");
        System.out.println("x++ = " + (x++));  // Post-increment
        System.out.println("++x = " + (++x));  // Pre-increment
        System.out.println("x-- = " + (x--));  // Post-decrement
        System.out.println("--x = " + (--x));  // Pre-decrement

        // Assignment Operators
        int y = 10;
        System.out.println("\nAssignment:");
        y += 5;   // y = y + 5
        System.out.println("y += 5 → " + y);
        y *= 2;   // y = y * 2
        System.out.println("y *= 2 → " + y);

        // Relational Operators
        System.out.println("\nRelational:");
        System.out.println("a > b → " + (a > b));
        System.out.println("a == b → " + (a == b));

        // Logical Operators
        boolean c1 = true, c2 = false;
        System.out.println("\nLogical:");
        System.out.println("c1 && c2 → " + (c1 && c2));
        System.out.println("c1 || c2 → " + (c1 || c2));
        System.out.println("!c1 → " + (!c1));

        // Bitwise Operators
        int m = 5, n = 2;
        System.out.println("\nBitwise:");
        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("m << 1 = " + (m << 1));
        System.out.println("m >> 1 = " + (m >> 1));

        // Ternary Operator
        int min = (a < b) ? a : b;
        System.out.println("\nTernary:");
        System.out.println("Smaller value = " + min);

        // instanceof Operator
        String s = "Hello";
        System.out.println("\ninstanceof:");
        System.out.println("s instanceof String → " + (s instanceof String));

        // Type Cast Operator
        double d = 9.78;
        int z = (int) d; // explicit type casting
        System.out.println("\nType Casting:");
        System.out.println("Double to int: " + z);
    }
}

