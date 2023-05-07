package player;

public abstract class MediaElement {
    protected static String title;
    
  
    
    public MediaElement(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
}

