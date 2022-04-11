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
public class Animals {
    String name, food, teeth ;
    
    public Animals(String name, String food, String teeth){
        this.name = name;
        this.food = food;
        this.teeth = teeth;
    }
    
    public Animals(String nama){
        this.name = nama;
    }
    
    public void hi_animals(){
        System.out.print("Hi, I'm Parent of All Animal, My name is " +name);
    }
    
    public void identify_myself(){
        System.out.print("My name is " +name+ ", My Food is '" + food + "', I have "+teeth+" teeth");
    }
    
    public static void main(String[] args) {
        Animals a = new Animals("Binatang");
        a.hi_animals();
        
        Herbivor h = new Herbivor("Kambing", "tumbuhan", "tumpul");
        h.identify_myself();
        
        Carnivor c = new Carnivor("Singa", "daging", "tajam");
        c.identify_myself();
        
        Omnivor o = new Omnivor("Ayam", "semua", "tajam dan tumpul");
        o.identify_myself();
        System.out.println(" ");
        
        
    }
    
}
