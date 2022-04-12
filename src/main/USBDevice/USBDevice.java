package main.USBDevice;

public interface USBDevice {
    boolean connect ();
    boolean disconnect();
    String getName();

    void remove(USBDevice usbDevice);
}
