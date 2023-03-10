/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nogometnastatistika.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Igrac extends Entitet{
    @Column(
    columnDefinition = "varchar(30)")
        private String ime;
    @Column(
    columnDefinition = "varchar(50)")
	private String prezime;
    @Column(
    name = "datum_rodjenja",
    columnDefinition = "datetime")
	private Date datumRodjenja;
    @Column(
    columnDefinition = "varchar(11)")
	private String oib;
    @Column(
    name = "trenutna_vrijednost")
	private BigDecimal trenutnaVrijednost;
    @Column(
    columnDefinition = "varchar(20)")
	private String pozicija;
        @ManyToOne
    @JoinColumn(
    name = "klub")
	private Klub klub;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public BigDecimal getTrenutnaVrijednost() {
        return trenutnaVrijednost;
    }

    public void setTrenutnaVrijednost(BigDecimal trenutnaVrijednost) {
        this.trenutnaVrijednost = trenutnaVrijednost;
    }

    

   
    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public Klub getKlub() {
        return klub;
    }

    public void setKlub(Klub klub) {
        this.klub = klub;
    }

  


    
   
        
    
}
