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
public class Csiga {
    private Szinek szin;
    private int tav;
    private String ut;
    private boolean gyors;
    static final Random RND = new Random();

    public Csiga(Szinek szin) {
        this.szin = szin;
        this.tav = 0;
        this.ut = szin.getSzin();
        this.gyors = false;
    }

    public int getTav() {
        return tav;
    }

    public String getUt() {
        return ut;
    }

    public Szinek getSzin() {
        return szin;
    }

    public void setGyors() {
        this.gyors = true;
    }
    
    public void fut(){
        if(gyors){
            int rnd = RND.nextInt(0, 4)*2;
            tav += rnd;
            for(int i = 0; i < rnd; i++){ut += "=";}
        }else{
            int rnd = RND.nextInt(0, 4);
            tav += rnd;
            for(int i = 0; i < rnd; i++){ut += "-";}
        }
        gyors = false;
    }

    @Override
    public String toString() {
        return ut + "ᯓ๑ï";
    }
    
}
