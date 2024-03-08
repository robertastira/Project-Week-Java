public class main {

    public static void main(String[] args){

        video harryPotter = new video("Harry Potter e la Pietra Filosofale", 2,5,20);
        registrazioneaudio inTheShadows = new registrazioneaudio("In the shadows - The Rasmus", 5,5);
        immagine laGioconda = new immagine("La Gioconda di Da Vinci", 5);
        //harryPotter.play();
        //inTheShadows.play();
        harryPotter.abbassaVolume();
        harryPotter.play();
        harryPotter.alzaVolume();
        harryPotter.play();
        laGioconda.Show();



    }
}
