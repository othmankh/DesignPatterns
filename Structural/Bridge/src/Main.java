import Devices.Tv;
import Remotes.RemoteControl;

public class Main {

    public static void main(String [] args) {
        Tv tv = new Tv();

        RemoteControl remoteControl = new RemoteControl(tv);

        remoteControl.channelUp();
        remoteControl.channelUp();
        remoteControl.channelUp();

        System.out.println(tv.getChannel());
        remoteControl.volumeUp();
        System.out.println(tv.getVolume());

    }
}
