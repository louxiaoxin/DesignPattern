package DesignPattern.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        if (voltage220V == null) {
            return 0;
        }
        System.out.println("使用对象适配器进行适配");
        int src = voltage220V.output220V();
        src /= 44;
        System.out.println("适配完成，输出的电压为" + src + "V");
        return src;
    }
}
