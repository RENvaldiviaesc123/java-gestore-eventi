package org.java.lessons.eventi;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. Creare una classe Main di test, in cui si chiede all’utente di inserire un nuovo evento con tutti i parametri.
            //Creiamo l'evento:
                //Inizializzamo le prenotazioni in 0
                    int postiPrenotati = 0;
                    Evento eventoUno= null;
                    do {
                        try {
                            System.out.println("Inserisca il nome dell'evento: ");
                            String nomeEvento = scan.nextLine();
                            //Chiediamo la data e la controlliamo
                            System.out.println("Inserisca la data dell'evento: formato yyyy-mm-dd ");
                            LocalDate dataEvento = null;
                            dataEvento = LocalDate.parse(scan.nextLine());
                            //Chiediamo i posti disponibili e controlliamo sia un numero positivo:
                            System.out.println("Quanti saranno i posti disponibili? ");
                            int postiDisponibili = scan.nextInt();
                            eventoUno = new Evento(nomeEvento, dataEvento, postiDisponibili, postiPrenotati);
                            //Facciamo i controlli della data e il numero
                            } catch (DateTimeException de) {
                                System.out.println("Formato della data non valido");
                            } catch (NumberFormatException ne) {
                            System.out.println("Formato del numero non valido");
                            } catch (Exception e) {
                            System.out.println("Generic error!");
                            }
                    } while (eventoUno == null);
                //Stampiamo l'evento
                System.out.println(eventoUno);

                //Proviamo a fare una prenotazione
                System.out.println("Quanti posti vuole prenotare? " );
                int numSeats = scan.nextInt();
                eventoUno.addBookings(numSeats);
                System.out.println("Posti rimasti: " + eventoUno.getAvailableSeats());

                //Proviamo a fare una cancellazione di prenotazione
                System.out.println("Quante prenotazioni vuole disdire? ");
                int postiDaDisdire = scan.nextInt();
                eventoUno.desdiciPosti(postiDaDisdire);
                System.out.println("Numero aggiornato di prenotazioni: " + eventoUno.getAvailableSeats());

                //Stampiamo il numero totale di prenotazioni e posti disponibili
                System.out.println("Posti Disponibili: " + eventoUno.getAvailableSeats());
                System.out.println("Posti prenotati: " + eventoUno.getNumeroPostiPrenotati());















    }
}
