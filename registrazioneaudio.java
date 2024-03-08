import interfacce.player;
import interfacce.volume;

public class registrazioneaudio extends elementomultimediale implements player, volume{
    public int durata;
    public int volume;

    public registrazioneaudio(String titolo) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void play() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
