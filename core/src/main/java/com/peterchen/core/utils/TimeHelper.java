package com.peterchen.core.utils;

import org.joda.time.DateTime;

/**
 * Created by fanHB on 15-1-26.
 */
public class TimeHelper {
    public static long getNow(){
        return DateTime.now().getMillis();

    }
}
