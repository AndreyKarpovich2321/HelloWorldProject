package tms.karpovich.lesson14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime time;
        LocalDate date;
        Date oldDate;
        Calendar calendar;
        date = LocalDate.now();
        time = LocalDateTime.now();
        System.out.println(date.plusDays(1));
        System.out.println(time.minusDays(1));
        date = date.plusMonths(1).plusWeeks(1).plusYears(1);
        System.out.println(date.getDayOfMonth());
        LocalDate exactDate = LocalDate.of(2020, Month.FEBRUARY, 15);
        SimpleDateFormat format = new SimpleDateFormat("yyyy   MM    dd");
        System.out.println(format.format(new Date()));
    }
}
