package MySalaryComp;

import java.util.Comparator;
import Uczen.Uczen;


public class MySalaryComp implements Comparator<Uczen>{
    @Override
    public int compare(Uczen e1, Uczen e2) {
        if(e1.getocena() > e2.getocena()){
            return 1;
        } else {
            return -1;
        }
    }
}
