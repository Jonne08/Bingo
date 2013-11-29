package bingo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL
{
    Connection conn;
    private static final String db = "BINFtest143";
    private static final String user = "BINFtest143";
    private static final String pasw = "oi3AeF4g";
 
    public MySQL()
    {
    }

    public  static Connection getConnetion() throws ClassNotFoundException            
    {
        Connection dbConnection= null;
        try
        {        
            Class.forName("com.mysql.jdbc.Driver");
            String protocol = "jdbc";
            String subProtocol = "mysql";
            String subName = "//mysqlha2.ugent.be/" + db + 
                 "?user=" + user + 
                 "&password=" + pasw;

            String URL = protocol + ":" + subProtocol + ":" + subName;
            dbConnection = DriverManager.getConnection(URL);
            return dbConnection;
        }
        catch(SQLException sqle)
        {
            try{ dbConnection.close(); } catch(Exception ex) { }
            return null;
        }
    }
    public void insertTest() throws SQLException
    {
        try 
        {
            conn = getConnetion();
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO winkels (naam, login, pass) VALUES ('Delhaize', 'delhaize', 'testpass')");
            conn.close();
        } 
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public int loginCheckWinkel(String login, String pass)
    {
        try 
        {
            try {
            conn = getConnetion();
            Statement st = conn.createStatement();
            String query = "SELECT * FROM winkels WHERE login = '" + login + "'";
            ResultSet rs = st.executeQuery(query);
            int rtn = 0;
            /*if(!rs.next())
            {
                return 0;
            }*/
            while(rs.next())
            {
                int id = rs.getInt("id");
                String naam = rs.getString("naam");
                String lg = rs.getString("login");
                System.out.println(login + " " + pass + " vs " + naam + " " + login + " " + pass + " " + " " + id); //DEBUG
                String ps = rs.getString("pass");
                if(login.equals(lg))
                {
                    if(pass.equals(ps))
                    {
                        rtn = 3;
                    }
                    else
                    {
                        rtn = 2;
                    }
                }
                else
                {
                    rtn = 1;
                }
            }
            conn.close();
            return rtn;
            }
            catch (SQLException e)
            {
                return 6;
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            return 4;
        }
    }
    
    public Winkel loginWinkel(String login, String pass)
    {
        Winkel wi = new Winkel();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM winkels WHERE login = '" + login + "' AND pass = '" + pass + "'";
                ResultSet rs = st.executeQuery(query);
                int id = 0;
                String naam = "";
                while(rs.next())
                {
                    id = rs.getInt("id");
                    naam = rs.getString("naam");
                }
                conn.close();
                wi.setWinkelID(id);
                wi.setWinkelNaam(naam);
                System.out.println("login" + wi.getWinkelID() + " " + wi.getWinkelNaam()); // DEBUG
            }
            catch (SQLException e)
            {
            }
        } 
        catch (ClassNotFoundException ex) 
        {
        }
        return wi;
    }
    
    public void addFiliaal(String naam, String straat,String nummer, String postcode, String stad, String telefoon, int winkel, String login, String wachtwoord) throws SQLException
    {
        try 
        {
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "INSERT INTO filialen (naam, adres, nummer, stad, postcode, telefoon, winkel, login, pass) VALUES ('" 
                   + naam + "', '" + straat + "', '" + nummer + "', '" + stad + "', '" + postcode + "', '" + telefoon + "', '" + winkel + "', '" + login + "', '" + wachtwoord + "')";
            
            st.executeUpdate(query);
            conn.close();
        } 
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public void addAccount(String voornaam, String naam, String straat, String nummer, String postcode, String stad, String geboortedatum, String email, String btwNummer, boolean bedrijf) throws SQLException
    {
        try 
        {
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "INSERT INTO accounts (naam, voornaam, straat, nummer, postcode, stad, geboortedatum, email, btwNummer, bedrijf) VALUES ('" + voornaam + "', '" + naam + "', '" + straat + "', '" + nummer + "', '" + postcode + "', '" + stad + "', '" + geboortedatum + "', '" + email + "', '" + btwNummer + "', '" + bedrijf + "')";
            
            st.executeUpdate(query);
            conn.close();
        } 
        catch (ClassNotFoundException ex) 
        {
        }
    }
 
    public void addArtikel(String naamArt, String barcode, double prijsArt, double puntengekrArt, double puntenkopenArt, int minimum, int winkel) throws SQLException
    {            
        try 
        {
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "INSERT INTO artikels (naam, prijs, puntengekregen, puntenkopen, minimum, barcode, winkel) VALUES ('" + naamArt + "', '" 
                    + prijsArt + "', '" + puntengekrArt + "', '" + puntenkopenArt + "', '" + minimum + "', '" + barcode + "', '" + winkel + "')";
            
            st.executeUpdate(query);
            conn.close();
        } 
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public ArrayList<Artikel> getArtikels(int wnk) throws SQLException
    {
        ArrayList<Artikel> arts = new ArrayList<Artikel>();
        try 
        {
            conn = getConnetion();
            Statement st = conn.createStatement();
            String query = "SELECT * FROM artikels WHERE winkel = '" + wnk + "'";
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String naam = rs.getString("naam");
                String barcode = rs.getString("barcode");
                double prijs = rs.getDouble("prijs");
                double pg = rs.getDouble("puntengekregen");
                double pk = rs.getDouble("puntenkopen");
                int min = rs.getInt("minimum");
                int winkel = rs.getInt("winkel");
                Artikel art = new Artikel(id, naam, barcode, prijs, pg, pk, min, winkel);
                arts.add(art);
            }
            conn.close();
        }
        catch (ClassNotFoundException e)
        {
        }   
        return arts;
    }
    
    public void updateArtikel(int id, String naam, String barcode, double prijs, double puntenG, double puntenK, int minimum)
    {
        try 
        {
            conn = getConnetion();
            Statement st;
            try 
            {
                st = conn.createStatement();
            
                String query = "UPDATE artikels SET naam = '" + naam + "', prijs = '" + prijs + "', puntengekregen = '"  + puntenG + "', puntenkopen = '" 
                            + puntenK + "', minimum = '" + minimum + "', barcode = '" + barcode + "' WHERE id = '" + id + "'";

                st.executeUpdate(query);
                conn.close();
            } 
            catch (SQLException ex) 
            {
            }
        } 
        catch (ClassNotFoundException ex) 
        {
        }        
    }
}