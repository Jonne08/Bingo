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
    
    private String idFiliaal;
    private String straatFiliaal;
    private String huisnummerFiliaal;
    private String postcodeFiliaal;
    private String stadFiliaal;
    private String telefoonFiliaal;

    public Filiaal() {
        idFiliaal = "";
        straatFiliaal = "";
        huisnummerFiliaal = "";
        postcodeFiliaal = "";
        stadFiliaal = "";
        telefoonFiliaal = "";
    }

    public Filiaal(String idFiliaal, String straatFiliaal, String huisnummerFiliaal, String postcodeFiliaal, String stadFiliaal, String telefoonFiliaal) {
        this.idFiliaal = idFiliaal;
        this.straatFiliaal = straatFiliaal;
        this.huisnummerFiliaal = huisnummerFiliaal;
        this.postcodeFiliaal = postcodeFiliaal;
        this.stadFiliaal = stadFiliaal;
        this.telefoonFiliaal = telefoonFiliaal;
    }

    public Filiaal(String idFiliaal, String straatFiliaal, String huisnummerFiliaal, String postcodeFiliaal, String stadFiliaal, String telefoonFiliaal, String winkelID, String major) {
        super(winkelID, major);
        this.idFiliaal = idFiliaal;
        this.straatFiliaal = straatFiliaal;
        this.huisnummerFiliaal = huisnummerFiliaal;
        this.postcodeFiliaal = postcodeFiliaal;
        this.stadFiliaal = stadFiliaal;
        this.telefoonFiliaal = telefoonFiliaal;
    }

    @Override
    public String toString() {
        return "Filiaal{" + "idFiliaal=" + idFiliaal + ", straatFiliaal=" + straatFiliaal + ", huisnummerFiliaal=" + huisnummerFiliaal + ", postcodeFiliaal=" + postcodeFiliaal + ", stadFiliaal=" + stadFiliaal + ", telefoonFiliaal=" + telefoonFiliaal + '}';
    }

    

    public String getIdFiliaal() {
        return idFiliaal;
    }

    public void setIdFiliaal(String idFiliaal) {
        this.idFiliaal = idFiliaal;
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
    
    
    
    
}
