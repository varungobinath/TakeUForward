package org.example;
import java.util.Arrays;

public class practice {

    public static void main(String[] args) {
        // Step 1: Calculate the sum distribution for two standard dice.
        // This is our "goal" distribution that we'll try to match.
        int[] standardDistribution = getSumDistribution(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});

        System.out.println("Starting the search for Sicherman Dice with your specific rules...");

        // Step 2: Start the process of generating Die A. We begin building it with no faces yet (index 0).
        int[] dieA = new int[6];
        generateDieA(dieA, 0, 1, standardDistribution);
    }

    /**
     * This function recursively builds Die A, one face at a time.
     */
    private static void generateDieA(int[] dieA, int index, int startValue, int[] standardDistribution) {
        // This is the "stop" condition. It means Die A is completely filled.
        if (index == dieA.length) {
            int[] dieB = new int[6];
            // Now that Die A is ready, we start building Die B.
            generateDieB(dieA, dieB, 0, 1, standardDistribution);
            return;
        }

        // This loop tries every possible number for the current face of Die A.
        // The condition "i <= 4" enforces your rule that Die A faces can't be > 4.
        for (int i = startValue; i <= 4; i++) {
            dieA[index] = i; // Place the number on the face.
            // Call the function again to fill the next face. This is the recursion.
            generateDieA(dieA, index + 1, i, standardDistribution);
        }
    }

    /**
     * This function recursively builds Die B.
     */
    private static void generateDieB(int[] dieA, int[] dieB, int index, int startValue, int[] standardDistribution) {
        // This "stop" condition means both dice are now complete!
        if (index == dieB.length) {
            // Step 3: Check the dice.
            int[] currentDistribution = getSumDistribution(dieA, dieB);

            // This line checks if the new pair of dice has the same sum distribution as standard dice.
            if (Arrays.equals(standardDistribution, currentDistribution)) {
                System.out.println("Solution Found! ✅");
                System.out.println("Die A: " + Arrays.toString(dieA));
                System.out.println("Die B: " + Arrays.toString(dieB));
            }
            return;
        }

        // This loop tries every possible number for the current face of Die B.
        // We use a high number like 12 to ensure we don't miss a solution.
        for (int i = startValue; i <= 12; i++) {
            dieB[index] = i;
            // Call the function again to fill the next face.
            generateDieB(dieA, dieB, index + 1, i, standardDistribution);
        }
    }

    /**
     * This function calculates the frequency of each possible sum for a given pair of dice.
     */
    public static int[] getSumDistribution(int[] die1, int[] die2) {
        int[] distribution = new int[11]; // An array to count sums from 2 to 12.

        // This nested loop goes through every possible combination of faces from Die 1 and Die 2.
        for (int face1 : die1) {
            for (int face2 : die2) {
                int sum = face1 + face2;
                // Add one to the count for that specific sum. We subtract 2 because sums start at 2, but array indexes start at 0.
                if (sum >= 2 && sum <= 12) {
                    distribution[sum - 2]++;
                }
            }
        }
        return distribution;
    }
}