package Entities;

import Constructs.ElementoMultimediale;
import Interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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
     * Riproduce audio, stampando titolo e punti esclamativi per  volume
     */
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    /**
     * Esegue l audio
     */
    @Override
    public void esegui() {
        play();
    }
}
