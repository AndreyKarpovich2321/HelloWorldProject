package tms.karpovich.lesson16Stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeEx {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd--MM--yyyy");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate.getDayOfWeek().getValue());
        var day = localDate.getDayOfWeek().getValue();
        if (day == 1) {
            System.out.println(localDate.plusDays(1));
        }
        else System.out.println(localDate.plusDays(9 - day));

        if (day != 1){
            day = 9 - day;
        }
        System.out.println(localDate.plusDays(day));
    }
}
