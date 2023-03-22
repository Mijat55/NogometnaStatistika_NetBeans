/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.controller;

import java.util.List;
import nogometnastatistika.model.Dogadjaj;
import nogometnastatistika.model.Klub;
import nogometnastatistika.model.Utakmica;
import nogometnastatistika.util.NogometnaStatistikaException;

/**
 *
 * @author Marko
 */
public class ObradaDogadjaj extends Obrada<Dogadjaj>{

    @Override
    public List<Dogadjaj> read() {
        return session.createQuery("from Dogadjaj", Dogadjaj.class).list();
    }
  public List<Dogadjaj> read(Utakmica u) {
       return session.createQuery("from Dogadjaj" + " where utakmica=:utakmica",
              Dogadjaj.class).setParameter("utakmica", u).list();
   }
   
   
    public List<Dogadjaj> read(String uvjet) {
       uvjet=uvjet.trim();
       uvjet = "%" + uvjet + "%";
      return session.createQuery("from Dogadjaj "
            + " where concat(igrac.ime, igrac.prezime, igrac.broj, vrsta.naziv, vrsta.gol, utakmica.domaciKlub.naziv, utakmica.gostiKlub.naziv ) "
            + " like :uvjet "
            + " order by igrac, vrsta, minuta, utakmica ", 
             Dogadjaj.class)
             .setParameter("uvjet", uvjet)
             .setMaxResults(30)
             .list();
    }

    @Override
    protected void kontrolaUnos() throws NogometnaStatistikaException {
    }

    @Override
    protected void kontrolaPromjena() throws NogometnaStatistikaException {
    }

    @Override
    protected void kontrolaBrisanje() throws NogometnaStatistikaException {
    }
    
    
    
}
