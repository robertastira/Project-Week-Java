import interfacce.luminosita;

public class immagine extends elementomultimediale implements luminosita{
    public int luminosita;
    public immagine(String titolo) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void alzaLuminosita() {

    }

    @Override
    public void abbassaluminosita() {

    }

    public void show(){}
}
