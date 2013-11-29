
package bingo;

public class Winkel 
{
    protected int winkelID;
    protected String naam;
    protected String major;

    public Winkel() 
    {
        winkelID = 0;
        naam = "";
        major = "";
    }

    public Winkel(int winkelID, String naam) {
        this.winkelID = winkelID;
        this.naam = naam;
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
    
    public void setWinkelNaam(String wnaam)
    {
        this.naam = wnaam;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Winkel{" + "winkelID=" + winkelID + ", major=" + major + '}';
    }    
}
