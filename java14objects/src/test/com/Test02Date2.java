package test.com;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test02Date2 {
    public static void main(String[] args) {
        System.out.println("Hello Date");

        Date ud = new Date();
        System.out.println(ud);
        System.out.println(ud.getTime()); // = System.currentTimeMillis()
        System.out.println(System.currentTimeMillis());

//        날짜타입을 이쁘게 변형(포맷)해주는 객체
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss:SSS");
        String str_date = sdf.format(ud);
        System.out.println(str_date);

    }
}
