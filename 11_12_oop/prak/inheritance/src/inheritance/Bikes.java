/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author user
 */
public class Bikes extends Vehicles{
    int wheels_count;

    public Bikes(String name, String with_engine, int wheels_count) {
      super(name, with_engine);
      this.wheels_count = wheels_count;
      
    }
    
    @Override
    public void identify_myself(){
        System.out.println(" ");  
        System.out.print("Hi, I'm Bike, ");
        super.identify_myself();
        System.out.print(", I have " + wheels_count + " Wheel(s)");
    } 
}
