package External;

import Models.Video;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public List<Video> listVideos() {
        return new ArrayList<>();
    }

    @Override
    public String getVideoInfo(int id) {
        return "Test Info";
    }

    @Override
    public Video downloadVideo(int id) {
        return new Video(1, new byte[] {}, "test");
    }

}
