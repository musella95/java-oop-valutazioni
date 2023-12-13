package org.lessons.java.valutazioni;

public class Studente {
    //ATTRIBUTI
    private int id;
    private static int conteggio = 0;
    private int percentualeAssenze;
    private double mediaVoti;
    //COSTRUCTOR

    public Studente(int percentualeAssenze, double mediaVoti) {
        this.id = conteggio++;
        this.percentualeAssenze = percentualeAssenze;
        this.mediaVoti = mediaVoti;
    }
    // GETTER E SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPercentualeAssenze() {
        return percentualeAssenze;
    }

    public void setPercentualeAssenze(int percentualeAssenze) {
        this.percentualeAssenze = percentualeAssenze;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }

    //METODI
    public boolean promozione() {
        if (percentualeAssenze > 50) {
            return false;
        } else if (percentualeAssenze >= 25 && mediaVoti > 2) {
            return true;
        } else if (percentualeAssenze < 25 && mediaVoti >= 2) {
            return true;
        }else
       return false;
    }

    @Override
    public String toString() {
        return  "studente numero "+ id+
                "media voto"+ mediaVoti+
                "percentuale assenze "+ percentualeAssenze +
                "promosso "+ (promozione()? "si": "no");
    }
}