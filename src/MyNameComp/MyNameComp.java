package MyNameComp;

import java.util.Comparator;
import Nauczyciel.Nauczyciel;

public class MyNameComp implements Comparator<Nauczyciel>{

    @Override
    public int compare(Nauczyciel e1, Nauczyciel e2) {
        return e1.getNauczyciel().compareTo(e2.getNauczyciel());
    }
}
