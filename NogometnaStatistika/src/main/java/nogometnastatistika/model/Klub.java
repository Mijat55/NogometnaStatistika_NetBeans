/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public  class Klub {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int klub_sifra;
    @Column(
    columnDefinition = "varchar(20)")
    private String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getKlub_sifra() {
        return klub_sifra;
    }

    public void setKlub_sifra(int klub_sifra) {
        this.klub_sifra = klub_sifra;
    }

    @Override
    public String toString() {
        return naziv;
    }

  
 
    
}
