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
public class Herbivor extends Animals{
    Herbivor(String kambing, String tumbuhan, String tumpul) {
        super(kambing, tumbuhan, tumpul);
    }
    
    @Override
    public void identify_myself(){
        System.out.println(" ");
        if((food=="tumbuhan")&&(teeth=="tumpul")){
            System.out.print("Hi I'm Herbivor, ");
            super.identify_myself();
        }
    } 
}
