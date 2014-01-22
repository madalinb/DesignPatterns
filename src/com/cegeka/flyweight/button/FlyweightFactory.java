package com.cegeka.flyweight.button;

import java.awt.*;

public class FlyweightFactory {
    private static java.util.Map ht = new java.util.TreeMap();
    private static int sharedButtons = 0;
    private static ButtonListener bl = new ButtonListener();

    public static Button makeButton(String num) {
        Button btn;
        if (ht.containsKey(num)) {
            // 1. Identify intrinsic state (Button label)
            // 2. Return an existing object   [The same Button cannot be added
            //    multiple times to a container, and, Buttons cannot be cloned.
            //    So - this is only simulating the sharing that the Flyweight
            //    pattern provides.]
            btn = new Button(((Button) ht.get(num)).getLabel());
            sharedButtons++;
        } else {
            // 2. Return a new object
            btn = new Button(num);
            ht.put(num, btn);
        }
        btn.addActionListener(bl);
        return btn;
    }

    public static void report() {
        System.out.print("new Buttons - " + ht.size()
                + ", shared Buttons - " + sharedButtons + ", ");
        for (java.util.Iterator it = ht.keySet().iterator(); it.hasNext(); )
            System.out.print(it.next() + " ");
        System.out.println();
    }
}
