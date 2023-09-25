public class Music extends Media implements IAudioStandard{
    private String audioCodec;

    Music(String name, String audioCodec){
        super(name);
        this.audioCodec = audioCodec;
    }

    @Override
    public String getAudioCodec() {
        return "Audio codec: " + audioCodec;
    }

    @Override
    public String getMediaInfo() {
        return  "Music ID: " + getId() +"\n" +
                "Music name: " + getFileName() +"\n" +
                getAudioCodec() + "\n";
    }
}
