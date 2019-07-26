package com.stackroute;

public class ReplaceLetter {

    public String replaceALetter(String input) {

        if (input == null)
            return null;


        String output = "";


        output = input.replace('d', 'f').replace('l', 't');


        return output;
    }
}

