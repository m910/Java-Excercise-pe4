package com.stackroute;

public class OccuranceOfCharacter {

    public int countingOccuranceOfACharacter(String input, String value) {

        int n = 0;

        System.out.println(("Length of String =" + input.length()));
        System.out.println("Length of a String without a " + input.replace("a", "").length());


        n = input.length() - input.replace(value, "").length();
        System.out.println(n);

        return n;

    }
}
