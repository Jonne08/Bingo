
package bingo;

import java.util.Calendar;

public class Datum {
  private int dag;
  private int maand;
  private int jaar;
 
  public Datum(){
    Calendar calendar = Calendar.getInstance();
    dag = calendar.get(Calendar.DAY_OF_MONTH);
    maand = calendar.get(Calendar.MONTH) + 1;
    jaar = calendar.get(Calendar.YEAR);
  }
 
  public Datum(int dag, int maand, int jaar){
    this.dag = dag;
    this.maand = maand;
    this.jaar = jaar;
  }
 
  public String toString(){
    return dag + "/" + maand + "/" + jaar;
  }
 
  public int aantalDagenTot(Datum datum){
    int aantaldagen = 0;
    Calendar beginDatum = Calendar.getInstance();
    beginDatum.set(Calendar.DAY_OF_MONTH, dag);
    beginDatum.set(Calendar.MONTH, maand - 1);
    beginDatum.set(Calendar.YEAR, jaar);
   
    Calendar eindDatum = Calendar.getInstance();
    eindDatum.set(Calendar.DAY_OF_MONTH, datum.dag);
    eindDatum.set(Calendar.MONTH, datum.maand - 1);
    eindDatum.set(Calendar.YEAR, datum.jaar);
    while(beginDatum.before(eindDatum)){
          aantaldagen++;
          beginDatum.add(Calendar.DAY_OF_YEAR, 1 );
      }
    return aantaldagen;
  }
}