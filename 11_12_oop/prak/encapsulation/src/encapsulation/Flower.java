/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author user
 */
public class Flower {
    private String type, color;
    private int num_of_petal;

    //type
    public void settype(String jenis) {
        type = jenis;
        this.type = type;  
    }
    
    public String gettype() {
        return type;
    }
    
    // color
        public void setcolor(String warna) {
        color = warna;
        this.color = color;  
    }
    
    public String getcolor() {
        return color;
    }
    
    // num of petal 
    public void setnum_of_petal(int num_of_petal) {
        this.num_of_petal = num_of_petal;
    }
    
    public int getnum_of_petal() {
        return num_of_petal;
    }

}
