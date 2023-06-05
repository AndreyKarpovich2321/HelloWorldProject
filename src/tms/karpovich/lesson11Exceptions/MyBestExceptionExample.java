package tms.karpovich.lesson11Exceptions;

import java.util.Scanner;

public class MyBestExceptionExample {
    public static void main(String[] args) {
        int currentAge = 30;
        System.out.println("Enter age");
        Scanner scanner = new Scanner(System.in);
        int guessedAge = scanner.nextInt();
        boolean isGameContinue = false;
        try {
            isGameContinue = checkAge(currentAge, guessedAge);

            while (isGameContinue) {
                System.out.println("Enter age");
                guessedAge = scanner.nextInt();

                isGameContinue = checkAge(currentAge, guessedAge);

            }
        }
        catch (MyBestException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
    private static boolean checkAge(int currentAge, int guessedAge) throws MyBestException {
        int result = currentAge - guessedAge;
        if (result == 0){
            System.out.println("Right");
            return false;
        }
        if(result > -5 && result < 5){
            System.out.println("Try again");
            return true;
        }
        if (result > 5) throw new MyBestException("Wrong", currentAge);
        throw new MyBestException("Completely wrong", currentAge);
//        return false;

    }
}
