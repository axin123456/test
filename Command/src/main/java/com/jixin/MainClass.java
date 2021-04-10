package com.jixin;

public class MainClass {
    public static void main(String[] args) {
        ApplePredler applePredler = new ApplePredler(new Preddler());
        applePredler.sail();

        BananaCommand bananaCommand = new BananaCommand(new Preddler());
        bananaCommand.sail();

        ApplePredler applePredler1 = new ApplePredler(new Preddler());
        applePredler.sail();
    }
}
