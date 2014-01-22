package com.cegeka.bridge;

public class TermPaper extends Manuscript {

	private String studentClass;
	private String student;
	private String text;
	private String references;

	public TermPaper(IFormatter formatter) {
		super(formatter);
	}

	@Override
	public void print() {
		System.out.println(formatter.format("Class", studentClass));
		System.out.println(formatter.format("Student", student));
		System.out.println(formatter.format("Text", text));
		System.out.println(formatter.format("References", references));
		
		System.out.println("\n");
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getReferences() {
		return references;
	}

	public void setReferences(String references) {
		this.references = references;
	}

}
