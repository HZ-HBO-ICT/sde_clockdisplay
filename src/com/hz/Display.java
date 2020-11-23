package com.hz;

public class Display {

    private ClockElement _seconds;
    private ClockElement _minutes;
    private ClockElement _hours;


    public Display() {

        this._hours = new ClockElement(new DummyClockElement(null, "dummy", 0), "hours", 24);
        this._minutes = new ClockElement(_hours, "minutes", 60);
        this._seconds = new ClockElement(_minutes, "seconds", 60);
    }

    public void increment() {

        this._seconds.increment();
    }

    @Override
    public String toString() {

        return this._hours.toString() + ":" + this._minutes.toString() + ":" + this._seconds.toString();
    }
}
