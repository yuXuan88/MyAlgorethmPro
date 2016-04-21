package com.tsing.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ad on 2016/4/19.
 */
public class JanZhis {
    /**
     * print 1-n bits  data
     * @param n
     * @return
     */
     public  int  complete12(int n) {
         if (n <= 0)
             return -1;
         String determ = "";
         while (0 < n--)
             determ += "9";
         String data = "0";
         while(!data.equals(determ))
               data = increase(data);
         return  0;
     }

    private  String    increase(String data) {
        int isTakeOver = 0;
        for(int i = data.length()-1; i > -1; i--) {
            int nsum = data.charAt(i)-'0'+isTakeOver;
            if (i == data.length() - 1)
                nsum ++;
            if (nsum >= 10) {
                isTakeOver = 1;
                nsum -= 10;
                char tem = (char) (nsum+'0');
                data = data.substring(0, i)+tem+data.substring(i+1);
                if (i == 0) {
                    data = "1"+data;
                    break;
                }
            } else {
                char tem = (char) (nsum+'0');
                data = data.substring(0, i)+tem+data.substring(i+1);
                break;
            }
        }
        System.err.print(data+",");
        return  data;
    }



}
