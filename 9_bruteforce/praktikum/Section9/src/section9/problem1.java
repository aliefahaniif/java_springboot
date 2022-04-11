/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section9;

/**
 *
 * @author user
 */
public class problem1 {
    public static void main(String[] args) {
        System.out.println(SimpleEquation(6,6,14));
        //System.out.println(SimpleEquation(6,7,23));
    }

    private static String SimpleEquation(int n_satu, int n_dua, int n_tiga) {
        for(int x=1; x<=n_satu; x++){
            for(int y=x+1 ; y<=n_satu; y++){
                int z=n_satu-(x+y);
                    if((x+y+z)==n_dua && ((x*x) + (y*y) + (z*z)==n_tiga)){
                    return String.format("x = %s, y= %s, z = %s",x,y,z);
                   }
            }
        }
        return "No Solution!";
    }
}

    
