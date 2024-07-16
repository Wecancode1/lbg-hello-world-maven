package com.qa;

/**
 * Hello world!
 * testing jenkins build scott
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Peter2"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Peter"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello Scott World!";
    }

    public static String sayGoodbye(){
        return "Hello happy  World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
