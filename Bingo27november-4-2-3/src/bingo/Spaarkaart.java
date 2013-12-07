/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bingo;

import java.io.InputStream;

/**
 *
 * @author Jonas
 */
public class Spaarkaart extends Account
{
    int sid;
    int account;
    String snaam;
    String voornaam;
    
    public Spaarkaart()
    {
        this.sid = 0;
        this.account = 0;
        this.snaam = "";
        this.voornaam = "";
    }
    
    public Spaarkaart(int id, int account, String naam, String voornaam)
    {
        this.sid = id;
        this.account = account;
        this.snaam = naam;
        this.voornaam = voornaam;
    }

    public Spaarkaart(int sid, int account, String snaam, String voornaam, int id, String naam, String straat, String nummer, String postcode, String stad, String email, boolean bed, int aangD, int aangM, int aangJ, double gesP, double werkP, boolean vip, boolean bigspender, boolean wasBigSpender, boolean wolverene, boolean wasWolverene, String major, String wasMajor, InputStream foto) 
    {
        super(id, naam, straat, nummer, postcode, stad, email, bed, aangD, aangM, aangJ, gesP, werkP, vip, bigspender, wasBigSpender, wolverene, wasWolverene, major, wasMajor, foto);
        this.sid = sid;
        this.account = account;
        this.snaam = snaam;
        this.voornaam = voornaam;
    }
    
    public void setSpaarkaart(int sid, int account, String snaam, String voornaam)
    {
        this.sid = sid;
        this.account = account;
        this.snaam = snaam;
        this.voornaam = voornaam;
    }
            
    public int getSId() {
        return sid;
    }

    public void setSId(int id) 
    {
        this.sid = id;
    }

    public int getAccount() 
    {
        return account;
    }

    public void setAccount(int account) 
    {
        this.account = account;
    }
    
    public String getSNaam() {
        return snaam;
    }

    public void setSNaam(String naam) 
    {
        this.snaam = naam;
    }

    public String getVoornaam() 
    {
        return voornaam;
    }

    public void setVoornaam(String voornaam) 
    {
        this.voornaam = voornaam;
    }
        
}
