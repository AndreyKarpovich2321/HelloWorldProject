package tms.karpovich.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        isNumberInArray();
        replaceAllToZero();
        minMaxAverage();
        twoArraysFiveElements();
        arrayOfEvenNumbersFromFirstArray();
        oddNumbersToZero();
    }

    private static void oddNumbersToZero() {
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayOfEvenNumbersFromFirstArray() {
        int[] arr = {0, 1, 2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int arrSize = scanner.nextInt();
        if (arrSize > 5 && arrSize <= 10) {
            arr = new int[arrSize];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Random().nextInt(10);
            }
            System.out.println(Arrays.toString(arr));
        }
        else {
            System.out.println("Array size must be from 5 to 10" + System.lineSeparator() + "Input new array size");
            arrSize = scanner.nextInt();
        }
        int[] arr2 = new int[arrSize];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 == 0) {
                arr2[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void twoArraysFiveElements() {
        int[] arr = new int[5];
        for (int i=0; i<arr.length; i++){
            arr[i] = new Random().nextInt(10);
        }
        int[] arr2 = new int[5];
        for (int i=0; i<arr2.length; i++){
            arr2[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        double sumOfElements = 0;
        double sumOfElements2 = 0;
        for (int i=0; i<arr.length; i++) {
            sumOfElements += arr[i];
        }
        for (int i=0; i<arr2.length; i++) {
            sumOfElements2 += arr2[i];
        }
        double average = sumOfElements / arr.length;
        double average2 = sumOfElements2 / arr2.length;
        if (average > average2){
            System.out.println("Average of first array is bigger");
        }
        else if (average < average2){
            System.out.println("Average of second array is bigger");
        }
        else {
            System.out.println("Average is equal");
        }
    }

    private static void minMaxAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i=0; i<arr.length; i++){
            arr[i] = new Random().nextInt(10);
        }
        int maxElement = arr[0];
        int minElement = arr[0];
        double sumOfElements = 0;
        for (int i=0; i<arr.length; i++){
            sumOfElements += arr[i];
            if (arr[i] > maxElement){
                maxElement = arr[i];
            }
            if (arr[i] < minElement){
                minElement = arr[i];
            }
        }
        double average = sumOfElements / arrSize;
        System.out.println("Min element is " + minElement  + System.lineSeparator() + "Max element is " + maxElement + System.lineSeparator() + "Average " + average);
    }

    private static void replaceAllToZero() {
        int[] arr = new int[5];
        for (int i=0; i<arr.length; i++){
            arr[i] = new Random().nextInt(9);
        }
        for (int i=0; i<arr.length; i++){
            arr[i] = 0;
        }
    }

    private static void isNumberInArray() {
        int[] arr = new int[5];
        for (int i=0; i<arr.length; i++){
            arr[i] = new Random().nextInt(9);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int input = scanner.nextInt();
        for (int i=0; i<arr.length; i++){
            if (arr[i] == input){
                System.out.println("This number is in array");
                break;
            }
            else {
                System.out.println("This number is not in array");
            }
        }
    }
}
