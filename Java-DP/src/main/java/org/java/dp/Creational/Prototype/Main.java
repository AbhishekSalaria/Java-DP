package org.java.dp.Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        NeemTree neemTree = new NeemTree("20 feet", "1000 kgs", "100 years");
        NeemTree copiedNeemTree = (NeemTree)  neemTree.copy();
        System.out.println(neemTree == copiedNeemTree);
        System.out.println(copiedNeemTree.getHeight());

        System.out.println("\n");

        PineTree pineTree = new PineTree("20 feet", "1000 kgs");
        PineTree copiedPineTree = (PineTree)  pineTree.copy();
        System.out.println(pineTree == copiedPineTree);
        System.out.println(copiedPineTree.getMass());

        System.out.println("\n");

        TreeCache cache = new TreeCache();
        NeemTree cacheClonedNeemTree = (NeemTree) ((NeemTree) cache.getKey("NeemTree")).copy();
        System.out.println(cacheClonedNeemTree.getExpectedLifeSpan());
    }
}
