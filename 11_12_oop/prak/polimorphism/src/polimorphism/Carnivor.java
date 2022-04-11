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
public class Carnivor extends Animals{
    Carnivor(String singa, String daging, String tajam) {
        super(singa, daging, tajam);
    }
    
    @Override
    public void identify_myself(){
        System.out.println(" ");
        if((food=="daging")&&(teeth=="tajam")){
            System.out.print("Hi I'm Carnivor, ");
            super.identify_myself();
        }
    } 
    
}
