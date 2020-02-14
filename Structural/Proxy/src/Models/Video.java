package Models;

public class Video {

    private long id;

    private byte[] data;

    private String info;

    public Video(long id, byte[] data, String info) {
        this.id = id;
        this.data = data;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public byte[] getData() {
        return data;
    }

    public String getInfo() {
        return info;
    }
}
