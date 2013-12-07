/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bingo;

public class Verkopen 
{
    int id;
    int filiaal;
    int account;
    int artikelid;
    int hoev;
    String datum;
    double puntengekr;
    double puntenkopen;
    double prijs;
    String naam;
    
    public Verkopen()
    {
        this.id = 0;
        this.filiaal = 0;
        this.account = 0;
        this.artikelid = 0;
        this.hoev = 0;
        this.datum = "";
        this.puntengekr = 0;
        this.puntenkopen = 0;
        this.prijs = 0;
        this.naam = "";
    }
    
    public Verkopen(int id, int filiaal, int account, int artikelid, int hoev, String datum, double puntengekr, double puntenkopen, double prijs)
    {
        this.id = id;
        this.filiaal = filiaal;
        this.account = account;
        this.artikelid = artikelid;
        this.hoev = hoev;
        this.datum = datum;
        this.puntengekr = puntengekr;
        this.puntenkopen = puntenkopen;
        this.prijs = prijs;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFiliaal() {
        return filiaal;
    }

    public void setFiliaal(int filiaal) {
        this.filiaal = filiaal;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getArtikelid() {
        return artikelid;
    }

    public void setArtikelid(int artikelid) {
        this.artikelid = artikelid;
    }

    public int getHoev() {
        return hoev;
    }

    public void setHoev(int hoev) {
        this.hoev = hoev;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public double getPuntengekr() {
        return puntengekr;
    }

    public void setPuntengekr(double puntengekr) {
        this.puntengekr = puntengekr;
    }

    public double getPuntenkopen() {
        return puntenkopen;
    }

    public void setPuntenkopen(double puntenkopen) {
        this.puntenkopen = puntenkopen;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
    
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) 
    {
        this.naam = naam;
    }    
}
