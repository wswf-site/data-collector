package com.example.data_collector.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class DataUtils {
    public static final Map<String, String> VIDEO_ID_TO_TEAM = Map.of(
            "vEuBkPXkfQ4", "MOTIV",
            "OQPYfEi-nyA", "BUMSUP",
            "EZrvieOjij0", "AGSQUAD",
            "t7RN-R5DnZM", "OSAKA_OjoGang",
            "eHaxR1rmSHo", "RHTokyo"
    );
    public static final String UNKNOWN_TEAM = "unknown";
}
