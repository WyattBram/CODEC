public class Video extends Media implements IImageStandard, IAudioStandard{
    private String imageCodec;
    private String audioCodec;

    Video(String name, String imageCodec, String audioCodec){
        super(name);
        this.audioCodec = audioCodec;
        this.imageCodec = imageCodec;
    }
    @Override
    public String getImageCodec() {
        return "Image codec: " + imageCodec;
    }
    @Override
    public String getAudioCodec() {
        return "Audio codec: " + audioCodec;
    }
    @Override
    public String getMediaInfo() {
        return "Video ID: " + getId() +"\n" +
                "Video name: " + getFileName() +"\n" +
                getImageCodec() +"\n" +
                getAudioCodec() + "\n";
    }
}
