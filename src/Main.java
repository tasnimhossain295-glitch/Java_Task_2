import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            int num = scanner.nextInt();

            // 0 আসলে লুপ থেমে যাবে
            if (num == 0) {
                break;
            }

            // জোড় নাকি বিজোড় তা চেক করা
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        scanner.close();
    }
}