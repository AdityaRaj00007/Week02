package com.tit.week02.day05.singlelevelinheritance.smarthomesystem;

public class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ",\nStatus: " + status);
    }
}
