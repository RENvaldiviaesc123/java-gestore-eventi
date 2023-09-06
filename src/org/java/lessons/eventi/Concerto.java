package org.java.lessons.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento{
    /*
    _Aggiungere questi attributi nel costruttore e implementarne getter e setter Aggiungere i metodi per
    restituire data e ora formattata e prezzo formattato (##,##€).
    _Fare l’ override del metodo toString() in modo che venga restituita una stringa del tipo: data e ora
    formattata - titolo - prezzo formattato.
    */

    //ATTRIBUTI
    private LocalTime ora;
    private BigDecimal prezzo;


    //COSTRUTTORI

    public Concerto(String titolo, LocalDate data, int numeroPostiTotale, int numeroPostiPrenotati, LocalTime ora, BigDecimal prezzo) {
        super(titolo, data, numeroPostiTotale, numeroPostiPrenotati);
        this.ora = ora;
        this.prezzo = prezzo;
    }


    //GETTER E SETTER
        //Getter
        public LocalTime getOra() {
            return ora;
        }
        public void setOra(LocalTime ora) {
            this.ora = ora;
        }

        //Setter
        public BigDecimal getPrezzo() {
            return prezzo;
        }
        public void setPrezzo(BigDecimal prezzo) {
            this.prezzo = prezzo;
        }


    //METODI
        //Metodo per restituire data e ora fomattata
        public String getFormatDate() {
            DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return getData().format(formatData);
        }

        public String getFormatTime() {
            DateTimeFormatter formatOra = DateTimeFormatter.ofPattern("HH:mm");
            return ora.format(formatOra);
        }

        //Metodo per resituire prezzo formattato(##,##€)
        public String formatPrice () {
            return prezzo.toString() + "€";
        }


        //Metodo toString
        @Override
        public String toString() {
            return "Concerto{" +
                    "Data: "+ super.getData() +
                    ", ora=" + ora +
                    ", Titolo :" + super.getTitolo() +
                    ", prezzo=" + prezzo +
                    "} ";
        }
}
