
package bingo;

import java.util.Calendar;
import java.util.HashMap;


public class Verkoop 
{
    private String bestelbonID;
    private double spaarpuntenVerkoop;
    private Datum verkoopDatum;
    private HashMap<Account, Aankoop> transacties;

    public Verkoop() 
    {
        bestelbonID ="";
        spaarpuntenVerkoop = 0.0;
        verkoopDatum = new Datum(); 
        transacties = new HashMap();
    }

    public Verkoop(String bestelbonID, double spaarpuntenVerkoop, Datum verkoopDatum, HashMap transacties) {
        this.bestelbonID = bestelbonID;
        this.spaarpuntenVerkoop = spaarpuntenVerkoop;
        this.verkoopDatum = verkoopDatum;
        this.transacties = transacties;
    }
    
    public double puntenAfgelopenJaar(Account acc)
    {
        double punten = 0;
        Datum datum1 = acc.getRegistreerDatum();
        Datum datumVandaag = new Datum(Calendar.DAY_OF_MONTH,Calendar.MONTH, Calendar.YEAR);
        
        while(datum1.aantalDagenTot(datumVandaag) <= 365)
        {
            
        }
        return punten;        
    }
    
    public void addTransactie(Account acc, Aankoop a)
    {
        transacties.put(acc, a);
    }

    public String getBestelbonID() {
        return bestelbonID;
    }

    public void setBestelbonID(String bestelbonID) {
        this.bestelbonID = bestelbonID;
    }

    public double getSpaarpuntenVerkoop() {
        return spaarpuntenVerkoop;
    }

    public void setSpaarpuntenVerkoop(double spaarpuntenVerkoop) {
        this.spaarpuntenVerkoop = spaarpuntenVerkoop;
    }

    public Datum getVerkoopDatum() {
        return verkoopDatum;
    }

    public void setVerkoopDatum(Datum verkoopDatum) {
        this.verkoopDatum = verkoopDatum;
    }

    public HashMap<Account, Aankoop> getTransacties() {
        return transacties;
    }

    public void setTransacties(HashMap<Account, Aankoop> transacties) {
        this.transacties = transacties;
    }
    
    
    
    
    
    
    
}
