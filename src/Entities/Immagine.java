package Entities;
import Constructs.ElementoMultimediale;





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

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }

    /**
     * Esegue l'immagine
     */
    @Override
    public void esegui() {
        show();
    }
}
