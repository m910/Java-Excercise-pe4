package com.stackroute;

public class TransposeString {

    public String transposingAString(String input) {

        if (input == null)
            return null;

        String[] word = input.split(" ");

        String reverse = "";
        for (int i = 0; i < word.length; i++) {
            String words = word[i];

            String reverseWord = "";

            for (int j = words.length() - 1; j >= 0; j--) {

                reverseWord = reverseWord + words.charAt(j);
            }

            reverse = reverse + reverseWord + " ";

        }

        System.out.println("Input String : " + input);

        System.out.println("Output String :" + reverse);

        return reverse;

    }
}
