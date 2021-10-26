package com.company.scooters;

public class KingSongDS11 implements MaxPower {
    private int battery;
    private final int controller = 30;
    private final int nrOfControllers = 2;

    public KingSongDS11(int wheel) {
        this.battery = wheel;
        setPower();
    }
    private void setPower() {
        battery = nrOfControllers * (battery * controller);
    }
    @Override
    public double getPower() {
        return battery;
    }
}

