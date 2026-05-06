package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kunmu On 07-05-2026
 */
public class RegularExpressionClass {

    public void getFirstPatternMatch(String pattern,String text){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
            System.out.println("Start Index: " + m.start());
            System.out.println("End Index: " + m.end());
        }
    }

    public boolean getEmailPatternMatch(String pattern,String text){
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        /*Pattern p = Pattern.compile(pattern);*/
        Matcher m = p.matcher(text);
        return m.matches();
    }
}
