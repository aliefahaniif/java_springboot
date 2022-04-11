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
public class Cars extends Vehicles{
    int wheels_count;
    String engine_type;

    public Cars(String name, String with_engine, int wheels_count, String engine_type) {
      super(name, with_engine);
      this.wheels_count = wheels_count;
      this.engine_type = engine_type;
      
    }
    
    @Override
    public void identify_myself(){
        System.out.println(" ");  
        System.out.print("Hi, I'm Car, ");
        super.identify_myself();
        System.out.print(", I have " + wheels_count + " Wheel(s), My Engine Type = " + engine_type);
    } 
}
