package Chapter5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveEntries = 0;
        int negativeEntries = 0;
        int sum = 0;
        int count = 0;

        while(true) {
            int tempNum;
            tempNum = scanner.nextInt();

            if (tempNum == 0) {
                break;
            }

            if (tempNum < 0) {
                ++negativeEntries;
            }
            else {
                ++positiveEntries;
            }

            ++count;
            sum += tempNum;

        }

        System.out.println("Positives: " + positiveEntries);
        System.out.println("Negatives: " + negativeEntries);
        System.out.println("Total: " + sum);
        System.out.println("Average: " + sum / count);
    }
}
