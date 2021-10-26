package com.company.scooters;

public class KugooG2Pro implements MaxPower {
    private int battery;
    private final int controller = 30;

    public KugooG2Pro(int wheel) {
        this.battery = wheel;
        setPower();
    }
    private void setPower() {
        battery = battery * controller;
    }
    @Override
    public double getPower() {
        return battery;
    }
}
