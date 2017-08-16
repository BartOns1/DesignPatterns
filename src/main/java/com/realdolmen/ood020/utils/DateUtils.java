package com.realdolmen.ood020.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class DateUtils {
    public static Date createDate(String pattern){
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(pattern);
        } catch (ParseException e) {
            throw new IllegalArgumentException();
        }
    }
}
//gebruik maken van java.time.LocalDate, dan is dit niet meer nodig