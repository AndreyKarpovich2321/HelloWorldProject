package tms.karpovich.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FifthHomework {
    public static void main(String[] args) {
        increaseByFive();
        chessBoard();
        twoMatrix();
        sumOfAllElements();
        arrayDiagonal();
        sortArray();


    }

    private static void sortArray() {
        Random random = new Random();
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                    arr[i][j] = random.nextInt(5);
            }
        }
//        System.out.println("Unsorted array");
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < arr.length; i++){
            int steps = arr[i].length - 1;
            boolean swapped;
            do {
                swapped = false;
            for (int j = 0; j < steps; j++) {
                if (arr[i][j] > arr[i][j + 1]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = temp;
                    swapped = true;
                }
            }
                steps--;
            } while (swapped);
        }
//        System.out.println("Sorted array");
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    private static void arrayDiagonal() {
        Random random = new Random();
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if((i+j)%2==0){
                    arr[i][j] = random.nextInt(5);
                } else {
                    arr[i][j] = random.nextInt(5);
                }
            }
        }
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
            System.out.print(arr[i][j] + " ");
        }
    }

    private static void sumOfAllElements() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = random.nextInt(5);
                    sum += arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum);
    }

    private static void twoMatrix() {
        Random random = new Random();
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] y = new int[3][3];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = random.nextInt(5);
                arr2[i][j] = random.nextInt(5);
                y[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(y));
    }

    private static void chessBoard() {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if((i+j)%2==0){
                    arr[i][j] = "W";
                } else {
                    arr[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void increaseByFive() {
        Random random = new Random();
        int[][][] arr = new int[5][5][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                for (int k = 0; k < arr[i][j].length; k++){
                    arr[i][j][k] = random.nextInt(5);
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int increase = scanner.nextInt();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                for (int k = 0; k < arr[i][j].length; k++){
                    arr[i][j][k] += increase;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
