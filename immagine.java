import interfacce.luminosita;

public class immagine extends elementomultimediale implements luminosita{
    public int luminosita;
    public immagine(String titolo,int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
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
        return "immagine{" +
                "luminosita=" + luminosita +
                ", titolo='" + titolo + '\'' +
                '}';
    }

    public void Show(){
        System.out.println(getTitolo());
        for (int i=0; i<luminosita; i++){
            System.out.println("#");
        }

    }
}
