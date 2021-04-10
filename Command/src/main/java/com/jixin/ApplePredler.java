package com.jixin;

public class ApplePredler extends Command {
    public ApplePredler(Preddler preddler) {
        super(preddler);
    }

    public void sail() {
       this.getPreddler().sailApple();
    }
}
