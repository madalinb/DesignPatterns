package com.cegeka.composite;

import java.util.ArrayList;
import java.util.List;

public class Group extends Party {

	private String name;
	private List<Party> members;

	public Group(String name) {
		members = new ArrayList<Party>();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGold() {
		int totalGold = 0;
		for (Party member : members) {
			totalGold += member.getGold();
		}
		return totalGold;
	}

	public void setGold(int gold) {
		int eachSplit = gold / members.size();
		int leftOver = gold % members.size();
		for (Party member : members) {
			member.setGold(member.getGold() + eachSplit + leftOver);
			leftOver = 0;
		}
	}

	public List<Party> getMembers() {
		return members;
	}

	public void setMembers(List<Party> members) {
		this.members = members;
	}

	public void stats() {
		for (Party member : members) {
			member.stats();
		}
	}
}
