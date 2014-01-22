package com.cegeka.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int goldForKill = 1023;
		System.out.println(String.format("You have killed the Giant IE6 Monster and gained %d gold!", goldForKill));
		
		Person joe = new Person("Joe");
		Person jake = new Person("Jake");
		Person emily = new Person("Emily");
		Person sophia = new Person("Sophia");
		Person brian = new Person("Brian");
		Person oldBob = new Person("Old Bob");
		Person newBob = new Person("New Bob");
		
		Group bobs = new Group("Bobs");
		List<Party> members = new ArrayList<Party>();
		members.add(oldBob);
		members.add(newBob);
		bobs.setMembers(members);
		
		Group developers = new Group("Developers");
		List<Party> devMembers = new ArrayList<Party>();
		devMembers.add(joe);
		devMembers.add(jake);
		devMembers.add(emily);
		devMembers.add(bobs);
		developers.setMembers(devMembers);
		
		
		Group parties = new Group("Root");
		List<Party> rootMembers = new ArrayList<Party>();
		
		rootMembers.add(developers);
		rootMembers.add(sophia);
		rootMembers.add(brian);
		parties.setMembers(rootMembers);

		parties.setGold(goldForKill + parties.getGold());
		parties.stats();
		
	}
}
