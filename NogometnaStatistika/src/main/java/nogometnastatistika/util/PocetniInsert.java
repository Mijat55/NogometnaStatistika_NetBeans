/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.util;

import com.github.javafaker.Faker;
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
      private static final int BROJ_KLUBOVA = 107;
    private static final int BROJ_UTAKMICA = 15;
    private static final int BROJ_IGRACA = 7;
    private static final int BROJ_DOGADJAJA = 100;
    private static final int BROJ_VRSTA = 20;
    
    private Faker faker;
    private List<Klub> klubovi;
    private List<Utakmica> utakmice;
    private List<Igrac> igraci;
    private List<Dogadjaj> dogadjaji;
    private List<Vrsta> vrste;
    private Session session;
    
    
     public PocetniInsert() {
        faker = new Faker();
        klubovi = new ArrayList<>();
        utakmice = new ArrayList<>();
        igraci = new ArrayList<>();
        dogadjaji = new ArrayList<>();
        vrste = new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajKlubove();
        kreirajUtakmice();
        kreirajIgrace();
        kreirajDogadjaje();
        kreirajVrste();
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
            u.setDomaciKlub(faker.app().name());
            u.setGostiKlub(faker.app().name());
            u.setMaksimalanBrojNavijaca(faker.number().randomNumber());
            u.setVrijemePocetka(faker.date().birthday());
            u.setStadion(faker.team().state());
            
            session.persist(u);
            utakmice.add(u);
        }
    }
    
    private void kreirajIgrace () {
        
    }
    private void kreirajDogadjaje () {
        
    }
    private void kreirajVrste () {
        
    }
    private int sb(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}


