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
    Csiga[] csigak = new Csiga[3];
    private final static Random RNG = new Random();

    public Jatek(int korokSzama) {
        int i = 0;
        this.korokSzama = korokSzama;
        this.csigak[i++] = new Csiga(Szinek.PIROS);
        this.csigak[i++] = new Csiga(Szinek.ZOLD);
        this.csigak[i++] = new Csiga(Szinek.KEK);
    }
    
    public String start(Szinek szavazas){
        for(int i = 0; i < korokSzama; i++){
            gyorsasagSorsolas();
            csigaFut();
        }
        int nyi = gyoztesKereses();
        return "Te a " + szavazas + " színű csigára fogadtál!\n" + 
                this.CsigakToString() +
               "A " + csigak[nyi].getSzin() + "-ű nyert!\n" +
               "Te " + (csigak[nyi].getSzin()==szavazas?"Nyertél!":"Vesztettél!):")+"\n";
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
            if(csigak[nyi].getTav() < csigak[i].getTav()){
                nyi = i;
            }
        }
        return nyi;
    }

    private String CsigakToString() {
        int i = 0;
        return csigak[i++].toString() + "\n" +
               csigak[i++].toString() + "\n" +
               csigak[i++].toString() + "\n";
    }
    
    
    
}
