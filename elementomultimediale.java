public abstract class elementomultimediale {
    protected String titolo;

public elementomultimediale(String titolo){
    this.titolo = titolo;
}

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "elementomultimediale{" +
                "titolo='" + titolo + '\'' +
                '}';
    }
}
