package org.java.lessons.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. Creare una classe Main di test, in cui si chiede all’utente di inserire un nuovo evento con tutti i parametri.
            //Creiamo l'evento:
                //Inizializzamo le prenotazioni in 0
                int postiPrenotati = 0;
                System.out.println("Inserisca il nome dell'evento: ");
                String nomeEvento = scan.nextLine();
                //Chiediamo la data e la controlliamo
                System.out.println("Inserisca la data dell'evento: formato yyyy-mm-dd ");
                LocalDate dataEvento = null;
                try {
                    dataEvento = LocalDate.parse(scan.nextLine());
                } catch (Exception e) {
                    System.out.println("Formato della data non valido!");
                }
                //Chiediamo i posti disponibili e controlliamo sia un numero positivo:
                System.out.println("Quanti saranno i posti disponibili? ");
                int postiDisponibili = scan.nextInt();
                Evento eventoUno = new Evento(nomeEvento, dataEvento, postiDisponibili, postiPrenotati);
                //Stampiamo l'evento
                System.out.println(eventoUno);
        //2. Dopo che l’evento è stato istanziato, chiedere all’utente se e quante prenotazioni vuole fare e provare ad effettuarle, implementando opportuni controlli e gestendo eventuali eccezioni.
        //3. Stampare a video il numero di posti prenotati e quelli disponibili
        //4. Chiedere all’utente se e quanti posti vuole disdire
        //5. Provare ad effettuare le disdette, implementando opportuni controlli e gestendo eventuali eccezioni
        //6. Stampare a video il numero di posti prenotati e quelli disponibili














    }
}
