import interfacce.player;
import interfacce.volume;

public class registrazioneaudio extends elementomultimediale implements player, volume{
    public int durata;
    public int volume;

    public registrazioneaudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void play() {
        for(int i=0; i<durata; i++){
            System.out.println(getTitolo());
        }
        for(int i=0; i<volume; i++){
            System.out.println("!");
        }

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
