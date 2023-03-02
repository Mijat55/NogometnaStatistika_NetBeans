/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.controller;

import java.util.List;
import nogometnastatistika.model.Vrsta;
import nogometnastatistika.util.NogometnaStatistikaException;

/**
 *
 * @author Marko
 */
public class ObradaVrsta extends Obrada<Vrsta>{

    @Override
    public List<Vrsta> read() {
        return session.createQuery("from Vrsta", Vrsta.class).list();
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
