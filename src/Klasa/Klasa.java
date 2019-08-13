package Klasa;

public class Klasa {
    public String nazwisko;
    public String klasa;

    public Klasa( String nazwisko, String klasa){
        this.nazwisko = nazwisko;
        this.klasa = klasa;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return nazwisko + " " + klasa;
    }
}
