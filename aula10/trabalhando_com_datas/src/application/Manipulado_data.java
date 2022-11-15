package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Manipulado_data {
    public static void main(String[] args) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat();
        //Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        Date d = new Date(System.currentTimeMillis());

        System.out.println();
        System.out.println(sdf.format(d));

        // acrecentando 4 horas a mais
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sdf.format(d));

        //Obtendo uma unidade de tempo
        Calendar cal1 = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        
   


        System.out.println("Minutes: "+ minutes);
        System.out.println("Month: "+ month);
        



    }
}
