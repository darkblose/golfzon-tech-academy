package test.com;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test02Date {
    public static void main(String[] args) {
        System.out.println("Hello Date");

        Date ud = new Date();
        System.out.println(ud);

        java.sql.Date sd = new java.sql.Date(System.currentTimeMillis());
        System.out.println(sd);

        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println(ts);

        Calendar gCal = Calendar.getInstance();
        System.out.print(gCal.get(Calendar.YEAR) + "-");
        System.out.print(gCal.get(Calendar.MONTH) + "-");
        System.out.print(gCal.get(Calendar.DAY_OF_MONTH) + " ");
        System.out.print(gCal.get(Calendar.AM_PM) + " ");
        System.out.print(gCal.get(Calendar.HOUR_OF_DAY) + ":");
        System.out.print(gCal.get(Calendar.MINUTE) + ":");
        System.out.print(gCal.get(Calendar.SECOND) + ":");
        System.out.println(gCal.get(Calendar.MILLISECOND));

        Calendar EndDay = new GregorianCalendar(2022, 11,28,17,50,1);
        System.out.print(EndDay.get(Calendar.YEAR) + "-");
        System.out.print(EndDay.get(Calendar.MONTH)+1 + "-");
        System.out.print(EndDay.get(Calendar.DAY_OF_MONTH) + " ");
        System.out.print(EndDay.get(Calendar.AM_PM) + " ");
        System.out.print(EndDay.get(Calendar.HOUR_OF_DAY) + ":");
        System.out.print(EndDay.get(Calendar.MINUTE) + ":");
        System.out.print(EndDay.get(Calendar.SECOND) + ":");
        System.out.println(EndDay.get(Calendar.MILLISECOND));
    }
}
