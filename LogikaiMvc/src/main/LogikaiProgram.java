
package main;

import modell.Lada;
import nezet.CuiNezet;

public class LogikaiProgram {

    public static void main(String[] args) {
       Lada ezust = new Lada("Ezüst","nem én rejtem");
       Lada bronz = new Lada("Bronz","az arany hazudik",true);
       Lada arany = new Lada("Arany","én rejtem");
       CuiNezet cui = new CuiNezet();
      cui.feladatMegjelito("Csak 1 igaz!");
      cui.leirasMegjelito("arany:  "+arany.getFelirat()+"\n"+"ezüst: "+ezust.getFelirat()+"\n"+"bronz: "+arany.getFelirat());
      cui.valasztas("melyik? (0..2)");
      
    }
    
}
