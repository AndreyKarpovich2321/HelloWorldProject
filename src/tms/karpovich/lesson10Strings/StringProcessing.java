package tms.karpovich.lesson10Strings;

public class StringProcessing {
    public static void twoFirstBlocks(String string){
        String[] arr = new String[5];
        arr = string.split("-");
        System.out.println(arr[0] + " " + arr[1]);
    }
    public static void noLetters(String string){
        System.out.println(string.replaceAll("[a-zA-Z]", "*"));
    }
    public static void onlyLettersToLowerCase(String string){
        System.out.println(string.replaceAll("\\d", "").toLowerCase().replaceAll("-", "/"));
    }
    public static void lettersToUpperCase(String string){
        string = string.replaceAll("\\d", "").toLowerCase();
        String[] arr = new String[5];
        arr = string.split("-");
        StringBuilder builder = new StringBuilder("Letters: ");
        builder.append("/" + arr[1]).append("/" + arr[3]).append("/" + arr[4]);
        System.out.println(builder.toString());
    }
    public static void containcAbc(String string){
        if (string.contains("abc")) System.out.println("True");
        else System.out.println("False");
    }
    public static void startsWith555(String string){
        if (string.startsWith("555")) System.out.println("True");
        else System.out.println("False");
    }
    public static void endWith1a2b(String string){
        if (string.endsWith("1a2b")) System.out.println("True");
        else System.out.println("False");
    }
}
