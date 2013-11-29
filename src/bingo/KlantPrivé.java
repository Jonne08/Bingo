
package bingo;


public class KlantPrivé extends Account
{
    private String voornaamPrive;
    private String achternaamPrive;
    private String straatPrive;
    private String nummerPrive;
    private String postcodePrive;
    private String stadPrive;
    private String geboortedatumPrive;
    private String emailPrive;

    public KlantPrivé() 
    {
        voornaamPrive ="";
        achternaamPrive ="";
        straatPrive = "";
        nummerPrive ="";
        postcodePrive ="";
        stadPrive ="";
        geboortedatumPrive ="";
        emailPrive ="";
        
    }

    public KlantPrivé(String voornaamPrive, String achternaamPrive, String straatPrive, String nummerPrive, String postcodePrive, String stadPrive, String geboortedatumPrive, String emailPrive) {
        this.voornaamPrive = voornaamPrive;
        this.achternaamPrive = achternaamPrive;
        this.straatPrive = straatPrive;
        this.nummerPrive = nummerPrive;
        this.postcodePrive = postcodePrive;
        this.stadPrive = stadPrive;
        this.geboortedatumPrive = geboortedatumPrive;
        this.emailPrive = emailPrive;
    }

    public KlantPrivé(String voornaamPrive, String achternaamPrive, String straatPrive, String nummerPrive, String postcodePrive, String stadPrive, String geboortedatumPrive, String emailPrive, String kaartID, String gebruikersnaam, double aantalPunten, String VIPstatus, double totaalGespendeerdBedrag, int aantalVerschillendeWinkels, Datum registreerDatum, Boolean wolverene, Boolean bigSpender, Boolean major) {
        super(kaartID, gebruikersnaam, aantalPunten, VIPstatus, totaalGespendeerdBedrag, aantalVerschillendeWinkels, registreerDatum, wolverene, bigSpender, major);
        this.voornaamPrive = voornaamPrive;
        this.achternaamPrive = achternaamPrive;
        this.straatPrive = straatPrive;
        this.nummerPrive = nummerPrive;
        this.postcodePrive = postcodePrive;
        this.stadPrive = stadPrive;
        this.geboortedatumPrive = geboortedatumPrive;
        this.emailPrive = emailPrive;
    }

    public String getVoornaamPrive() {
        return voornaamPrive;
    }

    public void setVoornaamPrive(String voornaamPrive) {
        this.voornaamPrive = voornaamPrive;
    }

    public String getAchternaamPrive() {
        return achternaamPrive;
    }

    public void setAchternaamPrive(String achternaamPrive) {
        this.achternaamPrive = achternaamPrive;
    }

    public String getStraatPrive() {
        return straatPrive;
    }

    public void setStraatPrive(String straatPrive) {
        this.straatPrive = straatPrive;
    }

    public String getNummerPrive() {
        return nummerPrive;
    }

    public void setNummerPrive(String nummerPrive) {
        this.nummerPrive = nummerPrive;
    }

    public String getPostcodePrive() {
        return postcodePrive;
    }

    public void setPostcodePrive(String postcodePrive) {
        this.postcodePrive = postcodePrive;
    }

    public String getStadPrive() {
        return stadPrive;
    }

    public void setStadPrive(String stadPrive) {
        this.stadPrive = stadPrive;
    }

    public String getGeboortedatumPrive() {
        return geboortedatumPrive;
    }

    public void setGeboortedatumPrive(String geboortedatumPrive) {
        this.geboortedatumPrive = geboortedatumPrive;
    }

    public String getEmailPrive() {
        return emailPrive;
    }

    public void setEmailPrive(String emailPrive) {
        this.emailPrive = emailPrive;
    }

    @Override
    public String toString() {
        return "KlantPriv\u00e9{" + "voornaamPrive=" + voornaamPrive + ", achternaamPrive=" + achternaamPrive + ", straatPrive=" + straatPrive + ", nummerPrive=" + nummerPrive + ", postcodePrive=" + postcodePrive + ", stadPrive=" + stadPrive + ", geboortedatumPrive=" + geboortedatumPrive + ", emailPrive=" + emailPrive + '}';
    }
    
}
