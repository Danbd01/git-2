package com.company;

public class TextParser {
    public static int countWords(String inp) {
        int count = inp.split(" ").length;
        return count;

    }

    public static int countSentence(String inp) {
        int count = inp.split("[!?.]+").length;
        return count;
    }
}