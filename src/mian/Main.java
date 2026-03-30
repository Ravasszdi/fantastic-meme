/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mian;

import enums.Szinek;

/**
 *
 * @author ravasszdi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jatek j1 = new Jatek(5);
        Szinek fogadas = Szinek.PIROS;
        System.out.printf(j1.start(fogadas));
    }
    
}
