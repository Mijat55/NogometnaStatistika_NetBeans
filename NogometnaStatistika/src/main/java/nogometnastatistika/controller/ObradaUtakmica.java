/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.controller;

import java.util.List;
import nogometnastatistika.model.Utakmica;
import nogometnastatistika.util.NogometnaStatistikaException;

/**
 *
 * @author Marko
 */
public class ObradaUtakmica extends Obrada<Utakmica>{

    @Override
    public List<Utakmica> read() {
          return session.createQuery("from Utakmica", 
                Utakmica.class).list();
    }

    @Override
    protected void kontrolaUnos() throws NogometnaStatistikaException {
       
    }

    @Override
    protected void kontrolaPromjena() throws NogometnaStatistikaException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws NogometnaStatistikaException {
         if(entitet.getDogadjaji()!=null && !entitet.getDogadjaji().isEmpty()){
             throw new NogometnaStatistikaException("Utakmica se ne može obrisati jer ima događaj");
           
       }
    }
    
    
    
}
