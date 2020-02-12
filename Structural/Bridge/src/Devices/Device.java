package Devices;

public abstract class Device {

    protected int volume;
    protected int channel;
    protected boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public int getVolume() {
        return volume;
    }

    public abstract void setVolume(int percent);

    public int getChannel() {
        return channel;
    }

    public abstract void setChannel(int channel);
}
