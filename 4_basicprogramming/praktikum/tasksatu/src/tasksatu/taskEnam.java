/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksatu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class taskEnam {
    public static void main(String[] args) {
        int x,n;
        int exponen;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan x : ");
        x = input.nextInt();
        System.out.print("Masukan n : ");
        n = input.nextInt();
        
        exponen = (int) Math.pow(x, n);
        System.out.println("Hasil : " + exponen);
    }
}
