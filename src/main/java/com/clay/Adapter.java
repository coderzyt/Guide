package com.clay;

/**
 * Adapter
 */
public class Adapter extends Adaptee implements Target {

	public void request() {
		this.specialRequest();
	}
}