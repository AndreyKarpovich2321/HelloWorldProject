package tms.karpovich.lesson10;

public class TestMain {
    public static void main(String[] args) {
        String test = "This abba not";
        System.out.println(isPalindrome(1, test));
        System.out.println(isPalindrome(2, test));
        System.out.println(isPalindrome(10, test));


    }
    private static boolean isPalindrome(String str){
        StringBuilder builder = new StringBuilder(str);
        return str.equals(builder.reverse().toString());
    }
    private static boolean isPalindrome(int number, String str){
        String[] arr = str.split(" ");
        if (number > arr.length) {
            System.out.println("Number is too long");
            return false;
        }
        return isPalindrome(arr[number - 1]);
    }
    private static boolean isNewPalindrome(String str){
        char[] arr = str.toCharArray();
        int size = arr.length / 2;
        for (int i = 0; i < size;i++){
            if (arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
