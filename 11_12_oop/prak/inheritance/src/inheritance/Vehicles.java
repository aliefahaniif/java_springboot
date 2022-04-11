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
public class Vehicles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicles g;
        Bikes pedalb, motorb;
        Cars sportc, pickupc;
        Buses transb, schoolb;
        
        g = new Vehicles("Gerobak", "'no engine'");
        g.hi_vehicles();
        g.identify_myself();
        System.out.println(" ");
        
        // Bikes
        pedalb = new Bikes("Pedal Bikes", "'no engine'", 2);
        motorb = new Bikes("Motor Bikes", "'with engine'", 2);
        pedalb.identify_myself();
        motorb.identify_myself();
        System.out.println(" ");

        // Cars
        sportc = new Cars("Sport Cars", "'with engine'", 4, "V8");
        pickupc = new Cars("Pick Up Cars", "'with engine'", 4, "Solar");
        sportc.identify_myself();
        pickupc.identify_myself();
        System.out.println(" ");
        
        // Buses
        transb = new Buses("Public Bus", "Trans Jakarta", "'with engine'", 4);
        schoolb = new Buses("Private Bus", "School Bus", "'with engine'", 4);
        transb.identify_myself();
        schoolb.identify_myself();
        System.out.println(" ");        
    }
    
    private String name;
    private String with_engine;
    
    public Vehicles(String name, String with_engine){
        this.name = name;
        this.with_engine = with_engine;
    }
    
    public void hi_vehicles(){
        System.out.print("Hi, I'm Parent of All Vehicles, ");
    }
    
    public void identify_myself(){
        System.out.print("My name is " +name+ ", My Engine Status is " + with_engine);
    }
    
}
