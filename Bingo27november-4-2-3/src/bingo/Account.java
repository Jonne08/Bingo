package bingo;

import java.io.InputStream;

public class Account 
{
    protected int id;
    protected String naam;
    protected String straat;
    protected String nummer;
    protected String postcode;
    protected String stad;
    protected String email;
    protected String btw;
    protected boolean bedrijf;
    protected int aangemaaktD;
    protected int aangemaaktM;
    protected int aangemaaktJ;
    protected double gespaardePunten;
    protected double werkelijkePunten;
    protected int geboorteD;
    protected int geboorteM;
    protected int geboorteJ;
    protected boolean vip;
    protected boolean bigSpender;
    protected boolean wasBigSpender;
    protected boolean wolverene;
    protected boolean wasWolverene;
    protected String major;
    protected String wasMajor;
    protected InputStream foto;

    public Account() 
    {
        id = 0;
        naam = "";
        straat = "";
        nummer = "";
        postcode = "";
        stad = "";
        email = "";
        btw = "";
        bedrijf = false;
        aangemaaktD = 0;
        aangemaaktM = 0;
        aangemaaktJ = 0;
        gespaardePunten = 0;
        werkelijkePunten = 0;
        geboorteD = 0;
        geboorteM = 0;
        geboorteJ = 0;
        vip = false;
        bigSpender = false;
        wasBigSpender = false;
        wolverene = false;
        wasWolverene = false;
        major = "";    
        wasMajor = "";
        foto = null;
    }

    public Account(int id, String naam, String straat, String nummer, String postcode, String stad, String email, boolean bed, int aangD, int aangM, int aangJ, double gesP, double werkP, boolean vip, boolean bigspender, boolean wasBigSpender, boolean wolverene, boolean wasWolverene, String major, String wasMajor, InputStream foto) 
    {
        this.id = id;
        this.naam = naam;
        this.straat = straat;
        this.nummer = nummer;
        this.postcode = postcode;
        this.stad = stad;
        this.bedrijf = bed;
        this.email = email;
        this.aangemaaktD = aangD;
        this.aangemaaktM = aangM;
        this.aangemaaktJ = aangJ;
        this.gespaardePunten = gesP;
        this.werkelijkePunten = werkP;
        this.vip = vip;
        this.bigSpender = bigspender;
        this.wasBigSpender = wasBigSpender;
        this.wolverene = wolverene;
        this.wasWolverene = wasWolverene;
        this.major = major;
        this.wasMajor = wasMajor; 
        this.foto = foto;
    }
    
    public void setAccount(int id, String naam, String straat, String nummer, String postcode, String stad, String email, boolean bed, int aangD, int aangM, int aangJ, double gesP, double werkP, boolean vip, boolean bigspender, boolean wasBigSpender, boolean wolverene, boolean wasWolverene, String major, String wasMajor, InputStream foto) 
    {
        this.id = id;
        this.naam = naam;
        this.straat = straat;
        this.nummer = nummer;
        this.postcode = postcode;
        this.stad = stad;
        this.email = email;
        this.bedrijf = bed;
        this.aangemaaktD = aangD;
        this.aangemaaktM = aangM;
        this.aangemaaktJ = aangJ;
        this.gespaardePunten = gesP;
        this.werkelijkePunten = werkP;
        this.vip = vip;
        this.bigSpender = bigspender;
        this.wasBigSpender = wasBigSpender;
        this.wolverene = wolverene;
        this.wasWolverene = wasWolverene;
        this.major = major;
        this.wasMajor = wasMajor; 
        this.foto = foto;
    }
    
    public void setBedrijf(String btw)
    {
        this.btw = btw;
    }
    
    public void setPrive(int gebD, int gebM, int gebJ)
    {
        this.geboorteD = gebD;
        this.geboorteM = gebM;
        this.geboorteJ = gebJ;
    }
    
/*    public void checkBigSpender()
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
    
*/    
    

    public int getID() 
    {
        return id;
    }

    public void setID(int ID) 
    {
        this.id = id;
    }

    public String getNaam() 
    {
        return naam;
    }

    public void setNaam(String naam) 
    {
        this.naam = naam;
    }

    public String getStraat()
    {
        return straat;
    }
    
    public void setStraat(String straat)
    {
        this.straat = straat;
    }
    
    public String getNummer()
    {
        return nummer;
    }
    
    public void setNummer(String nummer)
    {
        this.nummer = nummer;
    }
    
    public String getPostcode()
    {
        return postcode;
    }
    
    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }
    
    public String getStad()
    {
        return stad;
    }
    
    public void setStad(String stad)
    {
        this.stad = stad;
    }
    
    public String getEmail() 
    {
        return email;
    }
    
    public String getBtw()
    {
        return btw;
    }
    
    public void setBtw(String btw)
    {
        this.btw = btw;
    }
    
    public boolean getBedrijf()
    {
        return bedrijf;
    }
    
    public void setBedrijf(boolean bedr)
    {
        this.bedrijf = bedr;
    }
    
    public int getAangD()
    {
        return aangemaaktD;
    }
    
    public void setAangD(int aangD)
    {
        this.aangemaaktD = aangD;
    }
    
    public int getAangM()
    {
        return aangemaaktM;
    }
    
    public void setAangM(int aangM)
    {
        this.aangemaaktM = aangM;
    }
    
    public int getAangJ()
    {
        return aangemaaktJ;
    }
    
    public void setAangJ(int aangJ)
    {
        this.aangemaaktJ = aangJ;
    }
    
    public double getGesP()
    {
        return gespaardePunten;
    }
    
    public void setGesP(double gesP)
    {
        this.gespaardePunten = gesP;
    }
    
    public double getWerkP()
    {
        return werkelijkePunten;
    }
    
    public void setWerkP(double werkP)
    {
        this.werkelijkePunten = werkP;
    }
    
    public int getGebD()
    {
        return geboorteD;
    }
    
    public void setGebD(int gebD)
    {
        this.geboorteD = gebD;
    }
    
    public int getGebM()
    {
        return geboorteM;
    }
    
    public void setGebM(int gebM)
    {
        this.geboorteM = gebM;
    }
    
    public int getGebJ()
    {
        return geboorteJ;
    }
    
    public void setGebJ(int gebJ)
    {
        this.geboorteJ = gebJ;
    }
    
    public boolean getVip()
    {
        return vip;
    }
    
    public void setVip(boolean vip)
    {
        this.vip = vip;
    }
    
    public boolean getBigspender()
    {
        return bigSpender;
    }
    
    public void setBigspender(boolean bigS)
    {
        this.bigSpender = bigS;
    }
    
    public boolean getWolverene()
    {
        return wolverene;
    }
    
    public void setWolverene(boolean wolv)
    {
        this.wolverene = wolv;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    public void setMajor(String maj)
    {
        this.major = maj;
    }
    
    public InputStream getFoto()
    {
        return foto;
    }
    
    public void setFoto(InputStream foto)
    {
        this.foto = foto;
    }

    public boolean isWasBigSpender() 
    {
        return wasBigSpender;
    }

    public void setWasBigSpender(boolean wasBigSpender) 
    {
        this.wasBigSpender = wasBigSpender;
    }

    public boolean isWasWolverene() 
    {
        return wasWolverene;
    }

    public void setWasWolverene(boolean wasWolverene) 
    {
        this.wasWolverene = wasWolverene;
    }

    public String getWasMajor() {
        return wasMajor;
    }

    public void setWasMajor(String wasMajor) 
    {
        this.wasMajor = wasMajor;
    }
}
