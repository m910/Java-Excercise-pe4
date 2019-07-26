package com.stackroute;

import java.util.regex.Pattern;

public class PresenceOfName {

    public boolean findingPresenceOfName(String input) {

        String[] value=input.split(" ");
        System.out.println(input);

        boolean match= Pattern.matches("Harry",value[2]);
        System.out.println("Is Harry here ?" + match);


            return match;

        }

}
