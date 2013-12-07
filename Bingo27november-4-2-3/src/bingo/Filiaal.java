/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

/**
 *
 * @author ruben-verhelst
 */
public class Filiaal extends Winkel
{
    
    private int idFiliaal;
    private String naam;
    private String straatFiliaal;
    private String huisnummerFiliaal;
    private String postcodeFiliaal;
    private String stadFiliaal;
    private String telefoonFiliaal;
    private int winkel;
    private String login;
    private String wachtwoord;
    private MySQL sql = MySQL.getInstance();  
    
    public Filiaal() {
        idFiliaal = 0;
        naam = "";
        straatFiliaal = "";
        huisnummerFiliaal = "";
        postcodeFiliaal = "";
        stadFiliaal = "";
        telefoonFiliaal = "";
        winkel = 0;
        login = "";
        wachtwoord = "";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public Filiaal(int idFiliaal, String naam, String straatFiliaal, String huisnummerFiliaal, String postcodeFiliaal, String stadFiliaal, String telefoonFiliaal, int winkel, String lgn, String ww, String wnaam, int wmajor) {       
        super(winkel, wnaam, wmajor);          
        this.idFiliaal = idFiliaal;
        this.naam = naam;
        this.straatFiliaal = straatFiliaal;
        this.huisnummerFiliaal = huisnummerFiliaal;
        this.postcodeFiliaal = postcodeFiliaal;
        this.stadFiliaal = stadFiliaal;
        this.telefoonFiliaal = telefoonFiliaal;
        this.winkel = winkel;
        this.login = lgn;
        this.wachtwoord = ww;
    }

    /*public Filiaal(int idFiliaal, String naam, String straatFiliaal, String huisnummerFiliaal, String postcodeFiliaal, String stadFiliaal, String telefoonFiliaal, String winkelID, String major, int winkel) {
        //super(winkelID, major);
        this.idFiliaal = idFiliaal;
        this.naam = naam;
        this.straatFiliaal = straatFiliaal;
        this.huisnummerFiliaal = huisnummerFiliaal;
        this.postcodeFiliaal = postcodeFiliaal;
        this.stadFiliaal = stadFiliaal;
        this.telefoonFiliaal = telefoonFiliaal;
    }*/

    @Override
    public String toString() {
        return "Filiaal{" + "idFiliaal=" + idFiliaal + ", straatFiliaal=" + straatFiliaal + ", huisnummerFiliaal=" + huisnummerFiliaal + ", postcodeFiliaal=" + postcodeFiliaal + ", stadFiliaal=" + stadFiliaal + ", telefoonFiliaal=" + telefoonFiliaal + '}';
    }

    

    public int getIdFiliaal() {
        return idFiliaal;
    }

    public void setIdFiliaal(int idFiliaal) {
        this.idFiliaal = idFiliaal;
    }

    public String getNaam()
    {
        return naam;
    }
    
    public void setNaam(String naam)
    {
        this.naam = naam;
    }
    
    public String getStraatFiliaal() {
        return straatFiliaal;
    }

    public void setStraatFiliaal(String straatFiliaal) {
        this.straatFiliaal = straatFiliaal;
    }

    public String getHuisnummerFiliaal() {
        return huisnummerFiliaal;
    }

    public void setHuisnummerFiliaal(String huisnummerFiliaal) {
        this.huisnummerFiliaal = huisnummerFiliaal;
    }

    public String getPostcodeFiliaal() {
        return postcodeFiliaal;
    }

    public void setPostcodeFiliaal(String postcodeFiliaal) {
        this.postcodeFiliaal = postcodeFiliaal;
    }

    public String getStadFiliaal() {
        return stadFiliaal;
    }

    public void setStadFiliaal(String stadFiliaal) {
        this.stadFiliaal = stadFiliaal;
    }

    public String getTelefoonFiliaal() {
        return telefoonFiliaal;
    }

    public void setTelefoonFiliaal(String telefoonFiliaal) {
        this.telefoonFiliaal = telefoonFiliaal;
    }
    
    public int getWinkel() {
        return winkel;
    }

    public void setWinkel(int winkel) {
        this.winkel = winkel;
        Winkel wi = sql.getWinkel(winkel);
        super.setWinkelID(wi.getWinkelID());
        super.setWinkelNaam(wi.getWinkelNaam());
        super.setMajor(wi.getMajor());
        System.out.println(wi.getMajor());
    }    
}
