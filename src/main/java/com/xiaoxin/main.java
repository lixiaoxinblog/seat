package com.xiaoxin;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

public class main {
    public static void main(String[] args) {
        String[][] seat=new String[2][2];
        seat[0][0]="1";
        seat[0][1]="2";
        seat[1][0]="3";
        seat[1][1]="4";
        /*for (String[] strings : seat) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
*/
        String jsonString = JSONObject.toJSONString(seat);
        System.out.println(jsonString);
    }
}
