package com.offcn.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppDateUtils {
    public static String getFormatTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String string = format.format(new Date());
        return string;
    }

    public static String getFormatTime(String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String string = format.format(new Date());
        return string;
    }

    public static String getFormatTime(String pattern, Date date) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String string = format.format(date);
        return string;
    }

}
