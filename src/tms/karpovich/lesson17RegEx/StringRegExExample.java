package tms.karpovich.lesson17RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}");
        String testCase = "1234-abc-5678-def-9zoy";
        System.out.println(pattern.matcher(testCase).matches());
    }

    private static void printFirstLetters(String str){
        Pattern pattern = Pattern.compile("(\\d{4})(-[a-z]{3}-)(\\d{4})(-[a-z]{3}-)(\\d[a-z]){2}");
        Matcher matcher = pattern.matcher(str);
        System.out.println(pattern.matcher(str).matches());
        if (matcher.find()){
            System.out.println(matcher.group(1));

        }
    }
    private static void printWithoutLetters(String str){
        System.out.println(str.replaceAll("[a-z]{3}", "***"));
    }
    private static void printOnlyLetters(String str){
        System.out.println(str.replaceAll("\\d+-?", "").replaceAll("-", "/"));
    }
    private static void printIfDocumentStartsWithANumberThatLessThen(String str){
        Pattern pattern = Pattern.compile("[0-1]([0-4][0-9]|50).+");
        System.out.println(pattern.matcher(str).matches());
    }
}
