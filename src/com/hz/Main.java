package com.hz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Display display = new Display();
        Console console = new Console();

        // testsuite
        for(int i = 0; i < 24 * 60 * 60; i++) {

            display.increment();

            String time = display.toString();

            console.write(time);
        }
    }
}
