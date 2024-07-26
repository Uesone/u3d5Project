package Main;

import java.util.Scanner;
import Constructs.ElementoMultimediale;
import Entities.Immagine;
import Entities.RegistrazioneAudio;
import Entities.Video;


public class LettoreMultimediale {
    private ElementoMultimediale[] elementi = new ElementoMultimediale[5];

    public void esegui() {
        Scanner scanner = new Scanner(System.in);

        // Creazione dei 5 elementi multimediali
        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Creazione elemento " + (i + 1) + ":");
            System.out.println("Scegli il tipo (1=Immagine, 2=Audio, 3=Video): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1: // Immagine
                    System.out.print("Inserisci la luminosità: ");
                    int luminosita = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;

                case 2: // Registrazione Audio
                    System.out.print("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.print("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;

                case 3: // Video
                    System.out.print("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.print("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.print("Inserisci la luminosità: ");
                    int luminositaVideo = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;

                default:
                    System.out.println("non valido!");
                    i--;
                    break;
            }
        }


        while (true) {
            System.out.println("Quale elemento vuoi eseguire? (1-5, 0 per uscire): ");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                break;
            }

            if (scelta < 1 || scelta > 5) {
                System.out.println(" non valio!");
                continue;
            }


            elementi[scelta - 1].esegui();
        }

        scanner.close();
    }

    public static void main(String[] args) {
        LettoreMultimediale lettore = new LettoreMultimediale();
        lettore.esegui();
    }
}
