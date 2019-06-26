package com.bj186.crm.Utils;

import java.util.HashMap;
import java.util.Map;

public class MsgUtils {
    //消息提示
    private static  Map<String,Object> map = new HashMap<>();

    public static Map<String,Object> MsgUtils(String msg,Integer code,Object object){
        map.put("status",code);
        map.put("data",object);
        map.put("msg",msg);
        return map;
    }

    public static Map<String,Object> MsgUtils(String msg,Integer code){
        map.put("status",code);
        map.put("msg",msg);
        return map;
    }
}
