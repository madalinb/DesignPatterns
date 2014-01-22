package com.cegeka.composite;

public class Person extends Party {

	private String name;
	private int gold;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public void stats(){
		System.out.println(String.format("%s has %d gold coins.", name, gold));
	}
}


