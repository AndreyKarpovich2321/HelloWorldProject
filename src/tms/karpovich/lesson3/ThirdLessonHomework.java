package tms.karpovich.lesson3;

import java.util.Scanner;
import java.util.Random;

public class ThirdLessonHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        rainbowColor(scanner);
        sumAllNumbersFromOneToUserChoose(scanner);
        sequence7to98();
        guessTheNumber(scanner);
    }

    private static void rainbowColor(Scanner scanner) {
        System.out.println("Input number");
        int rainbowColor = scanner.nextInt();
        switch (rainbowColor){
            case 1:
                System.out.println("Rainbow color is Red");
                break;
            case 2:
                System.out.println("Rainbow color is Orange");
                break;
            case 3:
                System.out.println("Rainbow color is Yellow");
                break;
            case 4:
                System.out.println("Rainbow color is Green");
                break;
            case 5:
                System.out.println("Rainbow color is Blue");
                break;
            case 6:
                System.out.println("Rainbow color is Indigo");
                break;
            case 7:
                System.out.println("Rainbow color is Violet");
                break;
            default:
                System.out.println("Input number");
                break;
        }
    }

    private static void sumAllNumbersFromOneToUserChoose(Scanner scanner) {
        System.out.println("Input number");
        if (scanner.hasNextInt()){
            int bound = scanner.nextInt();
            if (bound < 100){
                for (int number = 1, count = 1; count <= bound; count++){
                    number +=number;
                    if (count == bound){
                        System.out.println("Answer is " + number);
                    }
                }
            }
            else {
                System.out.println("Input number smaller than 100");
            }
        }
        else{
            System.out.println("Wrong imput");
        }
    }

    private static void sequence7to98() {
        int count = 7;
        while (count < 100){
            System.out.print(count + " ");
            count += 7;
        }
    }

    private static void guessTheNumber(Scanner scanner) {
        int randomNumber = new Random().nextInt(5);
        System.out.println("Input number(max 5)");
        int userNumber = scanner.nextInt();
        if (userNumber == randomNumber) {
            System.out.println("You are right");
        } else if (userNumber < randomNumber) {
            System.out.println("My number is bigger");
        } else if (userNumber > randomNumber) {
            System.out.println("My number is less");
        }
    }
}