
package bingo;


public class KlantBedrijf extends Account
{
    private String bedrijfsNaam;
    private String telefoonBedrijf;
    private String emailBedrijf;
    private String straatBedrijf;
    private String nummerBedrijf;
    private String postcodeBedrijf;
    private String stadBedrijf;
    private String btwBedrijf;

    public KlantBedrijf() 
    {
        bedrijfsNaam="";
        telefoonBedrijf="";
        emailBedrijf="";
        straatBedrijf="";
        nummerBedrijf="";
        postcodeBedrijf="";
        stadBedrijf="";
        btwBedrijf="";
    }

    public KlantBedrijf(String bedrijfsNaam, String telefoonBedrijf, String emailBedrijf, String straatBedrijf, String nummerBedrijf, String postcodeBedrijf, String stadBedrijf, String btwBedrijf) {
        this.bedrijfsNaam = bedrijfsNaam;
        this.telefoonBedrijf = telefoonBedrijf;
        this.emailBedrijf = emailBedrijf;
        this.straatBedrijf = straatBedrijf;
        this.nummerBedrijf = nummerBedrijf;
        this.postcodeBedrijf = postcodeBedrijf;
        this.stadBedrijf = stadBedrijf;
        this.btwBedrijf = btwBedrijf;
    }

    public KlantBedrijf(String bedrijfsNaam, String telefoonBedrijf, String emailBedrijf, String straatBedrijf, String nummerBedrijf, String postcodeBedrijf, String stadBedrijf, String btwBedrijf, String kaartID, String gebruikersnaam, double aantalPunten, String VIPstatus, double totaalGespendeerdBedrag, int aantalVerschillendeWinkels, Datum registreerDatum, Boolean wolverene, Boolean bigSpender, Boolean major) {
        super(kaartID, gebruikersnaam, aantalPunten, VIPstatus, totaalGespendeerdBedrag, aantalVerschillendeWinkels, registreerDatum, wolverene, bigSpender, major);
        this.bedrijfsNaam = bedrijfsNaam;
        this.telefoonBedrijf = telefoonBedrijf;
        this.emailBedrijf = emailBedrijf;
        this.straatBedrijf = straatBedrijf;
        this.nummerBedrijf = nummerBedrijf;
        this.postcodeBedrijf = postcodeBedrijf;
        this.stadBedrijf = stadBedrijf;
        this.btwBedrijf = btwBedrijf;
    }

    public String getBedrijfsNaam() {
        return bedrijfsNaam;
    }

    public void setBedrijfsNaam(String bedrijfsNaam) {
        this.bedrijfsNaam = bedrijfsNaam;
    }

    public String getTelefoonBedrijf() {
        return telefoonBedrijf;
    }

    public void setTelefoonBedrijf(String telefoonBedrijf) {
        this.telefoonBedrijf = telefoonBedrijf;
    }

    public String getEmailBedrijf() {
        return emailBedrijf;
    }

    public void setEmailBedrijf(String emailBedrijf) {
        this.emailBedrijf = emailBedrijf;
    }

    public String getStraatBedrijf() {
        return straatBedrijf;
    }

    public void setStraatBedrijf(String straatBedrijf) {
        this.straatBedrijf = straatBedrijf;
    }

    public String getNummerBedrijf() {
        return nummerBedrijf;
    }

    public void setNummerBedrijf(String nummerBedrijf) {
        this.nummerBedrijf = nummerBedrijf;
    }

    public String getPostcodeBedrijf() {
        return postcodeBedrijf;
    }

    public void setPostcodeBedrijf(String postcodeBedrijf) {
        this.postcodeBedrijf = postcodeBedrijf;
    }

    public String getStadBedrijf() {
        return stadBedrijf;
    }

    public void setStadBedrijf(String stadBedrijf) {
        this.stadBedrijf = stadBedrijf;
    }

    public String getBtwBedrijf() {
        return btwBedrijf;
    }

    public void setBtwBedrijf(String btwBedrijf) {
        this.btwBedrijf = btwBedrijf;
    }

    @Override
    public String toString() {
        return "KlantBedrijf{" + "bedrijfsNaam=" + bedrijfsNaam + ", telefoonBedrijf=" + telefoonBedrijf + ", emailBedrijf=" + emailBedrijf + ", straatBedrijf=" + straatBedrijf + ", nummerBedrijf=" + nummerBedrijf + ", postcodeBedrijf=" + postcodeBedrijf + ", stadBedrijf=" + stadBedrijf + ", btwBedrijf=" + btwBedrijf + '}';
    }

    

   

    

    
    
    
}
