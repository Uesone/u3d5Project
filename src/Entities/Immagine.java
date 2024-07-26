package Entities;
import Constructs.ElementoMultimediale;

/**
 * Rappresenta un'immagine con un titolo e una luminosità regolabile.
 */
public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    /**
     * Aumenta la luminosità
     */
    public void aumentaLuminosita() {
        luminosita++;
    }

    /**
     * Diminuisce la luminosità
     */
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    /**
     * Mostra l'immagine con il titolo e una serie di asterischi rappresentanti il livello di luminosità.
     */
    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }
}