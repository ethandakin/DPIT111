package Miscellaneous;

import java.util.ArrayList;
import java.util.Random;

public class Experiment2 {
    public static void main(String[] args) {
        int[] weightsBase = new int[9];

        weightsBase[0] = 56250;
        weightsBase[1] = 25000;
        weightsBase[2] = 15000;
        weightsBase[3] = 2500;
        weightsBase[4] = 1248;
        weightsBase[5] = 2;
        weightsBase[6] = 0;

        int luck = 1;

        int[] weights = getWeightsWithLuck(luck, weightsBase);

        String[] rarities = new String[7];
        rarities[0] = "Common";
        rarities[1] = "Rare";
        rarities[2] = "Epic";
        rarities[3] = "Legendary";
        rarities[4] = "Mythic";
        rarities[5] = "Unique";
        rarities[6] = "Unobtainable";
    }

    public static int[] getWeightsWithLuck(int luck, int[] rarities) {
        int[] weights = new int[rarities.length];

        for (int i = 0; i < rarities.length; i++) {
            if (i == 0 || i == 1) {
                weights[i] = rarities[i] / luck;
            } else {
                weights[i] = rarities[i] * luck;
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
