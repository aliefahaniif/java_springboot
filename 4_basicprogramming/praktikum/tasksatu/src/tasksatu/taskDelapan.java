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

public class taskDelapan {

    public static void main(String[] args) {
        int kali;
        
        Scanner input = new Scanner(System.in);
        System.out.println("\tTabel Perkalian \n");
        System.out.print("Masukan angka : ");
        kali = input.nextInt();
        
        if(kali<=30){
            for (int i = 1; i <= kali; i++) {

                for(int j = 1; j <= kali; j++){

                    System.out.print(" " + i * j + "\t");
                }
                System.out.print("\n\n");
            }
        }else{
            System.out.println("Angka melebihi batas");
        }
        
    }
}
