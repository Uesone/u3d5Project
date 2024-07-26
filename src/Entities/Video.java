package Entities;

import Constructs.ElementoMultimediale;
import Interfaces.Riproducibile;


public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    /**
     * Abbassa il volume
     */
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    /**
     * Alza il volume
     */
    public void alzaVolume() {
        volume++;
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
     * Riproduce il video
     */
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    /**
     * Esegue il video
     */
    @Override
    public void esegui() {
        play();
    }
}
