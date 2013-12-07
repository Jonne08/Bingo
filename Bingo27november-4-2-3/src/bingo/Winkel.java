
package bingo;

public class Winkel 
{
    protected int winkelID;
    protected String naam;
    protected int major;
    protected String login;

    public Winkel() 
    {
        winkelID = 0;
        naam = "";
        major = 0;
        login = "";
    }
    
    public Winkel(int winkelID, String naam, int major)
    {
        this.winkelID = winkelID;
        this.naam = naam;
        this.major = major;
    }

    public Winkel(int winkelID, String naam, int major, String login) {
        this.winkelID = winkelID;
        this.naam = naam;
        this.major = major;
        this.login = login;
    }

    public int getWinkelID() {
        return winkelID;
    }

    public void setWinkelID(int winkelID) {
        this.winkelID = winkelID;
    }
    
    public String getWinkelNaam()
    {
        return naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
    public void setWinkelNaam(String wnaam)
    {
        this.naam = wnaam;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Winkel{" + "winkelID=" + winkelID + ", major=" + major + '}';
    }    
}
