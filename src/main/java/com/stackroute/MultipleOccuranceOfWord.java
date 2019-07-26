package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccuranceOfWord {


    public String multipleOccuranceOfWord(String input,String data){

        Pattern pattern = Pattern.compile(data);

        Matcher m = pattern.matcher(input);
        int n=0;

         while (m.find()) {
             System.out.println("Found at " + m.start() + "-"+(m.end()));
             n++;
         }

         if(n==0) {
             return null;
         }
         else
             return "matches";

    }

}

