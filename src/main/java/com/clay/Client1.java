package com.clay;

/**
 * Client1
 */
public class Client1 {
    public static void main(String[] args) {
        Target t = new Adapter1();
        t.request();
    }
}