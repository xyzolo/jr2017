package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int findTab = string.indexOf("\t");

        for (int i=1; i<2; i++) {
            if ((findTab = string.indexOf("\t",findTab + 1)) == -1) {
                throw new TooShortStringException();
            }
        }

        String[] s = string.split("\t");
        return s[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
