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
            String title = scanner.nextLine();
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
                    elements[i] = new Video(title, duration);
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
        
        int choice = -1;
        while (choice != 0) {
            System.out.println("Seleziona un elemento da riprodurre (1-" + elements.length + ", 0 per uscire):");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice >= 1 && choice <= elements.length) {
                MediaElement element = elements[choice - 1];
                if (element instanceof Playable) {
                    Playable playableElement = (Playable) element;
                    System.out.println("Regola il volume (valori da 0 a 10, -1 per uscire):");
                    int volume = -1;
                    while (volume < 0 || volume > 10) {
                        volume = scanner.nextInt();
                        scanner.nextLine();
                        if (volume >= 0 && volume <= 10) {
                            playableElement.alzaVolume();
                            for (int i = 0; i < volume; i++) {
                                System.out.print("!");
                            }
                            System.out.println();
                            playableElement.play();
                        } else if (volume != -1) {
                            System.out.println("Valore non valido.");
                        }
                    }
                } else if (element instanceof Image) {
                    Image imageElement = (Image) element;
                    System.out.println("Regola la luminosità (valori da 0 a 10, -1 per uscire):");
                    int luminosity = -1;
                    while (luminosity < 0 || luminosity > 10) {
                        luminosity = scanner.nextInt();
                        scanner.nextLine();
                        if (luminosity >= 0 && luminosity <= 10) {
                            imageElement.aumentaLuminosita();
                            for (int i = 0; i < luminosity; i++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            imageElement.show();
                        } else if (luminosity != -1) {
                            System.out.println("Valore non valido.");
                        }
                    }
                } else {
                    System.out.println("Elemento non riproducibile.");
                }
            } else if (choice != 0) {
                System.out.println("Scelta non valida.");
            }
        }
        
        System.out.println("Fine.");
        scanner.close();
    }
}