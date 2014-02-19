package com.cegeka.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommandQueue {

    public static List produceRequests() {
        List queue = new ArrayList();
        queue.add(new Sportsman());
        queue.add(new Programmer());
        return queue;
    }

    public static void setCommand(List queue) {
        for (Iterator it = queue.iterator(); it.hasNext(); )
            ((Command) it.next()).execute();
    }

    public static void main(String[] args) {
        List queue = produceRequests();
        setCommand(queue);

    }

    static class Sportsman implements Command {
        public void execute() {
            System.out.println("Run!");
        }
    }

    static class Programmer implements Command {
        public void execute() {
            System.out.println("Fix the bugs!");
        }
    }
}
