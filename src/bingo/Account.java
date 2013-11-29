package bingo;


public class Account 
{
    protected String kaartID;
    protected String gebruikersnaam;
    protected double aantalPunten;
    protected String VIPstatus;
    protected double totaalGespendeerdBedrag;
    protected int aantalVerschillendeWinkels;
    protected Datum registreerDatum;
    protected Boolean wolverene;
    protected Boolean bigSpender;
    protected Boolean major;

    public Account() 
    {
        kaartID = "";
        gebruikersnaam = "";
        aantalPunten = 0.0;
        VIPstatus ="";
        totaalGespendeerdBedrag= 0.0;
        aantalVerschillendeWinkels = 0;
        registreerDatum = new Datum();
        wolverene = false;
        bigSpender = false;
        major = false;
        
    }

    public Account(String kaartID, String gebruikersnaam, double aantalPunten, String VIPstatus, double totaalGespendeerdBedrag, int aantalVerschillendeWinkels, Datum registreerDatum, Boolean wolverene, Boolean bigSpender, Boolean major) {
        this.kaartID = kaartID;
        this.gebruikersnaam = gebruikersnaam;
        this.aantalPunten = aantalPunten;
        this.VIPstatus = VIPstatus;
        this.totaalGespendeerdBedrag = totaalGespendeerdBedrag;
        this.aantalVerschillendeWinkels = aantalVerschillendeWinkels;
        this.registreerDatum = registreerDatum;
        this.wolverene = wolverene;
        this.bigSpender = bigSpender;
        this.major = major;
    }
    
    public void checkBigSpender()
     {
         if (getAantalPunten()>= 10000 && getTotaalGespendeerdBedrag() >= 5000 && bigspenderAfgelopenJaar = false) //variabele bigspender??
                        {
                            bigSpender = true;
                            verstuurMailBigSpender();
                            aantalPunten = getAantalPunten() + 500;
                           
                        }
         else
         {
             bigSpender = false;
         }
     }
    public void checkWolverene()
    {
        if(getAantalPunten()>= 10000 && getAantalVerschillendeWinkels() >= 20 )
        {
           wolverene = true;
           verstuurMailWolverene();
           aantalPunten = getAantalPunten() + 600;
           
        }
        else
        {
            wolverene = false;
        }
            
    }
    
    public void checkMajor(Winkel w)
            {
                if(getAantalPunten()>= 10000 && getKaartID() == w.getMajor())
                    {
                        major = true;
                        verstuurMailMajor();
                        aantalPunten = getAantalPunten() + 100;
                    }
                else
                {
                   major = false; 
                }
                    
            }
            
    
    public void verstuurMailBigSpender()
            {
                //hoe??
            }
    
    public void verstuurMailWolverene()
            {
                
            }
    
    public void verstuurMailMajor()
            {
                
            }
    
    
    

    public String getKaartID() {
        return kaartID;
    }

    public void setKaartID(String kaartID) {
        this.kaartID = kaartID;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public double getAantalPunten() {
        return aantalPunten;
    }

    public void setAantalPunten(double aantalPunten) {
        this.aantalPunten = aantalPunten;
    }

    public String getVIPstatus() {
        return VIPstatus;
    }

    public void setVIPstatus(String VIPstatus) {
        this.VIPstatus = VIPstatus;
    }

    public double getTotaalGespendeerdBedrag() {
        return totaalGespendeerdBedrag;
    }

    public void setTotaalGespendeerdBedrag(double totaalGespendeerdBedrag) {
        this.totaalGespendeerdBedrag = totaalGespendeerdBedrag;
    }

    public int getAantalVerschillendeWinkels() {
        return aantalVerschillendeWinkels;
    }

    public void setAantalVerschillendeWinkels(int aantalVerschillendeWinkels) {
        this.aantalVerschillendeWinkels = aantalVerschillendeWinkels;
    }

    public Datum getRegistreerDatum() {
        return registreerDatum;
    }

    public void setRegistreerDatum(Datum registreerDatum) {
        this.registreerDatum = registreerDatum;
    }

    public Boolean getWolverene() {
        return wolverene;
    }

    public void setWolverene(Boolean wolverene) {
        this.wolverene = wolverene;
    }

    public Boolean getBigSpender() {
        return bigSpender;
    }

    public void setBigSpender(Boolean bigSpender) {
        this.bigSpender = bigSpender;
    }

    public Boolean getMajor() {
        return major;
    }

    public void setMajor(Boolean major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Account{" + "kaartID=" + kaartID + ", gebruikersnaam=" + gebruikersnaam + ", aantalPunten=" + aantalPunten + ", VIPstatus=" + VIPstatus + ", totaalGespendeerdBedrag=" + totaalGespendeerdBedrag + ", aantalVerschillendeWinkels=" + aantalVerschillendeWinkels + ", registreerDatum=" + registreerDatum + ", wolverene=" + wolverene + ", bigSpender=" + bigSpender + ", major=" + major + '}';
    } 
}
