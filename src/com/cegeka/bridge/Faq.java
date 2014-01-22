package com.cegeka.bridge;

import java.util.HashMap;
import java.util.Map;

public class Faq extends Manuscript {

	private String title;
	private Map<String, String> questions;

	public Faq(IFormatter formatter) {
		super(formatter);
		questions = new HashMap<String, String>();
	}

	@Override
	public void print() {
		System.out.println(formatter.format("Title", title));
		for (Map.Entry<String, String> question : questions.entrySet()) {
			System.out
					.println(formatter.format(" Question", question.getKey()));
			System.out
					.println(formatter.format(" Answer", question.getValue()));
		}

		System.out.println("\n");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Map<String, String> getQuestions() {
		return questions;
	}

	public void setQuestions(Map<String, String> questions) {
		this.questions = questions;
	}

}
