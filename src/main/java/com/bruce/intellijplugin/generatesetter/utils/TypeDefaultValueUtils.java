package com.bruce.intellijplugin.generatesetter.utils;

import java.util.HashMap;
import java.util.Map;

public class TypeDefaultValueUtils {

    private static Map<String, String> typeGeneratedMap = new HashMap<String, String>() {
        {
            put("boolean", "false");
            put("java.lang.Boolean", "false");
            put("int", "0");
            put("byte", "(byte)0");
            put("java.lang.Byte", "(byte)0");
            put("java.lang.Integer", "0");
            put("java.lang.String", "\"\"");
            put("java.math.BigDecimal", "new BigDecimal(\"0\")");
            put("java.lang.Long", "0L");
            put("long", "0L");
            put("short", "(short)0");
            put("java.lang.Short", "(short)0");
            put("java.util.Date", "new Date()");
            put("float", "0.0F");
            put("java.lang.Float", "0.0F");
            put("double", "0.0D");
            put("java.lang.Double", "0.0D");
            put("java.lang.Character", "\'\'");
            put("char", "\'\'");
            put("java.time.LocalDateTime", "LocalDateTime.now()");
            put("java.time.LocalDate", "LocalDate.now()");

        }
    };

    public static String getValueForBasicType(String type) {
        String value = typeGeneratedMap.get(type);
        if (value == null) {
            value = typeGeneratedMap.get("java.lang." + type);
        }
        if (value == null) {
            value = typeGeneratedMap.get("java.util." + type);
        }
        if (value == null) {
            value = typeGeneratedMap.get("java.math." + type);
        }
        if (value == null) {
            value = typeGeneratedMap.get("java.time." + type);
        }
        return value;
    }
}
