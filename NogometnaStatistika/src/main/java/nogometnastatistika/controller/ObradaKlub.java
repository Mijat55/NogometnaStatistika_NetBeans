/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.controller;

import java.util.List;
import nogometnastatistika.model.Klub;
import nogometnastatistika.util.NogometnaStatistikaException;

/**
 *
 * @author Marko
 */
public class ObradaKlub extends Obrada<Klub>{

    @Override
    public List<Klub> read() {
        return session.createQuery("from Klub", Klub.class).list();
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
