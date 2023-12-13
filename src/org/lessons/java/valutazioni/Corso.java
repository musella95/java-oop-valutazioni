package org.lessons.java.valutazioni;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Corso {
ArrayList<Studente> listaStudenti = new ArrayList<>();

    public Corso(ArrayList<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    //GETTER E SETTER
    public ArrayList<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(ArrayList<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }
   //METODI
    public void mostraStudenti(){
        for (Studente studente:listaStudenti){
            System.out.println(studente.toString());
        }
    }
    public void aggiungiStudente(Studente studente) {
        listaStudenti.add(studente);
    }
    public void rimuoviStudente(Studente studente) {
        listaStudenti.remove(studente);
    }
    public BigDecimal percentageStudentGraduated(){
        int numberStudentsGraduated= 0;
        for (Studente student: listaStudenti) {
            if (student.promozione()){
                numberStudentsGraduated ++;
            }
        }
        BigDecimal percentage= new BigDecimal(numberStudentsGraduated).divide(new BigDecimal(listaStudenti.size()),2, RoundingMode.HALF_DOWN);
        percentage= percentage.multiply(BigDecimal.valueOf(100));
        return percentage;
    }
}
