package tms.karpovich.lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Homework {
    public static void main(String[] args){

//        Date date = new Date();
//        LocalDate localDate = LocalDate.now();
//        Scanner scanner = new Scanner(System.in);
//        SimpleDateFormat format = new SimpleDateFormat("dd - MM - yyyy");
//        String string = scanner.nextLine();
//        date = format.parse(string);
//        localDate = LocalDate.parse((CharSequence) date);
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(new Date("05 05 2000"));

//        LocalDate localDate = LocalDate.now();
//        localDate.plusDays(1);
//
//        while (localDate.getDayOfWeek() != DayOfWeek.WEDNESDAY){
//            localDate.plusDays(1);
//        }
//        System.out.println(localDate.getDayOfMonth());

        Predicate<Integer> predicate = integer -> integer % 13 == 0;
//        Supplier<Integer> supplier = () -> LocalDate.now().getDayOfWeek();
        Consumer<Integer> consumer = integer -> {
            if (integer >= 0) System.out.println(integer * integer);
            else System.out.println("Number is negative");
        };
        Function<String ,Integer> function = sentence -> {
            String[] arr = sentence.split(" ");
            return arr.length;
        };
        }
}
