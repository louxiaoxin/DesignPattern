package DesignPattern.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        src /= 44;
        return src;
    }
}
