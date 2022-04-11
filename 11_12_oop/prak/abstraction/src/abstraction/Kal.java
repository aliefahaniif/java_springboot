/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author user
 */
public class Kal{
    private double x, y;
    // value 1
    public void setx(int x) {
        this.x = x;
    }
    
    public double getx() {
        return x;
    }
    
    // value 2
    public void sety(int y) {
        this.y = y;
    }
    
    public double gety() {
        return y;
    }
    
    // Addition
    public void add(){
        double c;
        c = x + y;

        System.out.println ("The total value is " + c);
        return;
    }
    
    // Substraction
    public void sub(){
        double c;
        c = x - y;

        System.out.println ("The total value is " + c);
        return;
    }
    
    // Multiply
    public void mult(){
        double c;
        c = x * y;

        System.out.println ("The total value is " + c);
        return;
    }
    
    // Divide
    public void div(){
        double c;
        c = x / y;

        System.out.println ("The total value is " + c);
        return;
    }

}
    

