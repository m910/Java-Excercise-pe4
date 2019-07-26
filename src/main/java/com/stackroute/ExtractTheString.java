package com.stackroute;

public class ExtractTheString {

    public String extractingTheStringFromParagraphAndSorting(String data){

        String string="";
        String[] value=data.split(" ");

        for(int i=0;i<value.length;i++){
            for(int j=0;j<value.length;j++){
                 if(value[j].compareToIgnoreCase(value[i])>0);

                 string=value[i];
                 value[i]=value[j];
                 value[j]=string;

            }
        }
        for(int i=0;i<value.length;i++){
            System.out.println(value[i]);

        }

        return "Sorted";
    }



}
