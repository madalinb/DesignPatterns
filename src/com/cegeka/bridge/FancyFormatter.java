package com.cegeka.bridge;

public class FancyFormatter implements IFormatter {

	@Override
	public String format(String key, String value) {
		return String.format("----%s======= %s", key, value);
	}

}
