package tms.karpovich.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList("ABC", "abc", "f", "F", "");
        Pattern pattern = Pattern.compile("[a-z]");
//        Pattern pattern = Pattern.compile("[a-z]+");
//        Pattern pattern = Pattern.compile("[a-z]*");
//        Pattern pattern = Pattern.compile("[a-z]?"); // 0 or 1
//        Pattern pattern = Pattern.compile("[a-z]{2,3}"); // length 2 or 3
//        Pattern pattern = Pattern.compile("[a-zA-Z]+");
//        Pattern pattern = Pattern.compile("[a-z]+", Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile("[a-z]+\\d+[a-z]+");
        testStrings.forEach(str -> {
            Matcher matcher = pattern.matcher(str);
            System.out.println(str + " matches? " + matcher.matches());
        });
    }
}
