package me.dyoma;

public class Main {

    public static void main(String[] args) {

        String hello = String.valueOf("Hello ");
        String cat = String.valueOf("Cat!");
        StringBuffer result = new StringBuffer(10);
        result.append(hello).append(cat);
        System.out.println(result);

        //master branch
    }
}
