package com.jixin;

import lombok.Data;

public @Data class Context {
    public Context(String inPut) {
        this.inPut = inPut;
    }
    private String inPut;
    private int outPut;
}
