package player;

public class Image extends MediaElement {
	protected int luminosity;

	public Image(String title) {
		 setTitle(title);
	        this.luminosity = luminosity;

	}
	
	
	public void show() {
System.out.println("Mostro immagine: "); 

String luminosityStr = "*".repeat(luminosity);
System.out.println(getTitle() + " " + luminosityStr);
System.out.println();
    }
	
	 public void aumentaLuminosita(int al) {
	    	for (int i = 0; i < al; i++) {             
	           
	            luminosity++;
	        }
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
