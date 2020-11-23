package com.hz;

public class DummyClockElement extends ClockElement {

    public DummyClockElement(ClockElement clockElement, String flag, int scope) {
        super(clockElement, flag, scope);
    }

    @Override
    public void increment() {

        System.out.println("Eaten increment");
        // eat
    }
}
