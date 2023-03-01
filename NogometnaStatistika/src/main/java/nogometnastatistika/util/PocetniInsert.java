/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import static java.util.Date.from;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import nogometnastatistika.model.Dogadjaj;

import nogometnastatistika.model.Igrac;
import nogometnastatistika.model.Klub;
import nogometnastatistika.model.Utakmica;
import nogometnastatistika.model.Vrsta;

import org.hibernate.Session;

/**
 *
 * @author Marko
 */
public class PocetniInsert {
    
    private static final int BROJ_KLUBOVA = 6;
    private static final int BROJ_UTAKMICA = 9;
    private static final int BROJ_IGRACA = 66;
    private static final int BROJ_VRSTA = 7;
    private static final int BROJ_DOGADJAJA = 105;
    
    private Faker faker;
    
    private List<Klub> klubovi;
    private List<Utakmica> utakmice;
    private List<Igrac> igraci;
    private List<Vrsta> vrste;
    private List<Dogadjaj> dogadjaji;
    private Session session;
    
    
     public PocetniInsert() {
        faker = new Faker();
        
        klubovi = new ArrayList<>();
        utakmice = new ArrayList<>();
        igraci = new ArrayList<>();
        vrste = new ArrayList<>();
        dogadjaji = new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        
        kreirajKlubove();
        kreirajUtakmice();
        kreirajIgrace();
        kreirajVrste();
        kreirajDogadjaje();
        session.getTransaction().commit();
    }
     
     
    private void kreirajKlubove (){
         Klub k;
        for (int i = 0; i < BROJ_KLUBOVA; i++) {
            k = new Klub();
            k.setNaziv(faker.app().name());
            session.persist(k);
            klubovi.add(k);
        }
    }
    
    private void kreirajUtakmice () {
     Utakmica u;
        for (int i = 0; i < BROJ_UTAKMICA; i++) {
            u = new Utakmica();
            u.getDomaciKlub();
            u.getGostiKlub();
            u.setMaksimalanBrojNavijaca(faker.number().randomNumber());
            u.setVrijemePocetka(faker.date().birthday());
            u.setStadion(faker.team().state());
            
            session.persist(u);
            utakmice.add(u);
        }
    }
    
    private void kreirajIgrace () {
         Igrac ig;
        for (int i = 0; i < BROJ_IGRACA; i++) {
            ig = new Igrac();
            ig.setIme(faker.name().firstName());
            ig.setPrezime(faker.name().lastName());
            ig.setOib(Alati.dovuciOib());
            ig.setDatumRodjenja(faker.date().birthday());
            ig.setPozicija(faker.name().title());
            ig.setTrenutnaVrijednost(new BigDecimal(faker.number().numberBetween(10000, 1000000)));
            ig.setKlub(klubovi.get((int) sb(0, BROJ_KLUBOVA -1)));
            
            
            session.persist(ig);
            igraci.add(ig);
        }
    }
    
    private void kreirajVrste () {
          Vrsta v;
        for (int i = 0; i < BROJ_VRSTA; i++) {
            v = new Vrsta();
            v.setNaziv(faker.name().name());
            v.setGol(faker.bool().bool());
          
            
            
            session.persist(v);
            vrste.add(v);
        }
    }
    
    private void kreirajDogadjaje () {
         Dogadjaj d;
        for (int i = 0; i < BROJ_DOGADJAJA; i++) {
            d = new Dogadjaj();
            d.setMinuta(faker.number().numberBetween(10000, 1000000));
            d.setUtakmica(utakmice.get((int) sb(0, BROJ_UTAKMICA-1)));
            d.setIgrac(igraci.get((int) sb(0, BROJ_IGRACA-1)));
            d.setVrsta(vrste.get(sb(0, BROJ_VRSTA-1)) );
          
            
            
            session.persist(d);
            
        }
    }
    private int sb(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}


