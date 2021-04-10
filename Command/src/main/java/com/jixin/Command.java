package com.jixin;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data abstract class Command {
    private Preddler preddler;
    public abstract void sail();
}
