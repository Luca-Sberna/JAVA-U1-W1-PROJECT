package player;

public abstract class MediaElement {
    protected static String title;
    protected int luminosity;
  
    
    public MediaElement(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
}

