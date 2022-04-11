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
public class taskTiga {
    public static void main(String[] args) {
    int angka;
 
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka : ");
    angka = input.nextInt();
    System.out.print("Faktor dari " + angka + "  : ");
    for (int i = 1 ; i <= angka ; i++){
        if (angka%i==0){
            System.out.print(i + " ");
        }
    }
  

}
}






