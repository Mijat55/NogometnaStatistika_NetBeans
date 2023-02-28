/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.model;

import jakarta.persistence.Entity;
import java.util.Date;

@Entity
public class Utakmica extends Entitet{
    
        private String domaciKlub;
	private String gostiKlub;
	private Date vrijemePocetka;
	private Long maksimalanBrojNavijaca;
	private String stadion;

    public String getDomaciKlub() {
        return domaciKlub;
    }

    public void setDomaciKlub(String domaciKlub) {
        this.domaciKlub = domaciKlub;
    }

    public String getGostiKlub() {
        return gostiKlub;
    }

    public void setGostiKlub(String gostiKlub) {
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
