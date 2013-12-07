
package bingo;

public class Artikel 
{
    private int id;
    private String naam;
    private String barcode;
    private double prijs;
    private double puntenGekregen;
    private double puntenKopen;
    private int minimum;
    private int winkel;

    public Artikel() 
    {
    }

    public Artikel(int idArt, String naamArt, String barcArt, double prijsArt, double pgArt, double pkArt, int minArt, int winkArt) 
    {
        this.id = idArt;
        this.naam = naamArt;
        this.barcode = barcArt;
        this.prijs = prijsArt;
        this.puntenGekregen = pgArt;
        this.puntenKopen = pkArt;
        this.minimum = minArt;
        this.winkel = winkArt;
    }

    public int getID() 
    {
        return this.id;
    }

    public void setID(int idArtikel) 
    {
        this.id = idArtikel;
    }

    public String getNaam() 
    {
        return this.naam;
    }

    public void setNaam(String naamArtikel) 
    {
        this.naam = naamArtikel;
    }
    
    public String getBarcode() 
    {
        return this.barcode;
    }

    public void setBarcode(String barcArt) 
    {
        this.barcode = barcArt;
    }
    
    public double getPrijs() 
    {
        return this.prijs;
    }

    public void setPrijs(double prijsArt) 
    {
        this.prijs = prijsArt;
    }    
    
    public double getPuntenGekregen() 
    {
        return this.puntenGekregen;
    }

    public void setPuntenGekregen(double pgArt) 
    {
        this.puntenGekregen = pgArt;
    }

    public double getPuntenKopen() 
    {
        return this.puntenKopen;
    }

    public void setPuntenKopen(double pkArt) 
    {
        this.puntenKopen = pkArt;
    }

    public int getMinimum() 
    {
        return this.minimum;
    }

    public void setMinimum(int minArt) 
    {
        this.minimum = minArt;
    }

    public int getWinkel() 
    {
        return this.winkel;
    }

    public void setWinkel(int winkArt) 
    {
        this.winkel = winkArt;
    }

    //@Override
    //public String toString() {
        //return "Artikel{" + "idArtikel=" + idArtikel + ", naamArtikel=" + naamArtikel + ", puntenArtikel=" + puntenArtikel + ", prijsArtikel=" + prijsArtikel + ", voorraadArtikel=" + voorraadArtikel + ", minPuntenAantal=" + minPuntenAantal + '}';
    //}
    
    
}
