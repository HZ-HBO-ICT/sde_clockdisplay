package com.hz;

public class ClockElement {

    private String _flag;
    private int _currentTime;

    private int _scope;
    private ClockElement _next;

    public ClockElement(ClockElement clockElement, String flag, int scope) {

        this._currentTime = 0;

        this._next = clockElement;
        this._flag = flag;
        this._scope = scope;
    }

    private void resetValues() {

        this._currentTime = 0;
    }

    private void incrementCurrentTime() {
        _currentTime++;
    }

    public void increment() {

        if (isNextIncrementInScope()) {
            incrementCurrentTime();
        } else {
            this._next.increment();
            this.resetValues();
        }
    }

    private boolean isNextIncrementInScope() {

        int nextTime = this._currentTime + 1;
        boolean isNextInSope = nextTime % this._scope != 0;

        return isNextInSope;
    }

    @Override
    public String toString() {

        return String.format("%02d", this._currentTime);
    }
}
