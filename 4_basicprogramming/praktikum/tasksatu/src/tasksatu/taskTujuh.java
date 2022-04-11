/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksatu;

import java.util.Scanner;

/**
 *
 * @author Aliefa Haniif
 */
public class taskTujuh {

    public static void main(String[] args) {
       int nilai;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        nilai = input.nextInt();
        
        for (int x = 1; x <= nilai; x++){
           for (int y = nilai-1; y >= x; y--) {
               System.out.print(' ');
           }
           for (int z = 1; z <= x; z++){
               System.out.print('*');
           }
           for (int w = 1; w <= x-1; w++){
               System.out.print(' ');
               System.out.print('*');
           }
           System.out.println();
       }
    }
    
}