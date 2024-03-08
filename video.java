import interfacce.player;
import interfacce.volume;
import interfacce.luminosita;
public class video extends elementomultimediale implements player, volume, luminosita {
    public int durata;
    public int volume;
    public int luminosita;
    public video(String titolo, int durata,int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }


    @Override
    public void play() {
        for(int i=0; i<durata; i++){
            System.out.println(getTitolo());
        }
        for(int i=0; i<volume; i++){
            System.out.println("!");
        }
        for (int i=0; i<luminosita; i++){
            System.out.println("#");
        }

    }

    @Override
    public void alzaVolume() {
            volume++;

    }

    @Override
    public void abbassaVolume() {
            volume--;


    }

    @Override
    public void alzaLuminosita() {
        luminosita++;

    }

    @Override
    public void abbassaluminosita() {
        luminosita--;

    }

    @Override
    public String toString() {
        return "video{" +
                "durata=" + durata +
                ", volume=" + volume +
                ", luminosita=" + luminosita +
                ", titolo='" + titolo + '\'' +
                '}';
    }
}
