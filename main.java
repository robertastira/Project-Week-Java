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
            System.out.println("Inserisci il titolo dell'immagine: ");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la luminosita dell'immagine: ");
            int luminosita = scanner.nextInt();
            scanner.nextLine();
            arrayOggetti[i] = new immagine(titolo, luminosita);
        }

        for (int i = 2; i < 4; i++) {
            System.out.println("Inserisci il titolo del video: ");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata del video: ");
            int durata = scanner.nextInt();
            System.out.println("Inserisci la luminosita del video: ");
            int luminosita = scanner.nextInt();
            System.out.println("Inserisci il volume del video: ");
            int volume = scanner.nextInt();
            scanner.nextLine();
            arrayOggetti[i] = new video(titolo, volume, durata, luminosita);
        }

        for (int i = 4; i < 5; i++) {
            System.out.println("Inserisci il titolo della registrazione audio: ");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata della registrazione audio: ");
            int durata = scanner.nextInt();
            System.out.println("Inserisci il volume della registrazione audio: ");
            int volume = scanner.nextInt();
            scanner.nextLine();
            arrayOggetti[i] = new registrazioneaudio(titolo, volume, durata);
        }

        //Ciclo switch per far visualizzare un elemento, piuttosto che un altro.
        //Non so se il while sia necessario, ma è per dirgli di continuare il ciclo finché non si clicca lo 0.
        int input;

        do {
            System.out.println("Inserisci un numero (0 per uscire): ");
            input = scanner.nextInt();

            switch (input) {
                case 0:
                    System.out.println("Uscita dal ciclo.");
                    break;
                case 1:
                    System.out.println("Elemento selezionato: " + arrayOggetti[0]);
                    break;
                case 2:
                    System.out.println("Elemento selezionato: " + arrayOggetti[1]);
                    break;
                case 3:
                    System.out.println("Elemento selezionato: " + arrayOggetti[2]);
                    break;
                case 4:
                    System.out.println("Elemento selezionato: " + arrayOggetti[3]);
                    break;
                case 5:
                    System.out.println("Elemento selezionato: " + arrayOggetti[4]);
                    break;
                default:
                    System.out.println("Input non valido. Riprova.");
            }
        } while (input != 0);




        scanner.close();



    }
}
