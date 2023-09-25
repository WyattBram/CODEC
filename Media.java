public abstract class Media {
    private String fileName;
    private int id;
    private static int nextId = 1;

    Media(){
        id = nextId;
        nextId++;

    }

    Media(String s){
        id = nextId;
        nextId++;
        fileName = s;

    }

    public int getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }
}
