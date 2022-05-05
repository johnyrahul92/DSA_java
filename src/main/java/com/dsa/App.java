package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App{

    String a="test1";
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<String> test = new ArrayList<>(Arrays.asList("a","b"));
        List<String> test1 = Arrays.asList("a","b");
        System.out.println(test);
        System.out.println(test1);

        System.out.println(test == test1);

        new App().check("test2");
    }
    private  void check(String a) {
        // this.a="test3";

        System.out.println(a);

    };


       
}
