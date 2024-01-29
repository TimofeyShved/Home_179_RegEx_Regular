package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // использование регулярных вырожений
        Pattern p1 = Pattern.compile("a", Pattern.CASE_INSENSITIVE); // не чуствует регистр
        /*
        Pattern p1 = Pattern.compile("A#this comment", Pattern.COMMENTS); // не видит соментарии в поиске
        Pattern p1 = Pattern.compile("A", Pattern.MULTILINE); // будет искаться во множестве строчек
         */
        Matcher m1 = p1.matcher("A");
        while (m1.find()){
            System.out.println(m1.start() +" "+ m1.group()+" ");
        }

        System.out.println("A".matches("(?i)a")); // не чуствует регистр
        System.out.println("A".matches("(?s)a")); // будет искаться в одной строке
        System.out.println("A".matches("(?m)a")); // будет искаться во множестве строчек
        System.out.println("A".matches("(?x)A#comment")); // не видит соментарии в поиске
        System.out.println("A".matches("(?ix)a#comment")); // не чуствует регистр и не видит соментарии в поиске
        System.out.println("AA".matches("(?i)a(?-i)a")); // 1 вкл мод, 2 отключаю мод
        System.out.println("AAA".matches("(?i)a(?-i:A)a")); //1 вкл мод, 2 отключаю мод только для А
    }
}
