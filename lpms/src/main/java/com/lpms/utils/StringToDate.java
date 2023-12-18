package com.lpms.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static Date getStringToDate(String dateTimeString){
        DateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 指定日期时间格式
        Date dateTime;
        try {
            dateTime = dateTimeFormat.parse(dateTimeString); // 将字符串转换为日期时间对象
            return dateTime;
        } catch (ParseException e) {
            System.out.println("日期时间解析出错: " + e.getMessage());
            dateTime=null;
        }
        return dateTime;
    }
}
