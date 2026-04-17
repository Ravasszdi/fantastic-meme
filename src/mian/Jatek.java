/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mian;

import enums.Szinek;
import java.util.Random;

/**
 *
 * @author ravasszdi
 */
public class Jatek {
    private int korokSzama;
    Csiga[] csigak;
    private final static Random RNG = new Random();

    public Jatek(int korokSzama, Csiga[] csigak) {
        this.korokSzama = korokSzama<0?1:korokSzama;
        this.csigak = csigak;
    }

    public Jatek(int korokSzama, Szinek szinek[]) {
        this(korokSzama,csigaGyar(szinek));
    }

    public Jatek(int korokSzama) {
        this(korokSzama,csigaGyar());
    }
    
    public Jatek() {
        this(3, csigaGyar());
    }
    
    public String start(Szinek szavazas){
        csigakFutas();
        int nyi = gyoztesKereses();
        return "Te a " + szavazas + " színű csigára fogadtál!\n" + 
                this.CsigakMegjelenitese() +
               "A " + csigak[nyi].getSzin() + "-ű nyert!\n" +
               "Te " + (csigak[nyi].getSzin()==szavazas?"Nyertél!":"Vesztettél!):")+"\n";
    }
    
    private void csigakFutas() {
        for(int i = 0; i < korokSzama; i++){
            gyorsasagSorsolas();
            csigaFut();
        }
    }
    
    private void gyorsasagSorsolas(){
        if(RNG.nextDouble()<0.2){
            csigak[RNG.nextInt(3)].setGyors();
        }else{}
    }
    
    private void csigaFut(){
        for(int j = 0; j < csigak.length; j++){
            csigak[j].fut();
        }
    }
    
    private int gyoztesKereses(){
        int nyi = 0;
        for(int i = 1; i < csigak.length; i++){
            if(csigak[nyi].getUt().length() < csigak[i].getUt().length()){
                nyi = i;
            }
        }
        return nyi;
    }

    private String CsigakMegjelenitese() {
        String ki = "";
        for (int i = 0; i < csigak.length; i++) {
            ki += csigak[i].kijelzes() + "\n";
        }
        return ki;
    }
    
    private static Csiga[] csigaGyar(Szinek[] szinek){
        Csiga[] csigakTmp = new Csiga[szinek.length];
        for (int i = 0; i < szinek.length; i++) {
            csigakTmp[i] = new Csiga(szinek[i]);
        }
        return csigakTmp;
    }
    
    private static Csiga[] csigaGyar(){
        Szinek[] szinek = {Szinek.KEK, Szinek.PIROS, Szinek.ZOLD};
        Csiga[] csigakTmp = new Csiga[szinek.length];
        for (int i = 0; i < szinek.length; i++) {
            csigakTmp[i] = new Csiga(szinek[i]);
        }
        return csigakTmp;
    }
    
}
