package player;

public class Video extends Audio implements Playable {
private int duration;
    
    public Video(String title, int duration) {
        super(title, duration);
        this.duration = duration;
    }
    
    public void play() {
        for (int i = 0; i < duration; i++) {
        	System.out.println(title);
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            
            for (int j = 0; j < luminosity; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void aumentaLuminosita() {
        luminosity++;
    }
    
    public void diminuisciLuminosita() {
        if (luminosity > 0) {
            luminosity--;
        }
    }

	public void setLuminosity(int i) {
		// TODO Auto-generated method stub
		
	}
}
