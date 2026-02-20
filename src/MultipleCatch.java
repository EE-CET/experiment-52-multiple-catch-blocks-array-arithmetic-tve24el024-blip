import java.util.Scanner;

public class MultipleCatch {   // ← class name same as file name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int index = sc.nextInt();
            int divisor = sc.nextInt();

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