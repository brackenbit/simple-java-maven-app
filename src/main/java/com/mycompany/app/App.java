package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        // Jenkins is sporadically failing, potentially due to issue with incorrectly
        // reported number of cores (reporting 16 cores on 12 core system).
        System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
    }

    public String getMessage() {
        return MESSAGE;
    }
}
