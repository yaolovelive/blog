package com.yy.util;

public class Validate {

    public static boolean isNotNull(String str){
        if(null == str || "".equals(str)){
            return false;
        }
        return true;
    }

    public static boolean isGe(String str,Integer min){
        if(str == null || str.length() < min){
            return false;
        }
        return true;
    }

    public static boolean isLe(String str,Integer max){
        if(str == null || str.length() > max){
            return false;
        }
        return true;
    }

}
