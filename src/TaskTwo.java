import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

            // Input length value's and create matrix
        System.out.println("Введите количество строк: ");
        int len1 = sc.nextInt();
        System.out.println("Введите количество столбцов: ");
        int len2 = sc.nextInt();
        int[][] matrix = new int[len1][len2];

            // Give random value's for matrix cell's
        for (int i = 0;i < len1;i++) {
            for (int l = 0; l < len2; l++){
                matrix[i][l] = rand.nextInt(1001);
            }
        }

            // Output matrix
        for (int i = 0; i < len1 ;i++){
            for (int l = 0;l < len2;l++){
                System.out.print(matrix[i][l] + "\t");
            }
            System.out.println();
        }

            // Find result
        int helper1 = 0, helper2 = 0, result1 = 0 , result2 = 0, hRes1 = -1, hRes2 = -1;
        for (int i = 0; i < len1 ;i++){
            helper1 = 0;
            for (int l = 0; l <len2;l++){
                helper1 += matrix[i][l];
            }
            if (helper1 > result1) {result1 = helper1;
            hRes1 = i+1;}
        }
        for (int l = 0; l < len2 ;l++){
            helper2 = 0;
            for (int i = 0; i < len1 ;i++){
                helper2 += matrix[i][l];
            }
            if (helper2 > result2) {result2 = helper2;
            hRes2 = l+1;}
        }

        System.out.println("Максимальная сумма находится в " + hRes1 + " ряду и равна " + result1);
        System.out.println("Максимальная сумма находится в " + hRes2 + " столбце и равна " + result2);

    }
}
