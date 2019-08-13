package Uczen;

import java.time.LocalDate;



public class Uczen {
    public String uczen;
    public String przedmiot;
    public double ocena;
    public LocalDate localDate;



    public Uczen(String uczen, String przedmiot, double ocena, LocalDate localDate){
        this.uczen = uczen;
        this.przedmiot = przedmiot;
        this.ocena = ocena;
        this.localDate = localDate;

    }

    public String getUczen(){return uczen;}

    public void setUczen(String uczen) {
        this.uczen = uczen;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getocena() {
        return ocena;
    }
    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return uczen + " " + przedmiot + " " + String.valueOf(ocena) +" " + localDate;//;
    }
}
