package com.jixin;

public class MainClass {
    public static void main(String[] args) {
        MakeBus makeBus = new MakeBus();
        makeBus.make();
        System.out.println("------------------------------");

        MakeJeep makeJeep = new MakeJeep();
        makeJeep.make();
    }
}
