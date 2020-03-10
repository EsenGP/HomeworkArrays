import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        // Create and give value for array
        System.out.println("Input length of array:");
        int[] bigNumber = new int[sc.nextInt()];

        for (int i = 0; i < bigNumber.length; i++) {
            bigNumber[i] = rand.nextInt(11);
        }

        // Find almost wanted value
        int helper;
        int alWaVa = 0;
        int alWaVaNumb = 0;


        for (int i = 0; i < bigNumber.length; i++){
            helper = 0;
            for (int l = 0; l <bigNumber.length ; l ++) {
                if (bigNumber[i] == bigNumber[l]) helper++;


            }
            if (helper > alWaVa) {
                alWaVa = helper;
                alWaVaNumb = i;
            }

        }

                 // Output
        System.out.println("Число " + bigNumber[alWaVaNumb] + " повторилось " + alWaVa + " раз");
        System.out.println(Arrays.toString(bigNumber));

    }
}
