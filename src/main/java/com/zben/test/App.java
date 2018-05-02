package com.zben.test;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        staticFunction();
    }

    static App app = new App();

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    App() {
        System.out.println("3");
        System.out.println("a=" + a + ", b=" + b);
    }

    private static void staticFunction() {

        System.out.println("4");
    }

    int a = 1;

    static int b = 3;
}
