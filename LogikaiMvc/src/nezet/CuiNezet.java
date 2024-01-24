
package nezet;

import java.util.Scanner;

public class CuiNezet {
    private static final Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();
    
    
    
    private void konzolraIr(String msg){
        System.out.println(msg);
    }
    
    public void leirasMegjelito(String msg){
        konzolraIr(msg+SEP);
    }
     public void feladatMegjelito(String msg){
        konzolraIr(msg+SEP);
    }
     public int valasztas(String msg){
         konzolraIr(msg);
         return sc.nextInt();
     }
      public void eredmenyMegjelito(String msg){
        konzolraIr(msg+SEP);
    }
}
