package Nauczyciel;

public class Nauczyciel {
    public String nauczyciel;

    public Nauczyciel(String nauczyciel){
        this.nauczyciel = nauczyciel;
    }

    public String getNauczyciel() {
        return nauczyciel;
    }

    public void setNauczyciel(String nauczyciel) {
        this.nauczyciel = nauczyciel;
    }

    @Override
    public String toString() {
        return this.nauczyciel;
    }
}
