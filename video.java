import interfacce.player;
import interfacce.volume;
import interfacce.luminosita;
public class video extends elementomultimediale implements player, volume, luminosita {
    public int durata;
    public int volume;
    public int luminosita;
    public video(String titolo) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
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

    @Override
    public void alzaLuminosita() {

    }

    @Override
    public void abbassaluminosita() {

    }
}
