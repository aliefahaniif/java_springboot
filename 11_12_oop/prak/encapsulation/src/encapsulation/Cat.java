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
public class Cat {
    private String fur_color;
    private int num_of_leg;

    public void setfur_color(String warna) {
        fur_color = warna;
        this.fur_color = fur_color;  
    }
    
    public String getfur_color() {
        return fur_color;
    }

    public void setnum_of_leg(int num_of_leg) {
        this.num_of_leg = num_of_leg;
    }
    
    public int getnum_of_leg() {
        return num_of_leg;
    }

    
}
