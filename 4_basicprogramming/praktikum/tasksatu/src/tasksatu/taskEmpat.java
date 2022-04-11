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
public class taskEmpat {
    public static void main(String[] args) {
    int temp, angka, prima = 1, i;
 
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka : ");
    angka = input.nextInt();
    
    for (i = 2 ; i <= angka/2 ; i++){
        temp=angka%i;
           if(temp == 0)
           {
                 prima = 0;
                 break;
           }
       }
    
    if(prima == 1){
        System.out.println("Bilangan prima.");
    }else{
        System.out.println("Bukan bilangan prima.");
    }
       
    }
  }
