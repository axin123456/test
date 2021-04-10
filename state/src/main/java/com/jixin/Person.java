package com.jixin;

import lombok.Data;

public @Data class Person {
    private Integer hour;
    private State state;

    public void doSomething() {
        if (hour == 7) {
           new MState().doSomething();
        } else if (hour == 12) {
            new LState().doSomething();
        } else if (hour == 18) {
            new WState().doSomething();
        } else {
            System.out.println(hour + "未定义");
        }
    }
}
