package com.jixin;

public class BananaCommand extends Command {
    public BananaCommand(Preddler preddler) {
        super(preddler);
    }

    public void sail() {
        this.getPreddler().sailBanana();
    }
}
