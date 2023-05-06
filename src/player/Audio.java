package player;

public class Audio extends MediaElement implements Playable {
	int duration;
    protected int volume;

	public Audio(String titleAudio, int duration) {
		super(title);
        this.duration = duration;
	}
	@Override
	public void play() {
		 for (int i = 0; i < duration; i++) {
			 System.out.println(title);
	            for (int j = 0; j < volume; j++) {
	                System.out.print("!");
	            }
	        }
		
	}
	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void alzaVolume() {
		
            volume++;
        
    }
    
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
}
	public void setVolume(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setDuration(int duration2) {
		// TODO Auto-generated method stub
		
	}
    }
