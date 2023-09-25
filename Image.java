public class Image extends Media implements IImageStandard{
    private String imageCodec;

    Image(String name, String imageCodec){
        super(name);
        this.imageCodec = imageCodec;
    }



    @Override
    public String getImageCodec() {
        return "Image codec: " + imageCodec;
    }

    @Override
    public String getMediaInfo() {
        return "Image ID: " + getId() +"\n" +
        "Image name: " + getFileName() +"\n" +
        getImageCodec() + "\n";
    }
}
