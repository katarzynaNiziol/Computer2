package main;

import main.USBDevice.USBDevice;
import main.drive.Drive;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    private List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {

        this.monitor = monitor;
        this.drive = drive;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice) {
        boolean isConnected = usbDevice.connect();

        if (isConnected) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnect();
            usbDevices.remove(usbDevice);
        }
    }