package chapter7;

import java.util.Scanner;

public class Exercise7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store the occurrences of numbers from 1 to 100
        int[] occurrences = new int[101]; // Index 0 will be unused

        // Read integers until 0 is entered (end of input)
        int num;
        do {
            System.out.print("Enter an integer (1-100, 0 to stop): ");
            num = input.nextInt();

            // Increment the count for the entered number
            if (num >= 1 && num <= 100) {
                occurrences[num]++;
            }
        } while (num != 0);

        // Display the occurrences for each number in increasing order
        for (int i = 1; i <= 100; i++) {
            int count = occurrences[i];
            if (count > 0) {
                String times = (count == 1) ? "time" : "times";
                System.out.println(i + " occurs " + count + " " + times);
            }
        }
    }
}
