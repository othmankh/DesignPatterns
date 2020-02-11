package Devices;

public class Tv extends Device {

    @Override
    public void setVolume(int percent) {
        if(percent > 100 || percent < 0) {
            return;
        }

        volume = percent;
    }

    @Override
    public void setChannel(int channel) {
        if(channel < 0) {
            return;
        }

        this.channel = channel;
    }
}
