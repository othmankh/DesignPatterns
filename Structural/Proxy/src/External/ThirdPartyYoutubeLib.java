package External;

import Models.Video;

import java.util.List;

public interface ThirdPartyYoutubeLib {
    List<Video> listVideos();

    String getVideoInfo(int id);

    Video downloadVideo(int id);
}
