package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Experiment {
    public static void main(String[] args) {
        int[] weightsBase = new int[7];

        weightsBase[0] = 56250;
        weightsBase[1] = 25000;
        weightsBase[2] = 15000;
        weightsBase[3] = 2500;
        weightsBase[4] = 1248;
        weightsBase[5] = 2;
        weightsBase[6] = 0;

        int luck = 50;
        int percentage = 15;

        int[] weights = getWeightsWithLuck(luck, percentage, weightsBase);

        for (int i : weights) {
            System.out.println(i);
        }

        String[] rarities = new String[7];
        rarities[0] = "Common";
        rarities[1] = "Rare";
        rarities[2] = "Epic";
        rarities[3] = "Legendary";
        rarities[4] = "Mythic";
        rarities[5] = "Unique";
        rarities[6] = "Unobtainable";

        for (int x = 0; x < rarities.length; x++) {
            if (x == rarities.length - 1) {
                break;
            }

            System.out.println();
            System.out.println(rarities[x]);

            ArrayList<Integer> values = new ArrayList<Integer>();
            int lowest = 1000000000;
            int highest = 0;

            for (int i = 0; i < 50000; i++) {
                String last = "";
                int counter = 0;

                do {
                    last = rarities[getRandom(weights)];
                    counter += 1;
                    //System.out.println(last);
                } while (!last.equals(rarities[x]));

                if (counter <= lowest) {
                    lowest = counter;
                }

                if (counter >= highest) {
                    highest = counter;
                }

                values.add(counter);
            }

            double average = 0;

            for (int i : values) {
                average += i;
            }

            average /= values.size();


            System.out.println("Average: " + average);
            System.out.printf("Percentage: %.2f%%\n", (100 / average));
            System.out.println("Lowest: " + lowest);
            System.out.println("Highest: " + highest);
        }

    }

    public static int[] getWeightsWithLuck(int luck, int percentage, int[] rarities) {
        int[] weights = new int[rarities.length];
        int total = 0;

        for (int i : rarities) {
            total += i;
        }

        for (int i = 0; i < rarities.length; i++) {
            if ((double) rarities[i] / total * 100 <= percentage) {
                // Get inverse % of Weight
                // For example, Unique is 0.001% of 100,
                // Therefore, the luck gain is inverse to that
                // So increase luck by a large amount for that %..

                System.out.println((double) rarities[i] / total * 100);
                weights[i] = rarities[i] * (int) ( (double) luck / (double) rarities[i] / total * 100) ;
            } else {
                weights[i] = rarities[i];
            }
        }

        return weights;
    }

    public static int getRandom(int[] weights) {
        int sum = 0;

        for (int weight : weights) {
            sum += weight;
        }

        Random r = new Random();
        int choice = r.nextInt(0, sum);

        int counter = 0;

        for (int i = 0; i < weights.length; i++) {
            counter += weights[i];

            if (choice <= counter) {
                return i;
            }
        }

        return 0;
    }
}
