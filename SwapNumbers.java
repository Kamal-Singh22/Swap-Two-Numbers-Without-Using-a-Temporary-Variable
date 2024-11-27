public class SwapNumbers {

    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a temporary variable
        a = a + b; // a becomes 15
        b = a - b; // b becomes 5 (original value of a)
        a = a - b; // a becomes 10 (original value of b)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
