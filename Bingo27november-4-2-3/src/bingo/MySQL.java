package bingo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;

public class MySQL
{
    Connection conn;
    private static final MySQL sql = new MySQL();
    private static final String db = "BINFG22";
    private static final String user = "BINFG22";
    private static final String pasw = "Gio4thai";
 
    public MySQL()
    {
    }

    public static MySQL getInstance()
    {
        return sql;
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
    
    public int loginCheckWinkel(String login, String pass)
    {
        try 
        {
            try 
            {
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

    public Winkel getWinkel(int id)
    {
        Winkel wi = new Winkel();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM winkels WHERE id = '" + id + "'";
                ResultSet rs = st.executeQuery(query);
                String naam = "";
                int major = 0;
                while(rs.next())
                {
                    id = rs.getInt("id");
                    naam = rs.getString("naam");
                    major = rs.getInt("major");
                }
                conn.close();
                wi.setWinkelID(id);
                wi.setWinkelNaam(naam);
                wi.setMajor(major);
                System.out.println("testmajor" + major);
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
    
    public int loginCheckFiliaal(String login, String pass)
    {
        try 
        {
            try {
            conn = getConnetion();
            Statement st = conn.createStatement();
            String query = "SELECT * FROM filialen WHERE login = '" + login + "'";
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
            rs.close();
            st.close();
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
    
    public Filiaal loginFiliaal(String login, String pass)
    {
        Filiaal fi = new Filiaal();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM filialen RIGHT JOIN winkels ON winkels.id = filialen.winkel WHERE filialen.login = '" + login + "' AND filialen.pass = '" + pass + "'";
                ResultSet rs = st.executeQuery(query);
                int id = 0;
                String naam = "";
                String straat = "";
                String nummer = "";
                String stad = "";
                String postcode = "";
                String telefoon = "";
                int winkel = 0;
                String wnaam = "";
                int major = 0;
                while(rs.next())
                {
                    id = rs.getInt("filialen.id");
                    naam = rs.getString("filialen.naam");
                    straat = rs.getString("filialen.straat");
                    nummer = rs.getString("filialen.nummer");
                    stad = rs.getString("filialen.stad");
                    postcode = rs.getString("filialen.postcode");
                    telefoon = rs.getString("filialen.telefoon");
                    winkel = rs.getInt("filialen.winkel");
                    wnaam = rs.getString("winkels.naam");
                    major = rs.getInt("winkels.major");
                }
                conn.close();
                fi = new Filiaal(id, naam, straat, nummer, stad, postcode, telefoon, winkel, login, pass, wnaam, major);
                System.out.println("login" + fi.getIdFiliaal() + " " + fi.getNaam()); // DEBUG
            }
            catch (SQLException e)
            {
            }
        } 
        catch (ClassNotFoundException ex) 
        {
        }
        return fi;
    }
    
    public void addWinkel(String naam, int major, String login, String pass) throws SQLException
    {
        try
        {                    
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "INSERT INTO winkels (naam, major, login, pass) VALUES ('"+ naam + "', '" + major + "', '" + login + "', '" + pass + "')";
            
            st.executeUpdate(query);
            conn.close();
        }
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public void addFiliaal(String naam, String straat,String nummer, String postcode, String stad, String telefoon, int winkel, String login, String wachtwoord) throws SQLException
    {
        try 
        {
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "INSERT INTO filialen (naam, straat, nummer, stad, postcode, telefoon, winkel, login, pass) VALUES ('" 
                   + naam + "', '" + straat + "', '" + nummer + "', '" + stad + "', '" + postcode + "', '" + telefoon + "', '" + winkel + "', '" + login + "', '" + wachtwoord + "')";
            
            st.executeUpdate(query);
            conn.close();
        } 
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public int addAccount(String naam, String straat, String nummer, String postcode, String stad, String email, String btwNummer, boolean bedrijf, int aangemaaktd, int aangemaaktm, int aangemaaktj, double gespaardepunten, double werkelijkepunten, int geboorted, int geboortem, int geboortej, boolean vip, boolean bigspender, boolean wolverene, String fotopath) throws SQLException
    {
        int rtn = 0;
        try 
        {  
            conn = getConnetion();
            Statement st = conn.createStatement();
            PreparedStatement ps;
            ResultSet rs;
            File foto = new File(fotopath);
            FileInputStream fis = null;
            try 
            {
                fis = new FileInputStream(foto);
            } 
            catch (FileNotFoundException ex) 
            {
                //Logger.getLogger(GuiKlantNieuweKlant.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(bedrijf == true)
            {
                //String query = "UPDATE accounts SET foto=? WHERE id = '1'";
                //String query = "INSERT INTO accounts (naam, straat, nummer, postcode, stad, email, btw, bedrijf) VALUES ('" + naam + "', '" + straat + "', '" + nummer + "', '" + postcode + "', '" + stad + "', '" + email + "', '" 
                //        + btwNummer + "', " + bedrijf + " );";
                String query = "INSERT INTO accounts (naam, straat, nummer, postcode, stad, email, btw, bedrijf, aangemaaktd, aangemaaktm, aangemaaktj, gespaardepunten, werkelijkepunten, geboorted, geboortem, geboortej, vip, bigspender, wolverene, major, wasmajor, foto) VALUES ('" 
                        + naam + "', '" + straat + "', '" + nummer + "', '" + postcode + "', '" + stad +  "', '" + email + "', '" + btwNummer + "', " + bedrijf + ", '" + aangemaaktd + "', '" + aangemaaktm + "', '" + aangemaaktj + "', '" 
                        + gespaardepunten + "', '" + werkelijkepunten + "', '" + 0 + "', '" + 0 + "', '" + 0 + "', " + vip + ", " + bigspender + ", " + wolverene + ", '', '', ?);";
                System.out.println(query);
                ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ps.setBinaryStream(1, (InputStream)fis, (int)foto.length());
                System.out.println(ps.toString());
            }            
            else
            {
                String query = "INSERT INTO accounts (naam, straat, nummer, postcode, stad, email, bedrijf, aangemaaktd, aangemaaktm, aangemaaktj, gespaardepunten, werkelijkepunten, geboorted, geboortem, geboortej, vip, bigspender, wolverene, major, wasmajor, foto) VALUES ('" 
                    + naam + "', '" + straat + "', '" + nummer + "', '" + postcode + "', '" + stad +  "', '" + email + "', " + bedrijf + ", '" + aangemaaktd + "', '" + aangemaaktm + "', '" + aangemaaktj + "', '" 
                    + gespaardepunten + "', '" + werkelijkepunten + "', '" + geboorted + "', '" + geboortem + "', '" + geboortej + "', " + vip + ", " + bigspender + ", " + wolverene + ", '', '', ?)";
                System.out.println(query);    
           
                ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ps.setBinaryStream(1, (InputStream)fis, (int)foto.length());
                System.out.println(ps.toString());
            }
            ps.executeUpdate();
            rs = st.getGeneratedKeys();

            if (rs.next()) 
            {
                rtn = rs.getInt(1);
            } else {

            }            
            conn.close();            
        } 
        catch (ClassNotFoundException ex) 
        {
        }
        return rtn;
    }

    public void updateAccount(int id, String naam, String straat, String nummer, String postcode, String stad, String email, String btwNummer, boolean bedrijf, int aangemaaktd, int aangemaaktm, int aangemaaktj, double gespaardepunten, double werkelijkepunten, int geboorted, int geboortem, int geboortej, boolean vip, boolean bigspender, boolean wolverene, String fotopath) throws SQLException
    { 
        try 
        {  
            conn = getConnetion();
            Statement st = conn.createStatement();
            File foto = new File(fotopath);
            FileInputStream fis = null;
            try 
            {
                fis = new FileInputStream(foto);
            } 
            catch (FileNotFoundException ex) 
            {
                //Logger.getLogger(GuiKlantNieuweKlant.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(bedrijf == true)
            {
                //String query = "UPDATE accounts SET foto=? WHERE id = '1'";
                //String query = "INSERT INTO accounts (naam, straat, nummer, postcode, stad, email, btw, bedrijf) VALUES ('" + naam + "', '" + straat + "', '" + nummer + "', '" + postcode + "', '" + stad + "', '" + email + "', '" 
                //        + btwNummer + "', " + bedrijf + " );";
                String query = "UPDATE accounts SET naam = '" + naam + "', straat = '" + straat + "', nummer = '" + nummer + "', postcode = '" + postcode + "', stad = '" + stad 
                        + "', email = '" + email + "', btw = '" + btwNummer + "', bedrijf = " + bedrijf + ", aangemaaktd = '" + aangemaaktd + "', aangemaaktm = '" + aangemaaktm 
                        + "', aangemaaktj = '" + aangemaaktj + "', gespaardepunten = '" + gespaardepunten + "', werkelijkepunten = '" + werkelijkepunten + "', geboorted = '" + geboorted 
                        + "', geboortem = '" + geboortem + "', geboortej = '" + geboortej + "', vip = " + vip + ", bigspender = " + bigspender + ", wolverene = " + wolverene + ", foto = ? WHERE id = '" + id + "'";
                System.out.println(query);
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setBinaryStream(1, (InputStream)fis, (int)foto.length());
                System.out.println(ps.toString());
                ps.executeUpdate();
                conn.close();
            } 
            
            else
            {
                String query = "UPDATE accounts SET naam = '" + naam + "', straat = '" + straat + "', nummer = '" + nummer + "', postcode = '" + postcode + "', stad = '" + stad 
                        + "', email = '" + email + "', bedrijf = " + bedrijf + ", aangemaaktd = '" + aangemaaktd + "', aangemaaktm = '" + aangemaaktm 
                        + "', aangemaaktj = '" + aangemaaktj + "', gespaardepunten = '" + gespaardepunten + "', werkelijkepunten = '" + werkelijkepunten + "', geboorted = '" + geboorted 
                        + "', geboortem = '" + geboortem + "', geboortej = '" + geboortej + "', vip = " + vip + ", bigspender = " + bigspender + ", wolverene = " + wolverene + ", foto = ? WHERE id = '" + id + "'";

                System.out.println(query);    
           
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setBinaryStream(1, (InputStream)fis, (int)foto.length());
                System.out.println(ps.toString());
                ps.executeUpdate();
                conn.close();
            }                                   
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
    
    public ArrayList<Artikel> getArtikels(int wnk)
    {
        ArrayList<Artikel> arts = new ArrayList<Artikel>();
        try 
        {
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
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return arts;
    }
    
    public Artikel getArtikel(int id)
    {
        Artikel art = new Artikel();
        try 
        {
            try
            {
                conn = getConnetion();
                Statement st;
                st = conn.createStatement();

                String query = "SELECT * FROM artikels WHERE id = '" + id + "'";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    art.setID(rs.getInt("id"));
                    art.setNaam(rs.getString("naam"));
                    art.setBarcode(rs.getString("barcode"));
                    art.setPrijs(rs.getDouble("prijs"));
                    art.setPuntenGekregen(rs.getDouble("puntengekregen"));
                    art.setPuntenKopen(rs.getDouble("puntenkopen"));
                    art.setMinimum(rs.getInt("minimum"));
                    art.setWinkel(rs.getInt("winkel"));
                }
                conn.close();
            }
            catch (SQLException ex)
            {    
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return art;
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
    
    public Account getAccount(int acID)
    {
        Account ac = new Account();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM accounts WHERE id = '" + acID + "';";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    int id = rs.getInt("id");
                    String naam = rs.getString("naam");
                    String straat = rs.getString("straat");
                    String nummer = rs.getString("nummer");
                    String postcode = rs.getString("postcode");
                    String stad = rs.getString("stad");
                    String email = rs.getString("email");
                    String btw = rs.getString("btw");
                    boolean bedrijf = rs.getBoolean("bedrijf");
                    int aangemaaktD = rs.getInt("aangemaaktd");
                    int aangemaaktM = rs.getInt("aangemaaktm");
                    int aangemaaktJ = rs.getInt("aangemaaktj");
                    double gespaardePunten = rs.getDouble("gespaardepunten");
                    double werkelijkePunten = rs.getDouble("werkelijkepunten");
                    int geboorteD = rs.getInt("geboorted");
                    int geboorteM = rs.getInt("geboortem");
                    int geboorteJ = rs.getInt("geboortej");
                    boolean vip = rs.getBoolean("vip");
                    boolean bigSpender = rs.getBoolean("bigspender");
                    boolean wasBigSpender = rs.getBoolean("wasbigspender");
                    boolean wolverene = rs.getBoolean("wolverene");
                    boolean wasWolverene = rs.getBoolean("waswolverene");
                    String major = rs.getString("major");
                    String wasMajor = rs.getString("wasmajor");
                    InputStream foto = rs.getBinaryStream("foto");
                    ac.setAccount(id, naam, straat, nummer, postcode, stad, email, bedrijf, aangemaaktD, aangemaaktM, aangemaaktJ, gespaardePunten, werkelijkePunten, vip, bigSpender, wasBigSpender, wolverene, wasWolverene, major, wasMajor, foto);
                    if(bedrijf == false)
                    {
                        ac.setPrive(geboorteD, geboorteM, geboorteJ);
                    }
                    else
                    {
                        ac.setBedrijf(btw);
                    }
                }             
                conn.close();
            }
            catch (SQLException e)
            {
            }
        } 
        catch (ClassNotFoundException ex) 
        {
        }
        return ac;
    }
    
    public void addVerkoop(int wi, int fi, int acc, int artid, int hoev, double puntenGekr, double puntenKopen, double prijs) throws SQLException
    {
        try 
        {
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "INSERT INTO verkopen (winkel, filiaal, account, artikelid, hoeveelheid, datum, puntengekregen, puntenkopen, prijs) VALUES ('" 
                    + wi + "', '" + fi + "', '" + acc + "', '" + artid + "', '" + hoev + "', CURDATE(), '" + puntenGekr + "', '" + puntenKopen + "', '" + prijs + "')";
            
            st.executeUpdate(query);
            conn.close();
        } 
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public ArrayList<Account> getAccounts()
    {
        ArrayList<Account> accs = new ArrayList<Account>();
        try 
        {
            try
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM accounts";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    int id = rs.getInt("id");
                    String naam = rs.getString("naam");
                    String straat = rs.getString("straat");
                    String nummer = rs.getString("nummer");
                    String postcode = rs.getString("postcode");
                    String stad = rs.getString("stad");
                    String email = rs.getString("email");
                    String btw = rs.getString("btw");
                    boolean bedrijf = rs.getBoolean("bedrijf");
                    int aangemaaktD = rs.getInt("aangemaaktd");
                    int aangemaaktM = rs.getInt("aangemaaktm");
                    int aangemaaktJ = rs.getInt("aangemaaktj");
                    double gespaardePunten = rs.getDouble("gespaardepunten");
                    double werkelijkePunten = rs.getDouble("werkelijkepunten");
                    int geboorteD = rs.getInt("geboorted");
                    int geboorteM = rs.getInt("geboortem");
                    int geboorteJ = rs.getInt("geboortej");
                    boolean vip = rs.getBoolean("vip");
                    boolean bigSpender = rs.getBoolean("bigspender");
                    boolean wasBigSpender = rs.getBoolean("wasbigspender");
                    boolean wolverene = rs.getBoolean("wolverene");
                    boolean wasWolverene = rs.getBoolean("waswolverene");
                    String major = rs.getString("major");
                    String wasMajor = rs.getString("wasmajor");
                    InputStream foto = rs.getBinaryStream("foto");
                    Account ac = new Account();
                    ac.setAccount(id, naam, straat, nummer, postcode, stad, email, bedrijf, aangemaaktD, aangemaaktM, aangemaaktJ, gespaardePunten, werkelijkePunten, vip, bigSpender, wasBigSpender, wolverene, wasWolverene, major, wasMajor, foto);
                    if(bedrijf == false)
                    {
                        ac.setPrive(geboorteD, geboorteM, geboorteJ);
                    }
                    else
                    {
                        ac.setBedrijf(btw);
                    }
                    accs.add(ac);
                }
                conn.close();
            }
            catch (SQLException ex)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return accs;
    }
    
    public void updateFiliaal(int id, String naam, String straat, String nummer, String stad, String postcode, String telefoon,int winkel, String login, String pass)
    {
        
        try 
        {
            conn = getConnetion();
            Statement st;
            try 
            {
                st = conn.createStatement();
            
                System.out.println("ruben is een: ");
                String query = "UPDATE filialen SET naam = '" + naam + "', straat = '" + straat + "', nummer = '"  + nummer + "', stad = '" 
                            + stad + "', postcode = '" + postcode + "', telefoon = '" + telefoon + "', winkel = '" + winkel + "', login = '" + login + "', pass = '" + pass + "' WHERE id = '" + id + "'";
                System.out.println(query);
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
    
    public ArrayList<Filiaal> getFilialen(int wnk) throws SQLException
    {
        ArrayList<Filiaal> fils = new ArrayList<Filiaal>();
        try 
        {
            conn = getConnetion();
            Statement st = conn.createStatement();
            String query = "SELECT * FROM filialen WHERE winkel = '" + wnk + "'";
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String naam = rs.getString("naam");
                String straat = rs.getString("straat");
                String nummer = rs.getString("nummer");
                String postcode = rs.getString("postcode");
                String stad = rs.getString("stad");
                String telefoon = rs.getString("telefoon");
                int winkel = rs.getInt("winkel");
                String login = rs.getString("login");
                String pass = rs.getString("pass");
                String wnaam = getWinkel(winkel).getWinkelNaam();
                int wmajor = getWinkel(winkel).getMajor();
                Filiaal fi= new Filiaal(id, naam, straat, nummer, postcode, stad, telefoon, winkel, login, pass, wnaam, wmajor);
                fils.add(fi);
            }
            conn.close();
        }
        catch (ClassNotFoundException e)
        {
        }   
        return fils;
    }
    
    public boolean checkVip(int acId)
    {
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st;
                st = conn.createStatement();
                String query = "SELECT SUM(puntengekregen) FROM verkopen WHERE account = '" + acId + "' AND datum BETWEEN DATE_SUB(NOW(), INTERVAL 1 YEAR) AND NOW() ";
                ResultSet rs = st.executeQuery(query);
                double tot = 0;
                while(rs.next())
                {
                    tot = rs.getDouble(1);
                }
                conn.close();
                if(tot >= 10000)
                {
                    return true;
                }
            }
            catch (SQLException ex) 
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }
        return false;
    }

    public boolean checkBigSpender(int acId)
    {
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st;
                st = conn.createStatement();
                String query = "SELECT SUM(prijs) FROM verkopen WHERE account = '" + acId + "' AND datum BETWEEN DATE_SUB(NOW(), INTERVAL 1 YEAR) AND NOW() ";
                ResultSet rs = st.executeQuery(query);
                double tot = 0;
                while(rs.next())
                {
                    tot = rs.getDouble(1);
                }
                conn.close();
                if(tot >= 5000)
                {
                    return true;
                }
            }
            catch (SQLException ex) 
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }
        return false;
    }    
    
    public boolean checkWolverene(int acId)
    {
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st;
                st = conn.createStatement();
                String query = "SELECT COUNT(DISTINCT filialen.winkel) FROM verkopen RIGHT JOIN filialen ON filialen.id = verkopen.filiaal WHERE account = '" + acId + "' AND datum BETWEEN DATE_SUB(NOW(), INTERVAL 1 YEAR) AND NOW() ";
                ResultSet rs = st.executeQuery(query);
                int tot = 0;
                while(rs.next())
                {
                    tot = rs.getInt(1);
                }
                conn.close();
                if(tot >= 20)
                {
                    return true;
                }
            }
            catch (SQLException ex) 
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }
        return false;
    }

    public boolean checkMajor(int wId, int acId)
    {
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st;
                st = conn.createStatement();
                String query = "SELECT account FROM verkopen RIGHT JOIN filialen ON filialen.id = verkopen.filiaal WHERE filialen.winkel = '" + wId + "' AND datum BETWEEN DATE_SUB(NOW(), INTERVAL 1 YEAR) AND NOW() GROUP BY account ORDER BY SUM(prijs) DESC LIMIT 1";         
                ResultSet rs = st.executeQuery(query);
                System.out.println("TESTETEST" + wId);   
                int acCheck = 0;
                System.out.println("test : " + acCheck);
                while(rs.next())
                {
                    System.out.println("test2 : " + acCheck);
                    acCheck = rs.getInt(1);
                    System.out.println("test3 : " + acCheck);
                }
                System.out.println("test4 : " + acCheck);
                conn.close();
                if(acCheck == acId)
                {
                    return true;
                }
            }
            catch (SQLException ex) 
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }
        return false;
    } 
    
    public void newMajor(int wid, int acid)
    {
        try
        {     
            try
            {
                conn = getConnetion();
                Statement st = conn.createStatement();

                String query = "UPDATE winkels SET major = '" + acid + "' WHERE id = '" + wid + "' ";

                st.executeUpdate(query);
                conn.close();
            }
            catch (SQLException e)
            {
                
            }
        }
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public int getOMajor(int wid)
    {
        int major = 0;
        try
        {     
            try
            {
                conn = getConnetion();
                Statement st = conn.createStatement();

                String query = "SELECT major FROM winkels WHERE id = '" + wid + "' ";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    major = rs.getInt(1);
                }
                conn.close();
            }
            catch (SQLException e)
            {
                
            }
        }
        catch (ClassNotFoundException ex) 
        {
        }
        return major;
    }

    public void setOldMajor(int acid, String mj, String wmj)
    {
        try
        {     
            try
            {
                conn = getConnetion();
                Statement st = conn.createStatement();

                String query = "UPDATE accounts SET major = '" + mj + "', wasmajor = '" + wmj + "' WHERE id = '" + acid + "' ";

                st.executeUpdate(query);
                conn.close();
            }
            catch (SQLException e)
            {
                
            }
        }
        catch (ClassNotFoundException ex) 
        {
        }
    }    
    
    public ArrayList<Account> getMajor(int wId)
    {
        ArrayList<Account> aList = new ArrayList<Account>();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st;
                st = conn.createStatement();
                String query = "SELECT account, SUM(prijs) FROM verkopen RIGHT JOIN filialen ON filialen.id = verkopen.filiaal WHERE filialen.winkel = '" + wId + "' AND datum BETWEEN DATE_SUB(NOW(), INTERVAL 1 YEAR) AND NOW() GROUP BY account ORDER BY SUM(prijs) DESC";
                ResultSet rs = st.executeQuery(query);
                int acid = 0;
                while(rs.next())
                {
                    acid = rs.getInt("account");
                    Account a = getAccount(acid);
                    aList.add(a);
                }
                conn.close();
            }
            catch (SQLException ex) 
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }
        return aList;
    }
    
    public ArrayList<Winkel> getWinkels()
    {     
        ArrayList<Winkel> winks = new ArrayList<Winkel>();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM winkels";
                ResultSet rs = st.executeQuery(query);
                int id = 0;
                String naam = "";
                int major = 0;
                while(rs.next())
                {
                    Winkel wi = new Winkel();
                    id = rs.getInt("id");
                    naam = rs.getString("naam");
                    major = rs.getInt("major");
                    wi.setWinkelID(id);
                    wi.setWinkelNaam(naam);
                    wi.setMajor(major);
                    winks.add(wi);
                }
                conn.close();
                
                //System.out.println("login" + wi.getWinkelID() + " " + wi.getWinkelNaam()); // DEBUG
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return winks;
    }
    
    public void updateWinkel(int id, String naam, int major, String login, String pass)
    {
        
        try 
        {
            conn = getConnetion();
            Statement st;
            try 
            {
                st = conn.createStatement();
            
                
                String query = "UPDATE winkels SET naam = '" + naam + "', major = '" + major + "', login = '" + login + "', pass = '" + pass + "' WHERE id = '" + id + "'";
                System.out.println(query);
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

    public void updateAccountVerk(int id, double puntenGekr, double puntenKop, boolean vip, boolean bs, boolean wasbs, boolean wolverene, boolean waswolverene, String major, String wasmajor)
    {        
        try 
        {
            conn = getConnetion();
            Statement st;
            try 
            {
                st = conn.createStatement();
            
                
                String query = "UPDATE accounts SET gespaardepunten = '" + puntenGekr +  "', werkelijkepunten = '" + puntenKop + "', vip = " + vip + ", bigspender = "
                        + bs + ", wasbigspender = " + wasbs + ", wolverene = " + wolverene + ", waswolverene = " + waswolverene + ", major = '" + major + "', wasmajor = '"
                        + wasmajor +  "' WHERE id = '" + id + "'";
                System.out.println(query);
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
    
    public ArrayList<Verkopen> getVerkopenFiliaalTotaal(int filiaalid)
    {     
        ArrayList<Verkopen> verkopen = new ArrayList<Verkopen>();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT verkopen.*, artikels.naam FROM `verkopen` RIGHT JOIN artikels ON artikels.id = verkopen.artikelid WHERE verkopen.filiaal = '" + filiaalid + "' AND verkopen.prijs > 0";
                System.out.println(query);
                ResultSet rs = st.executeQuery(query);
                int id = 0;
                int filiaal = 0;
                int account = 0;
                int artikelid = 0;
                int hoev = 0;
                String datum = "";
                double puntengekr = 0;
                double puntenkopen = 0;
                double prijs = 0;
                String naam = "";
                while(rs.next())
                {
                    id = rs.getInt("id");
                    filiaal = rs.getInt("filiaal");
                    account = rs.getInt("account");
                    artikelid = rs.getInt("artikelid");
                    System.out.println(artikelid);
                    hoev = rs.getInt("hoeveelheid");
                    datum = "" + rs.getDate("datum");
                    puntengekr = rs.getDouble("puntengekregen");
                    puntenkopen = rs.getDouble("puntenkopen");
                    prijs = rs.getDouble("prijs");
                    naam = rs.getString("naam");
                    Verkopen verk = new Verkopen(id, filiaal, account, artikelid, hoev, datum, puntengekr, puntenkopen, prijs);
                    verk.setNaam(naam);
                    verkopen.add(verk);
                }
                conn.close();
                
                //System.out.println("login" + wi.getWinkelID() + " " + wi.getWinkelNaam()); // DEBUG
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return verkopen;
    }

    public ArrayList<Verkopen> getVerkopenFiliaalPunten(int filiaalid)
    {     
        ArrayList<Verkopen> verkopen = new ArrayList<Verkopen>();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT verkopen.*, artikels.naam FROM `verkopen` RIGHT JOIN artikels ON artikels.id = verkopen.artikelid WHERE verkopen.filiaal = '" + filiaalid + "' AND verkopen.puntenkopen > 0;";
                ResultSet rs = st.executeQuery(query);
                int id = 0;
                int filiaal = 0;
                int account = 0;
                int artikelid = 0;
                int hoev = 0;
                String datum = "";
                double puntengekr = 0;
                double puntenkopen = 0;
                double prijs = 0;
                String naam = "";
                while(rs.next())
                {
                    id = rs.getInt("id");
                    filiaal = rs.getInt("filiaal");
                    account = rs.getInt("account");
                    artikelid = rs.getInt("artikelid");
                    hoev = rs.getInt("hoeveelheid");
                    datum = rs.getString("datum");
                    puntengekr = rs.getDouble("puntengekregen");
                    puntenkopen = rs.getDouble("puntenkopen");
                    prijs = rs.getDouble("prijs");
                    naam = rs.getString("naam");
                    Verkopen verk = new Verkopen(id, filiaal, account, artikelid, hoev, datum, puntengekr, puntenkopen, prijs);
                    verk.setNaam(naam);
                    verkopen.add(verk);
                }
                conn.close();

            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return verkopen;
    }    
    
    public double getVerkopenFiliaalTotaalPG(int filiaalid)
    {
        double punten = 0;
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT SUM(puntengekregen) FROM `verkopen` WHERE verkopen.filiaal = '" + filiaalid + "' AND verkopen.prijs > 0;";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    punten = rs.getDouble(1);
                }
                conn.close();
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return punten;
    }
    
    public double getVerkopenFiliaalTotaalPr(int filiaalid)
    {
        double prijs = 0;
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT SUM(prijs) FROM `verkopen` WHERE verkopen.filiaal = '" + filiaalid + "' AND verkopen.prijs > 0;";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    prijs = rs.getDouble(1);
                }
                conn.close();
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return prijs;
    }
    
    public double getVerkopenFiliaalPuntenPK(int filiaalid)
    {
        double punten = 0;
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT SUM(puntenkopen) FROM `verkopen` WHERE verkopen.filiaal = '" + filiaalid + "' AND verkopen.puntenkopen > 0;";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    punten = rs.getDouble(1);
                }
                conn.close();
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return punten;
    }
    
    public void deleteArtikel(int id) throws SQLException
    {
        try
        {                    
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "DELETE FROM artikels WHERE id = '" + id + "' ";
            
            st.executeUpdate(query);
            conn.close();
        }
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public void deleteFiliaal(int id) throws SQLException
    {
        try
        {                    
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "DELETE FROM filialen WHERE id = '" + id + "' ";
            
            st.executeUpdate(query);
            conn.close();
        }
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public Spaarkaart getSpaarkaart(int sID)
    {
        Spaarkaart sk = new Spaarkaart();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM spaarkaarten RIGHT JOIN accounts ON accounts.id = spaarkaarten.account WHERE spaarkaarten.id = '" + sID + "';";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    int sId = rs.getInt("spaarkaarten.id");
                    int account = rs.getInt("spaarkaarten.account");
                    String snaam = rs.getString("spaarkaarten.naam");
                    String svoornaam = rs.getString("spaarkaarten.voornaam");
                    System.out.println(svoornaam);
                    int id = rs.getInt("accounts.id");
                    String naam = rs.getString("accounts.naam");
                    String straat = rs.getString("accounts.straat");
                    String nummer = rs.getString("accounts.nummer");
                    String postcode = rs.getString("accounts.postcode");
                    String stad = rs.getString("accounts.stad");
                    String email = rs.getString("accounts.email");
                    String btw = rs.getString("accounts.btw");
                    boolean bedrijf = rs.getBoolean("accounts.bedrijf");
                    int aangemaaktD = rs.getInt("accounts.aangemaaktd");
                    int aangemaaktM = rs.getInt("accounts.aangemaaktm");
                    int aangemaaktJ = rs.getInt("accounts.aangemaaktj");
                    double gespaardePunten = rs.getDouble("accounts.gespaardepunten");
                    double werkelijkePunten = rs.getDouble("accounts.werkelijkepunten");
                    int geboorteD = rs.getInt("accounts.geboorted");
                    int geboorteM = rs.getInt("accounts.geboortem");
                    int geboorteJ = rs.getInt("accounts.geboortej");
                    boolean vip = rs.getBoolean("accounts.vip");
                    boolean bigSpender = rs.getBoolean("accounts.bigspender");
                    boolean wasBigSpender = rs.getBoolean("accounts.wasbigspender");
                    boolean wolverene = rs.getBoolean("accounts.wolverene");
                    boolean wasWolverene = rs.getBoolean("accounts.waswolverene");
                    String major = rs.getString("accounts.major");
                    String wasMajor = rs.getString("accounts.wasmajor");
                    InputStream foto = rs.getBinaryStream("accounts.foto");
                    sk.setSpaarkaart(sId, account, snaam, svoornaam);
                    sk.setAccount(id, naam, straat, nummer, postcode, stad, email, bedrijf, aangemaaktD, aangemaaktM, aangemaaktJ, gespaardePunten, werkelijkePunten, vip, bigSpender, wasBigSpender, wolverene, wasWolverene, major, wasMajor, foto);
                    if(bedrijf == false)
                    {
                        sk.setPrive(geboorteD, geboorteM, geboorteJ);
                    }
                    else
                    {
                        sk.setBedrijf(btw);
                    }
                }             
                conn.close();
            }
            catch (SQLException e)
            {
            }
        } 
        catch (ClassNotFoundException ex) 
        {
        }
        return sk;
    }
    
    public ArrayList<Spaarkaart> getSpaarkaarten(int acID)
    {
        ArrayList<Spaarkaart> skl = new ArrayList<Spaarkaart>();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM spaarkaarten RIGHT JOIN accounts ON accounts.id = spaarkaarten.account WHERE account = '" + acID + "';";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    int sId = rs.getInt("spaarkaarten.id");
                    int account = rs.getInt("spaarkaarten.account");
                    String snaam = rs.getString("spaarkaarten.naam");
                    String svoornaam = rs.getString("spaarkaarten.voornaam");
                    int id = rs.getInt("accounts.id");
                    String naam = rs.getString("accounts.naam");
                    String straat = rs.getString("accounts.straat");
                    String nummer = rs.getString("accounts.nummer");
                    String postcode = rs.getString("accounts.postcode");
                    String stad = rs.getString("accounts.stad");
                    String email = rs.getString("accounts.email");
                    String btw = rs.getString("accounts.btw");
                    boolean bedrijf = rs.getBoolean("accounts.bedrijf");
                    int aangemaaktD = rs.getInt("accounts.aangemaaktd");
                    int aangemaaktM = rs.getInt("accounts.aangemaaktm");
                    int aangemaaktJ = rs.getInt("accounts.aangemaaktj");
                    double gespaardePunten = rs.getDouble("accounts.gespaardepunten");
                    double werkelijkePunten = rs.getDouble("accounts.werkelijkepunten");
                    int geboorteD = rs.getInt("accounts.geboorted");
                    int geboorteM = rs.getInt("accounts.geboortem");
                    int geboorteJ = rs.getInt("accounts.geboortej");
                    boolean vip = rs.getBoolean("accounts.vip");
                    boolean bigSpender = rs.getBoolean("accounts.bigspender");
                    boolean wasBigSpender = rs.getBoolean("accounts.wasbigspender");
                    boolean wolverene = rs.getBoolean("accounts.wolverene");
                    boolean wasWolverene = rs.getBoolean("accounts.waswolverene");
                    String major = rs.getString("accounts.major");
                    String wasMajor = rs.getString("accounts.wasmajor");
                    InputStream foto = rs.getBinaryStream("accounts.foto");
                    Spaarkaart sk = new Spaarkaart();
                    sk.setSpaarkaart(sId, account, snaam, svoornaam);
                    sk.setAccount(id, naam, straat, nummer, postcode, stad, email, bedrijf, aangemaaktD, aangemaaktM, aangemaaktJ, gespaardePunten, werkelijkePunten, vip, bigSpender, wasBigSpender, wolverene, wasWolverene, major, wasMajor, foto);
                    if(bedrijf == false)
                    {
                        sk.setPrive(geboorteD, geboorteM, geboorteJ);
                    }
                    else
                    {
                        sk.setBedrijf(btw);
                    }
                    skl.add(sk);
                }             
                conn.close();
            }
            catch (SQLException e)
            {
            }
        } 
        catch (ClassNotFoundException ex) 
        {
        }
        return skl;
    }
    
    public ArrayList<Spaarkaart> getSpaarkaarten()
    {
        ArrayList<Spaarkaart> skl = new ArrayList<Spaarkaart>();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT * FROM spaarkaarten RIGHT JOIN accounts ON accounts.id = spaarkaarten.account WHERE spaarkaarten.id IS NOT NULL;";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    int sId = rs.getInt("spaarkaarten.id");
                    int account = rs.getInt("spaarkaarten.account");
                    String snaam = rs.getString("spaarkaarten.naam");
                    String svoornaam = rs.getString("spaarkaarten.voornaam");
                    int id = rs.getInt("accounts.id");
                    String naam = rs.getString("accounts.naam");
                    String straat = rs.getString("accounts.straat");
                    String nummer = rs.getString("accounts.nummer");
                    String postcode = rs.getString("accounts.postcode");
                    String stad = rs.getString("accounts.stad");
                    String email = rs.getString("accounts.email");
                    String btw = rs.getString("accounts.btw");
                    boolean bedrijf = rs.getBoolean("accounts.bedrijf");
                    int aangemaaktD = rs.getInt("accounts.aangemaaktd");
                    int aangemaaktM = rs.getInt("accounts.aangemaaktm");
                    int aangemaaktJ = rs.getInt("accounts.aangemaaktj");
                    double gespaardePunten = rs.getDouble("accounts.gespaardepunten");
                    double werkelijkePunten = rs.getDouble("accounts.werkelijkepunten");
                    int geboorteD = rs.getInt("accounts.geboorted");
                    int geboorteM = rs.getInt("accounts.geboortem");
                    int geboorteJ = rs.getInt("accounts.geboortej");
                    boolean vip = rs.getBoolean("accounts.vip");
                    boolean bigSpender = rs.getBoolean("accounts.bigspender");
                    boolean wasBigSpender = rs.getBoolean("accounts.wasbigspender");
                    boolean wolverene = rs.getBoolean("accounts.wolverene");
                    boolean wasWolverene = rs.getBoolean("accounts.waswolverene");
                    String major = rs.getString("accounts.major");
                    String wasMajor = rs.getString("accounts.wasmajor");
                    InputStream foto = rs.getBinaryStream("accounts.foto");
                    Spaarkaart sk = new Spaarkaart();
                    sk.setSpaarkaart(sId, account, snaam, svoornaam);
                    sk.setAccount(id, naam, straat, nummer, postcode, stad, email, bedrijf, aangemaaktD, aangemaaktM, aangemaaktJ, gespaardePunten, werkelijkePunten, vip, bigSpender, wasBigSpender, wolverene, wasWolverene, major, wasMajor, foto);
                    if(bedrijf == false)
                    {
                        sk.setPrive(geboorteD, geboorteM, geboorteJ);
                    }
                    else
                    {
                        sk.setBedrijf(btw);
                    }
                    skl.add(sk);
                }             
                conn.close();
            }
            catch (SQLException e)
            {
            }
        } 
        catch (ClassNotFoundException ex) 
        {
        }
        return skl;
    }
    
    public void addSpaarkaart(int ac, String naam, String voornaam)
    {
        try
        {
            try
            {
                conn = getConnetion();
                Statement st = conn.createStatement();

                String query = "INSERT INTO spaarkaarten (account, naam, voornaam) VALUES ('" + ac + "', '" + naam + "', '" + voornaam + "')";

                st.executeUpdate(query);
                conn.close();
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException ex) 
        {
        }
    }
    
    public void updateSpaarkaart(int id, int ac, String naam, String voornaam)
    {
        
        try 
        {
            conn = getConnetion();
            Statement st;
            try 
            {
                st = conn.createStatement();
            
                
                String query = "UPDATE winkels SET account = '" + ac + "', naam = '" + naam + "', voornaam = '" + voornaam + "' WHERE id = '" + id + "'";
                System.out.println(query);
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
    
    public void deleteWinkel(int id) throws SQLException
    {
        try
        {                    
            conn = getConnetion();
            Statement st = conn.createStatement();
            
            String query = "DELETE FROM winkels WHERE id = '" + id + "' ";
            
            st.executeUpdate(query);
            conn.close();
        }
        catch (ClassNotFoundException ex) 
        {
        }
    } 
    
    public ArrayList<Verkopen> getVerkopenWinkelPunten(int winkelid)
    {     
        ArrayList<Verkopen> verkopen = new ArrayList<Verkopen>();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT verkopen.*, artikels.naam FROM `verkopen` RIGHT JOIN artikels ON artikels.id = verkopen.artikelid RIGHT JOIN filialen ON filialen.id = verkopen.filiaal WHERE filialen.winkel = '" + winkelid + "' AND verkopen.puntenkopen > 0;";
                ResultSet rs = st.executeQuery(query);
                int id = 0;
                int filiaal = 0;
                int account = 0;
                int artikelid = 0;
                int hoev = 0;
                String datum = "";
                double puntengekr = 0;
                double puntenkopen = 0;
                double prijs = 0;
                String naam = "";
                while(rs.next())
                {
                    id = rs.getInt("id");
                    filiaal = rs.getInt("filiaal");
                    account = rs.getInt("account");
                    artikelid = rs.getInt("artikelid");
                    hoev = rs.getInt("hoeveelheid");
                    datum = rs.getString("datum");
                    puntengekr = rs.getDouble("puntengekregen");
                    puntenkopen = rs.getDouble("puntenkopen");
                    prijs = rs.getDouble("prijs");
                    naam = rs.getString("naam");
                    Verkopen verk = new Verkopen(id, filiaal, account, artikelid, hoev, datum, puntengekr, puntenkopen, prijs);
                    verk.setNaam(naam);
                    verkopen.add(verk);
                }
                conn.close();

            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return verkopen;
    }    

    public ArrayList<Verkopen> getVerkopenWinkelTotaal(int wid)
    {     
        ArrayList<Verkopen> verkopen = new ArrayList<Verkopen>();
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT verkopen.*, artikels.naam FROM `verkopen` RIGHT JOIN artikels ON artikels.id = verkopen.artikelid RIGHT JOIN filialen ON filialen.id = verkopen.filiaal WHERE filialen.winkel = '" + wid + "' AND verkopen.prijs > 0";
                ResultSet rs = st.executeQuery(query);
                int id = 0;
                int filiaal = 0;
                int account = 0;
                int artikelid = 0;
                int hoev = 0;
                String datum = "";
                double puntengekr = 0;
                double puntenkopen = 0;
                double prijs = 0;
                String naam = "";
                while(rs.next())
                {
                    id = rs.getInt("id");
                    filiaal = rs.getInt("filiaal");
                    account = rs.getInt("account");
                    artikelid = rs.getInt("artikelid");
                    hoev = rs.getInt("hoeveelheid");
                    datum = "" + rs.getDate("datum");
                    puntengekr = rs.getDouble("puntengekregen");
                    puntenkopen = rs.getDouble("puntenkopen");
                    prijs = rs.getDouble("prijs");
                    naam = rs.getString("naam");
                    Verkopen verk = new Verkopen(id, filiaal, account, artikelid, hoev, datum, puntengekr, puntenkopen, prijs);
                    verk.setNaam(naam);
                    verkopen.add(verk);
                }
                conn.close();
                
                //System.out.println("login" + wi.getWinkelID() + " " + wi.getWinkelNaam()); // DEBUG
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return verkopen;
    }    
    
    public double getVerkopenWinkelPuntenPK(int winkelid)
    {
        double punten = 0;
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT SUM(puntenkopen) FROM `verkopen` RIGHT JOIN filialen ON filialen.id = verkopen.filiaal WHERE filialen.winkel = '" + winkelid + "' AND verkopen.puntenkopen > 0;";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    punten = rs.getDouble(1);
                }
                conn.close();
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return punten;
    } 
    
    public double getVerkopenWinkelTotaalPG(int wid)
    {
        double punten = 0;
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT SUM(puntengekregen) FROM `verkopen` RIGHT JOIN filialen ON filialen.id = verkopen.filiaal WHERE filialen.winkel = '" + wid + "' AND verkopen.prijs > 0;";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    punten = rs.getDouble(1);
                }
                conn.close();
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return punten;
    }
    
    public double getVerkopenWinkelTotaalPr(int wid)
    {
        double prijs = 0;
        try 
        {
            try 
            {
                conn = getConnetion();
                Statement st = conn.createStatement();
                String query = "SELECT SUM(prijs) FROM `verkopen` RIGHT JOIN filialen ON filialen.id = verkopen.filiaal WHERE filialen.winkel = '" + wid + "' AND verkopen.prijs > 0;";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    prijs = rs.getDouble(1);
                }
                conn.close();
            }
            catch (SQLException e)
            {
            }
        }
        catch (ClassNotFoundException e)
        {
        }   
        return prijs;
    }
}