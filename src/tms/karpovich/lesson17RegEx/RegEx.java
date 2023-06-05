package tms.karpovich.lesson17RegEx;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String testString = "This is my 1 test string, - 12345";
        String test2 = "12345";
        Pattern numbers = Pattern.compile("\\d+");
        Matcher numbersMatcher = numbers.matcher(testString);
        System.out.println(numbersMatcher.matches());
        while (numbersMatcher.find()){
            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end());
            System.out.println(numbersMatcher.group());
        }
        numbersMatcher.reset();
        numbersMatcher.usePattern(Pattern.compile("test"));

        numbersMatcher.reset();
        numbersMatcher.results().map(MatchResult::group).map(String::length).forEach(length -> System.out.println(length));


    }
}
