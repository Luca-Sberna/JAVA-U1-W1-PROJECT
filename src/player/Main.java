
package player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        MediaElement[] elements = new MediaElement[5];
        System.out.println("Crea 5 elementi");
        System.out.println();

        for (int i = 0; i < elements.length; i++) {
            System.out.println("Inserisci il titolo dell'elemento " + (i + 1) + ":");
            String title = scanner.next();
            System.out.println("Seleziona il tipo di elemento (1 = audio, 2 = video, 3 = immagine):");
            int type = scanner.nextInt();
            scanner.nextLine();
            
            switch (type) {
                case 1:
                    System.out.println("Inserisci la durata dell'audio:");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    elements[i] = new Audio(title, duration);
                    break;
                case 2:
                    System.out.println("Inserisci la durata del video:");
                    duration = scanner.nextInt();
                    scanner.nextLine();
				int luminosity = 0;
				int volume = 0;
				elements[i] = new Video(title, duration,luminosity,volume);
                    break;
                case 3:
                    elements[i] = new Image(title);
                    break;
                default:
                    System.out.println("Tipo non valido.");
                    i--;
                    break;
            }
        }
        scanner.nextLine();

        int choice = -1;
        while (choice != 0) {
            System.out.println("Seleziona un elemento da riprodurre (1 - " + elements.length + ", 0 per uscire):");
            choice = scanner.nextInt();
           
            if (choice >= 1 && choice <= elements.length) {
                MediaElement element = elements[choice - 1];
                System.out.println("Elemento selezionato = " +"elemento numero:" + choice + " " + "nome:" + element.getTitle() );
                
                
                if (element instanceof Audio) {
                    MediaElement playableElement = (Audio) element;
                    int volume = -1;
                    while (volume < 0 || volume > 10) {
                    	System.out.println("Regola il volume per riprodurre (valori da 0 a 10, -1 per uscire):");
                        volume = scanner.nextInt();
                        scanner.nextLine();
                        if (volume >= 0 && volume <= 10) {
                            ((Audio) playableElement).alzaVolume(volume);                           
                            System.out.println();
                            ((Audio) playableElement).play();
                        } else if (volume != -1) {
                            System.out.println("Valore non valido.");
                        }
                    }
                    
                    
                } else if (element instanceof Image) {
                    Image imageElement = (Image) element;
                    int luminosity = -1;
                    while (luminosity < 0 || luminosity > 10) {
                        System.out.println("Regola la luminosità per guardare l'immagine (valori da 0 a 10, -1 per uscire):");
                        luminosity = scanner.nextInt();
                        scanner.nextLine();
                        if (luminosity >= 0 && luminosity <= 10) {
                            ((Image)imageElement).aumentaLuminosita(luminosity);   
                            System.out.println();                                               
                            ((Image)imageElement).show();
                        } else if (luminosity != -1) {
                            System.out.println("Valore non valido.");
                        }
                    }
                

                } else if(element instanceof Video){
                    MediaElement videoElement = (Video) element;
                    int volume = -1;
                    int luminosity = -1;
                    while (luminosity < 0 || luminosity > 10 && volume < 0 || volume > 10) {
                        System.out.println("Regola prima il volume per continuare con i settaggi del video (valori da 0 a 10, -1 per uscire):");
                        volume = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ora regola la luminosità per riprodurre il video (valori da 0 a 10, -1 per uscire):");
                        luminosity = scanner.nextInt();
                        scanner.nextLine();
                        if (luminosity >= 0 && luminosity <= 10 && volume >= 0 && volume <= 10) {
                            ((Video) videoElement).aumentaLuminosita(luminosity);
                            ((Video) videoElement).alzaVolume(volume);
                            ((Video) videoElement).play();
                            System.out.println();
                           
                        } else if (luminosity != -1 && volume != -1) {
                            System.out.println("Valore non valido.");
                        }
                    }
                }
            } else if (choice != 0) {
                System.out.println("Scelta non valida.");
            }
        }
        
        System.out.println("Fine.");
        scanner.close();
    }
}