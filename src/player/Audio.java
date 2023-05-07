package player;

public class Audio extends MediaElement implements Playable {
	int duration;
    protected int volume;

	public Audio(String title, int duration) {
		setTitle(title);
        this.duration = duration;
	}
	
	public void play() {
		 for (int i = 0; i < duration; i++) {
			 String puntoEsclamativo = "!".repeat(volume);
			 
			 System.out.println(getTitle() + " " + puntoEsclamativo);
//	            for (int j = 0; j < volume; j++) {
//	            	if(j != volume -1) {
//	            		System.out.print("!");	            		
//	            	}else {
//	            		System.out.println("!");
//	            	}
	            }
	        }
		
	
	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void alzaVolume(int av) {
		 for (int i = 0; i < av; i++) {             
             volume++;
         }
           
        
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
	@Override
	public void alzaVolume() {
		// TODO Auto-generated method stub
		
	}
    }
