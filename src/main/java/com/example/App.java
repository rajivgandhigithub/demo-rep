package com.example;

import java.io.File;

public class App {
    public static void main(String[] args) {
        // 1. RELIABILITY BUG: Will throw a NullPointerException at runtime
        String text = null;
        System.out.println(text.length()); 

        // 2. SECURITY HOTSPOT: Hardcoded, predictable path
        File tempDir = new File("/tmp/unsecure-dir");
        
        System.out.println("Testing Quality Gate Failure...");
    }

    // 3. COVERAGE VIOLATION: Brand new method with absolutely zero unit tests
    public void untestedMethod() {
        System.out.println("No test coverage here! Dropping overall coverage metrics.");
    }
}

