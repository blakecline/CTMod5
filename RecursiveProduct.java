import java.util.Scanner;

public class RecursiveProduct {

    public static int product(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        return numbers[index] * product(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Please enter 5 numbers to multiply:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Entry " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int result = product(numbers, 0);

        System.out.println("The product is: " + result);
        scanner.close();
    }
}
