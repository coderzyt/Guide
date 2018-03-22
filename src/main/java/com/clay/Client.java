package com.clay;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        Target t = new Target(){
            public void request() {
                
            }
        };
        t.request();
    }
}