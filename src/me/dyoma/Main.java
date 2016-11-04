package me.dyoma;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        String hello = String.valueOf("Hello ");
        String cat = String.valueOf("Cat!");
        StringBuffer result = new StringBuffer(10);

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String input = bufferedReader.readLine();


        if (input != null) {
            result.append(hello).append(input).append(" ").append(cat);
        } else {
            result.append(hello).append(cat);
        }

        print(result.toString());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
