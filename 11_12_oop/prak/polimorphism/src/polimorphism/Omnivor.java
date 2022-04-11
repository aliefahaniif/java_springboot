/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author user
 */
public class Omnivor extends Animals {
    Omnivor(String ayam, String semua, String tajam_dan_tumpul) {
        super(ayam, semua, tajam_dan_tumpul);
    }
    
    @Override
    public void identify_myself(){
        System.out.println(" ");
        if((food=="semua")&&(teeth=="tajam dan tumpul")){
            System.out.print("Hi I'm Omnivor, ");
            super.identify_myself();
        }
    }
    
}
