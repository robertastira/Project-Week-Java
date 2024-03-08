import java.util.Scanner;

public class main {

    public static void main(String[] args){

        video harryPotter = new video("Harry Potter e la Pietra Filosofale", 2,5,8);
        registrazioneaudio inTheShadows = new registrazioneaudio("In the shadows - The Rasmus", 5,5);
        immagine laGioconda = new immagine("La Gioconda di Da Vinci", 5);
        //harryPotter.play();
        //inTheShadows.play();
        //harryPotter.abbassaVolume();
        //harryPotter.play();
        //harryPotter.alzaVolume();
        //harryPotter.play();
        laGioconda.Show();
        laGioconda.abbassaluminosita();
        laGioconda.abbassaluminosita();
        laGioconda.Show();
        Scanner scanner = new Scanner(System.in);
        elementomultimediale[] arrayOggetti = new elementomultimediale[5];

        for (int i = 0; i < 2; i++) {
            System.out.println("Inserisci il titolo dell'immagine " + (i + 1) + ":");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la luminosita dell'immagine " + (i + 1) + ":");
            int luminosita = scanner.nextInt();
            scanner.nextLine();
            arrayOggetti[i] = new immagine(titolo, luminosita);
        }

        for (int i = 2; i < 4; i++) {
            System.out.println("Inserisci il titolo del video " + (i - 1) + ":");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata del video " + (i - 1) + ":");
            int durata = scanner.nextInt();
            System.out.println("Inserisci la luminosita del video " + (i - 1) + ":");
            int luminosita = scanner.nextInt();
            System.out.println("Inserisci il volume del video " + (i - 1) + ":");
            int volume = scanner.nextInt();
            scanner.nextLine();
            arrayOggetti[i] = new video(titolo, volume, durata, luminosita);
        }

        for (int i = 4; i < 5; i++) {
            System.out.println("Inserisci il titolo della registrazione audio:");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata della registrazione audio:");
            int durata = scanner.nextInt();
            System.out.println("Inserisci il volume della registrazione audio:");
            int volume = scanner.nextInt();
            scanner.nextLine();
            arrayOggetti[i] = new registrazioneaudio(titolo, volume, durata);
        }

        // Stampa dei media inseriti
        System.out.println("\nMedia inseriti:");
        for (elementomultimediale media : arrayOggetti) {
            System.out.println(media);
        }

        scanner.close();



    }
}
