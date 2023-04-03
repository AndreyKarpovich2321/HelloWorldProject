package tms.karpovich.lesson5;

import java.util.Arrays;
import java.util.Random;

public class FifthClasswork {
    public static void main(String[] args) {
        //int[][] arr2 = new int[10][10];
//        for (int i = 0; i < arr2.length; i++){
//            for (int j = 0; j < arr2[i].length; j++){
//                arr2[i][j] = i * j;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr2));

        int [][] arr3 = new int[4][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];
            Arrays.fill(arr3[i], i + 1);
        }

//        System.out.println(Arrays.deepToString(arr3));

        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4[i].length; j++){
                arr4[i][j] = new Random().nextInt(9);
            }
        }
//        System.out.println(Arrays.deepToString(arr4));
        Random random = new Random();
//      result[0][0] = arr1[0][0] * arr2[0][0];
//      result[1][2] = arr1[1][2] * arr2[1][2];
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = random.nextInt(5);
                arr2[i][j] = random.nextInt(5);
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));


    }
}
