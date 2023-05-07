package player;

public class Image extends MediaElement {
	protected int luminosity;

	public Image(String title) {
		 setTitle(title);
	        this.luminosity = luminosity;

	}
	
	
	public void show() {
		System.out.println(getTitle());
        for (int j = 0; j < luminosity; j++) {
            System.out.print("*");
        }
    }
	
	 public void aumentaLuminosita() {
	        luminosity++;
	    }
	 
	 public void diminuisciLuminosita() {
	        if(luminosity > 0) {
	        	luminosity--;
	        }
	    }


	public void setLuminosity(int i) {
		// TODO Auto-generated method stub
		
	}
	 
	 
}
