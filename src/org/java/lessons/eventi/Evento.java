package org.java.lessons.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Evento {
    //ATTRIBUTI
        private String titolo;
        private LocalDate data;
        private int numeroPostiTotale;
        private int numeroPostiPrenotati = 0;

    //COSTRUTTORI

    public Evento(String titolo, LocalDate data, int numeroPostiTotale, int numeroPostiPrenotati) {
        this.titolo = titolo;
        this.data = data;
        this.numeroPostiTotale = numeroPostiTotale;
        this.numeroPostiPrenotati = numeroPostiPrenotati;
    }

    //GETTER E SETTER
        //Getter e Setter per i titoli e per le date
            public String getTitolo() {
                return titolo;
            }
            public void setTitolo(String titolo) {
                this.titolo = titolo;
            }
            public LocalDate getData() {
                return data;
            }
            public void setData(LocalDate data) {
                this.data = data;
            }

        //Il numero di posti disponibili e il numero di posti prenotati solo in lettura
            public int getNumeroPostiTotale() {
                return numeroPostiTotale;
            }

            public int getNumeroPostiPrenotati() {
                return numeroPostiPrenotati;
            }


    //METODI
        //Metodo per il controllo della data inserita


        //Metodo per il controllo del numero dei posti in totale sia positivo


        //Metodo per la prenotazione dei posti (Public)


        //Metodo per la disdetta della prenotazione dei posti (Public)


        //Override del metodo toString (Public)
            @Override
            public String toString() {
                return "Evento{" +
                        "titolo='" + titolo + '\'' +
                        ", data=" + data +
                        ", numeroPostiTotale=" + numeroPostiTotale +
                        ", numeroPostiPrenotati=" + numeroPostiPrenotati +
                        '}';
            }
}
