package com.tregz.miksing.core.date;

import android.text.format.DateFormat;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class DateUtil {

    public static String dayOfYear(String skeleton, Date at) {
        if (skeleton == null) skeleton = "dMMMMyyyy";
        return format(pattern(skeleton), at);
    }

    private static Calendar calendar(Date at) {
        Calendar calendar = Calendar.getInstance();
        if (at != null) calendar.setTime(at);
        return calendar;
    }

    private static String format(String pattern, Date at) {
        return new SimpleDateFormat(pattern, Locale.getDefault()).format(calendar(at).getTime());
    }

    private static String pattern(String skeleton) {
        return DateFormat.getBestDateTimePattern(Locale.getDefault(), skeleton);
    }


}
