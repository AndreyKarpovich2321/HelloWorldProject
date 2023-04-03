package tms.karpovich.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Classwork {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        int[] arr2 = new int[5];
        int[] arr3 = new int[10];
        for (int i=0; i<arr2.length; i++){
            arr2[i] = new Random().nextInt(4);
        }

        int sum = 0;
        int countOfTwo = 0;
        for (int val: arr2){
            sum += val;
            if (val ==2) {
                countOfTwo++;
            }

        }
        System.out.println(Arrays.toString(arr2) + " " + countOfTwo);
//        int result = 11;
//        for (int i = 0, j = 1; i < arr3.length; i++, j++) {
//            arr3[i] = j;
//            if (result> arr3[i]) {
//                result = arr3[i];
//            }
//
//        }
//        System.out.println(result);


    }

}