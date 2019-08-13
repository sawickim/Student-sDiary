import java.util.*;
import java.lang.*;
import java.io.*;
import static java.util.Arrays.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.lang.String;
import java.util.Comparator;
import java.util.ArrayList;

import Klasa.Klasa;
import Uczen.Uczen;
import Nauczyciel.Nauczyciel;
import MyNameComp.MyNameComp;
import MySalaryComp.MySalaryComp;

public class dzienniczek {

    public enum KlasaRodzaj {
        KLASA_FIZ,KLASA_MAT;
    }

    public static void main(String[] args) {

        Map<Nauczyciel,Uczen> map = new HashMap<Nauczyciel, Uczen>();

        System.out.println("Nie posortowane\n");
        map.put(new Nauczyciel("figo fago"),new Uczen("Franek Kimono","Fizyka",5,LocalDate.of(1982,11,1)));
        map.put(new Nauczyciel("Pan Ferdek"),new Uczen("Maly Rys","chemia",5,LocalDate.of(2001,12,12)));
        map.put(new Nauczyciel("Marcjan"), new Uczen("Pan Kargul","Polski",4,LocalDate.of(2005,11,15)));

        Set<Nauczyciel> key4 = map.keySet();
        for(Nauczyciel key:key4){
            System.out.println(key + " ==> "+ map.get(key));

        }

        System.out.println("===================================");
        System.out.println("Posortować według imion nauczycieli\n");
        TreeMap<Nauczyciel,Uczen> tm = new TreeMap<Nauczyciel, Uczen>(new MyNameComp());
        tm.put(new Nauczyciel("Figo fago"), new Uczen("Franek Kimono","Fizyka",5,LocalDate.of(1982,11,1)));
        tm.put(new Nauczyciel("Pan Ferdek"), new Uczen("Maly Rys","chemia",3,LocalDate.of(2001,12,12)));
        tm.put(new Nauczyciel("Marcjan"), new Uczen("Pan Kargul","Polski",4,LocalDate.of(2005,11,15)));

        Set<Nauczyciel> keys = tm.keySet();
        for(Nauczyciel key:keys){
            System.out.println(key+" ==> "+tm.get(key));
        }

        System.out.println("===================================");
        System.out.println("Posortowac wedlug ocen\n");
        //By using salary comparator (int comparison)
        TreeMap<Uczen,Nauczyciel> trmap = new TreeMap<Uczen, Nauczyciel>(new MySalaryComp());
        trmap.put(new Uczen("Franek Kimono","Fizyka",5,LocalDate.of(1982,11,1)), new Nauczyciel("Figo fago"));
        trmap.put(new Uczen("Maly Rys","chemia",3,LocalDate.of(2001,12,12)), new Nauczyciel("Pan Ferdek"));
        trmap.put(new Uczen("Pan Kargul","Polski",4,LocalDate.of(2005,11,15)),new Nauczyciel("Marcjan"));

        Set<Uczen> ks = trmap.keySet();
        for(Uczen key:ks){
            System.out.println(key+" ==> "+trmap.get(key));
        }
        int liczEl = ks.size();
        double srednia = 0;
        for(Uczen key1:ks){
            srednia = srednia + key1.ocena;

        }
        System.out.println("Srednia wynosi " + srednia / liczEl);

        LocalDate startDate = LocalDate.of(2001,2,1);
        LocalDate endDate = LocalDate.of(2010,1,1);

        System.out.println("===================================");
        System.out.println("Kiedy uczniowie dostali oceny\n");
        for(Uczen key2:ks){
            if(startDate.isBefore(key2.localDate) && endDate.isAfter(key2.localDate))
                System.out.println(key2+" "+trmap.get(key2));
        }

        System.out.println(map.toString());



        Set<Klasa> klasa = new HashSet<Klasa>();
        klasa.add(new Klasa("Franek Kimono", "KLASA_FIZ"));
        klasa.add(new Klasa("Maly Rys","KLASA_MAT" ));
        klasa.add(new Klasa("Pan Kargul", "KLASA_MAT"));


        System.out.println(KlasaRodzaj.KLASA_MAT.toString());
        for(Klasa key5:klasa)
            for(Uczen key6: ks)
                if(key5.klasa == KlasaRodzaj.KLASA_MAT.toString() && key5.nazwisko.equals(key6.uczen))
                    System.out.println(key6);

        System.out.println(KlasaRodzaj.KLASA_FIZ.toString());
        for(Klasa key5:klasa)
            for(Uczen key6: ks)
                if(key5.klasa == KlasaRodzaj.KLASA_FIZ.toString() && key5.nazwisko.equals(key6.uczen))
                    System.out.println(key6);

    };
}
