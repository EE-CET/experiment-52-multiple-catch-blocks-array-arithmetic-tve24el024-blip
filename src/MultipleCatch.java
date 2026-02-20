import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read array size
            int N = sc.nextInt();
            int[] arr = new int[N];

            // Read array elements
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Read index and divisor
            int index = sc.nextInt();
            int divisor = sc.nextInt();

            // Perform division
            int result = arr[index] / divisor;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }

        sc.close();
    }
}