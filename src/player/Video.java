package player;

public class Video extends MediaElement implements Playable {
private int duration;
protected int luminosity;
protected int volume;
    public Video(String title, int duration,int luminosity,int volume) {
        setTitle(title);
        this.luminosity = luminosity;
        this.duration = duration;
        this.volume = volume;
    }
    
    public void play() {
        for (int i = 0; i < duration; i++) {
        	System.out.print(getTitle());
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < luminosity; k++) {
            	System.out.print("*");
            }
            System.out.println();
           
        }
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void aumentaLuminosita(int al) {
    	for (int i = 0; i < al; i++) {             
           
            luminosity++;
        }
    }
    
    public void diminuisciLuminosita() {
        if (luminosity > 0) {
            luminosity--;
        }
    }

	public void setLuminosity(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alzaVolume(int av) {
		for (int i = 0; i < av; i++) {             
            volume++;
        }
          
		
	}

	@Override
	public void abbassaVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alzaVolume() {
		// TODO Auto-generated method stub
		
	}

}
