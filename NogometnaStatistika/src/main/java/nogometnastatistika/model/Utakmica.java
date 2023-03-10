/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Entity
public class Utakmica extends Entitet{
    @ManyToOne
    @JoinColumn(
    name = "domaci_klub_sifra")
    
        private Klub domaciKlub;
    @ManyToOne
    @JoinColumn(
    name = "gosti_klub_sifra")
    
        private Klub gostiKlub;
    @Column(
    name = "vrijeme_pocetka",
    columnDefinition ="datetime")
	private Date vrijemePocetka;
    @Column(
    name = "maksimalan_broj_navijaca",
    columnDefinition = "decimal(38,2)")
	private Long maksimalanBrojNavijaca;
    @Column(
    columnDefinition = "varchar(30)")
	private String stadion;

    public Klub getDomaciKlub() {
        return domaciKlub;
    }

    public void setDomaciKlub(Klub domaciKlub) {
        this.domaciKlub = domaciKlub;
    }

    public Klub getGostiKlub() {
        return gostiKlub;
    }

    public void setGostiKlub(Klub gostiKlub) {
        this.gostiKlub = gostiKlub;
    }

   

    
  
                
	

   

   

   

    public Date getVrijemePocetka() {
        return vrijemePocetka;
    }

    public void setVrijemePocetka(Date vrijemePocetka) {
        this.vrijemePocetka = vrijemePocetka;
    }

    public Long getMaksimalanBrojNavijaca() {
        return maksimalanBrojNavijaca;
    }

    public void setMaksimalanBrojNavijaca(Long maksimalanBrojNavijaca) {
        this.maksimalanBrojNavijaca = maksimalanBrojNavijaca;
    }

    public String getStadion() {
        return stadion;
    }

    public void setStadion(String stadion) {
        this.stadion = stadion;
    }
       
}
