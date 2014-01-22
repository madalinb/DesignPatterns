package com.cegeka.bridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<Manuscript> documents = new ArrayList<Manuscript>();

		IFormatter formatter = new StandardFormatter();

		Faq faq = new Faq(formatter);
		faq.setTitle("The Bridge Pattern FAQ");
		Map<String, String> questions = new HashMap<String, String>();
		questions.put("What is it?", "A design pattern");
		questions
				.put("When do we use it?",
						"When you need to separate an abstraction from an implementation.");

		faq.setQuestions(questions);
		documents.add(faq);

		Book book = new Book(formatter);
		book.setAuthor("GOF");
		book.setTitle("Lots of Patterns");
		book.setText("Great book!");

		documents.add(book);

		TermPaper paper = new TermPaper(formatter);
		paper.setStudentClass("Design Patterns");
		paper.setStudent("John Doe");
		paper.setText("Super!");
		paper.setReferences("GOF");

		documents.add(paper);

		for (Manuscript doc : documents) {
			doc.print();
		}
	}
}
