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
        controllaData(data);
        controllaPostiTotali(numeroPostiTotale);
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
                controllaData(data);
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
            private void controllaData (LocalDate data) {
                if (data.isBefore(LocalDate.now())) {
                    throw  new RuntimeException("La data deve essere uguale o posteriore alla data odierna!");
                } else if (data == null) {
                    throw new RuntimeException("Inserisca una data!");
                }
            }

        //Metodo per il controllo del numero dei posti in totale sia positivo
            private void controllaPostiTotali (int numeroPostiTotale) {
                if (numeroPostiTotale < 0) {
                    throw new RuntimeException("Inserisca un numero positivo oppure maggiore di 0!");
                }
            }

        //Metodo per la prenotazione dei posti (Public)
            //aggiunge un certo numero di posti prenotati. Se l’evento è già passato o non ha posti disponibili deve sollevare un’eccezione.
                public  int prenotaPosti (int numeroPostiTotale, int numeroPostiPrenotati) {
                    int postiDaPrenotare =0;
                    if (postiDaPrenotare < numeroPostiTotale && data.isAfter(LocalDate.now())) {
                        numeroPostiPrenotati += postiDaPrenotare;
                        numeroPostiTotale -= postiDaPrenotare;

                    } else if (data.isBefore(LocalDate.now())) {
                        throw new RuntimeException("Inserisca una data valida!");
                    }
                    else if (postiDaPrenotare > numeroPostiTotale) {
                        throw new RuntimeException("Inserisca un numero minore di: " + numeroPostiTotale);
                    }
                    return postiDaPrenotare;
                }
        //Metodo per la disdetta della prenotazione dei posti (Public)
            //riduce di un certo numero i posti prenotati. Se l’evento è già passato o non ci sono prenotazioni deve sollevare un’eccezione.
                public int desdiciPosti () {
                    int postiDadisdire = 0;
                    if (postiDadisdire < numeroPostiPrenotati && data.isAfter(LocalDate.now())) {
                        numeroPostiPrenotati -= postiDadisdire;
                        numeroPostiTotale += postiDadisdire;
                    } else if (data.isBefore(LocalDate.now())) {
                        throw new RuntimeException("Inserisca una data valida!");
                    } else if (postiDadisdire > numeroPostiPrenotati) {
                        throw new RuntimeException("Inserisca un numero minore di: " + numeroPostiPrenotati);
                    } return desdiciPosti();
                }
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
