package com.example.jumbleword;

import java.util.Random;

public class Anagram {
    public static  final Random rm= new Random();
    public static final String[] name = {"SMOOTH","HARRY","RON","POTTER","HUNGER","GAMES","FREQUENT","EXTRACTION","ONWARD","DRAGON"};
    public static String jumble(){
        return name[rm.nextInt(name.length)];
    }
    public static String jumbleword(String word){
        if(word !=null && !"".equals(word)){
            char a[]=word.toCharArray();
            for(int i=0;i<a.length;i++){
                int j=rm.nextInt(a.length);
                char t = a[i];
                a[i]=a[j];
                a[j]=t;
            }
            return new String(a);
        }
        return word;
    }
}
