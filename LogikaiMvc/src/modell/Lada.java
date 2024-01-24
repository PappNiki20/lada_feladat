/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author PappNikoletta(SZF_20
 */
public class Lada {
    private String anyag,felirat;
    private boolean kincs;

    public Lada(String anyag, String felirat) {
       this(anyag,felirat,false);
    }

    public Lada(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setFelirat(String felirat) {
        this.felirat = felirat;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }
}
