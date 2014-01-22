package com.cegeka.bridge;

public class StandardFormatter implements IFormatter {

	@Override
	public String format(String key, String value) {
		return String.format("%s: %s", key, value);
	}

}
