package com.clay;

/**
 * Adapter1
 */
public class Adapter1 implements Target {

    Adaptee adaptee = new Adaptee();
	public void request() {
		adaptee.specialRequest();
	}
}