package com.example.dynamodbtest.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date parseDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parsedDate = dateFormat.parse(dateString);
            return parsedDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}