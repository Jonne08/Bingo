package bingo;

public class Aankoop 
{
    Artikel artikel;
    Datum aankoopDatum;
    Winkel aankoopWinkel;

    public Aankoop() 
    {
        artikel = new Artikel();
        aankoopDatum = new Datum();
        aankoopWinkel = new Winkel();
    }

    public Aankoop(Artikel artikel, Datum aankoopDatum, Winkel aankoopWinkel) 
    {
        this.artikel = artikel;
        this.aankoopDatum = aankoopDatum;
        this.aankoopWinkel = aankoopWinkel;
    }
    public void Aankopen()
            {
                
            }
            
            

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public Datum getAankoopDatum() {
        return aankoopDatum;
    }

    public void setAankoopDatum(Datum aankoopDatum) {
        this.aankoopDatum = aankoopDatum;
    }

    public Winkel getAankoopWinkel() {
        return aankoopWinkel;
    }

    public void setAankoopWinkel(Winkel aankoopWinkel) {
        this.aankoopWinkel = aankoopWinkel;
    }

    @Override
    public String toString() {
        return "Aankoop{" + "artikel=" + artikel + ", aankoopDatum=" + aankoopDatum + ", aankoopWinkel=" + aankoopWinkel + '}';
    }
    
    
    
    
}
