/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mian;
import enums.Szinek;
import java.util.Objects;
import java.util.Random;
/**
 *
 * @author ravasszdi
 */
public class Csiga {
    public static final char CHAR_NORMAL = '-';
    public static final char CHAR_GYORS = '=';
    public static final String CSIGA_JEL = "ᯓ๑ï";
    private Szinek szin;
    private String ut;
    private boolean gyors;
    static final Random RND = new Random();

/*Változók*/
/*Konstrukrorok*/
    
    public Csiga(Szinek szin, String ut, boolean gyors) {
        this.szin = szin;
        this.ut = ut;
        this.gyors = gyors;
    }

    public Csiga(Szinek szin) {
        this(szin, "", false);
    }

    public Csiga() {
        this(Szinek.KEK);
    }

/*Konstrukrorok*/
/*get/set*/
    
    public String getUt() {
        return ut;
    }

    public Szinek getSzin() {
        return szin;
    }

    public void setGyors() {
        this.gyors = true;
    }

/*get/set*/
/*misc. Metódusok*/
    public void fut(){
        if(gyors){
            int rnd = RND.nextInt(0, 4*2);
            for(int i = 0; i < rnd; i++){ut += CHAR_GYORS;}
        }else{
            int rnd = RND.nextInt(0, 4);
            for(int i = 0; i < rnd; i++){ut += CHAR_NORMAL;}
        }
        gyors = false;
    }

    public String kijelzes() {
        return szin.getSzinKod() + ut + CSIGA_JEL;
    }

/*misc. Metódusok*/
/*override metódusok*/    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.szin);
        hash = 17 * hash + Objects.hashCode(this.ut);
        hash = 17 * hash + (this.gyors ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Csiga other = (Csiga) obj;
        if (this.gyors != other.gyors) {
            return false;
        }
        if (!Objects.equals(this.ut, other.ut)) {
            return false;
        }
        return this.szin == other.szin;
    }

    @Override
    public String toString() {
        return "Csiga{" + "szin=" + szin + ", ut=" + ut + ", gyors=" + gyors + '}';
    }
    
    
}
