package com.tit.week02.day05.singlelevelinheritance.smarthomesystem;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("xx123", "Active", 24);
        thermostat.displayStatus();
    }
}
